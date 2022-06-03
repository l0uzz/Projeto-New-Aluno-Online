import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class Controll {

    @FXML
    private PasswordField CampoSenha;

    @FXML
    private TextField CampoUser;

    Alert alert = new Alert(AlertType.NONE);

    @FXML
    private Button Cancel;

    @FXML
    private RadioButton CheckAluno;

    @FXML
    private RadioButton CheckRespon;

    @FXML
    private Button Enter;

    @FXML
    private ImageView EyeUnHide;

    @FXML
    private Hyperlink FirstAcess;

    @FXML
    private Hyperlink Password;

}

