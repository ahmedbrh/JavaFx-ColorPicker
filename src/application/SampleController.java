package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	public int recardre(String txt) {
		try {
			int txtint = Integer.valueOf(txt);
			if (txtint > 0 && txtint <= 255) {

				return txtint;

			} 

		} catch (Exception e) {

			System.out.println("EREEUR la valeur doit etre  entre 0 et 255 inclus");
//			return 0;
		}
return 0 ; 
	}

	@FXML
	TextField t1;
	@FXML
	TextField t2;
	@FXML
	TextField t3;
	@FXML
	TextField t5;
	@FXML
	TextArea ta;

	@FXML
	TextField tfcouleur1;
	@FXML
	TextField tfcouleur2;
	@FXML
	TextField tfcouleur3;
	@FXML
	Button btn;

	@FXML
	private void initialize() {

		t1.setText("170");
		t2.setText("170");
		t3.setText("170");

	}

	@FXML
	private void actionCalculer(ActionEvent evt) {
		try {

//			String str = String.format("0x%08X", 1) ; 
//			
//			str = t1.getText() ; 

			t5.setText(String.format("#%02x%02x%02x", recardre(t1.getText()), recardre(t2.getText()), recardre(t3.getText())));

			String couleur = (String.format("#%02x%02x%02x", recardre(t1.getText()), recardre(t2.getText()),
					recardre(t3.getText())));
			ta.setStyle("-fx-control-inner-background :" + couleur);
		} catch (Exception e) {
			System.out.println("l'erreur est ici "); //so fkn clever !
		}

	}

}
