package application.controller;

import application.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SubirSueldoController {
	private Empleado e;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtPorcentajeSubida;

    @FXML
    private TextField txtSueldoActual;

    @FXML
    void btnAceptarOnAction(ActionEvent event) {
    	double porcentaje = 0;
    	try {
    		porcentaje = Double.parseDouble(txtPorcentajeSubida.getText());
    		e.incrementarSueldo(porcentaje);
        	Node nodo = (Node) event.getSource();
        	//Node nodo = (Node) btnAceptar;
        	nodo.getScene().getWindow().hide();
    	} catch (NumberFormatException e) {
    		
    	}
    	
    	
    	
    }

    @FXML
    void btnCancelarOnAction(ActionEvent event) {
    	Node nodo = (Node) event.getSource();
    	//Node nodo = (Node) btnAceptar;
    	nodo.getScene().getWindow().hide();
    }
    
    public void setEmpleado(Empleado e) {
    	this.e = e;
    	actualizarFormulario();
    }
    public Empleado getEmpleado() {
    	return e;
    }
    private void actualizarFormulario() {
    	txtSueldoActual.setText("" + e.getSueldo());
    	
    }

}
