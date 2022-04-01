package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.Empleado;
import application.model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EmpresaController implements Initializable {
	Empresa e;
	int posActual = 0;

	 @FXML
	    private Button btnAnterior;

	    @FXML
	    private Button btnPrimero;

	    @FXML
	    private Button btnSiguiente;

	    @FXML
	    private Button btnSubirSueldo;

	    @FXML
	    private Button btnUltimo;

	    @FXML
	    private TextField txtAnyo;

	    @FXML
	    private TextField txtDni;

	    @FXML
	    private TextField txtNombre;

	    @FXML
	    private TextField txtNombreEmpresa;

	    @FXML
	    private TextField txtSueldo;


	@FXML
	void btnAnteriorOnAction(ActionEvent event) {
		if (posActual > 0) {
			posActual--;
			actualizarFormulario();
		}

	}

	@FXML
	void btnPrimeroOnAction(ActionEvent event) {
		posActual = 0;
		actualizarFormulario();
	}

	@FXML
	void btnUltimoOnAction(ActionEvent event) {
		posActual = e.getPlantilla().size() - 1;
		actualizarFormulario();
	}

	@FXML
	void btnSiguienteOnAction(ActionEvent event) {
		if (posActual < e.getPlantilla().size() - 1) {
			posActual++;
			actualizarFormulario();
		}
	}
	@FXML
	void btnSubirSueldoOnAction(ActionEvent event) {
		try {
			Stage escenario = new Stage();
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/subirSueldo.fxml"));
			Parent root = loader.load();
			//Parent root = FXMLLoader.load(getClass().getResource("/application/view/subirSueldo.fxml"));
			
			Scene escena = new Scene(root);
			escenario.setScene(escena);
			escenario.initModality(Modality.APPLICATION_MODAL);
			
			//Iniicializar el empleado del controlador de SubirSueldo
			SubirSueldoController controlador = loader.getController();
			controlador.setEmpleado(e.getPlantilla().get(posActual));
			
			escenario.showAndWait();
			actualizarFormulario();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		e = new Empresa("Programadores en accion");
		e.contratar(new Empleado("Pepe", "348348K", 2000, 1750));
		e.contratar(new Empleado("Luis", "2222222L", 2001, 1750));
		e.contratar(new Empleado("Ana", "333333S", 2002, 1500));
		e.contratar(new Empleado("Carlos", "4444444M", 2003, 1550));
		e.contratar(new Empleado("Rocio", "5555555P", 2004, 2750));
		actualizarFormulario();
	}

	private void actualizarFormulario() {
		txtNombreEmpresa.setText(e.getNombre());
		Empleado emp = e.getPlantilla().get(posActual);
		txtDni.setText(emp.getDni());
		txtNombre.setText(emp.getNombre());
		txtSueldo.setText(""+emp.getSueldo());
		txtAnyo.setText(""+emp.getAnyo());
		
		if(posActual == 0) {
			btnPrimero.setDisable(true);
			btnAnterior.setDisable(true);
		} else {
			btnPrimero.setDisable(false);
			btnAnterior.setDisable(false);
		}
		
		if(posActual == e.getNumeroEmpleados() - 1) {
			btnUltimo.setDisable(true);
			btnSiguiente.setDisable(true);
		} else {
			btnUltimo.setDisable(false);
			btnSiguiente.setDisable(false);
		}
	}

}
