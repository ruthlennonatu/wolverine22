package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import java.io.FileInputStream;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.FontWeight;

public class L00143357 extends Application {

         private Scene scene;
         private BorderPane sceneLayout;
         private TextField FirName;
         private TextField SurName;
         private PasswordField SignUpPas;
         private PasswordField LoginPass;
         private Button SignBtn; 
         private Button LoginBtn;
         private TextField EmailLogin;
         private TextField SignEmail;

         @Override
         public void start(Stage primaryStage) throws Exception {
         //Scene layout 
         sceneLayout = new BorderPane();
         scene = new Scene(sceneLayout, 500, 120);
         sceneLayout.setRight(getRightFields());
         sceneLayout.setTop(getTopFields());
         sceneLayout.setCenter(getCentreImage());
         //Title 
         primaryStage.setScene(scene);
         primaryStage.setTitle("FACEBOOK");
         primaryStage.show();
            LoginBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            //LOGIN alert
            public void handle(ActionEvent e){
                Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
               
               //alertmessage
                     infoAlert.setHeaderText("LOGIN DETAILS ENTERED ARE");
                     infoAlert.setTitle("Information Message");
                     infoAlert.setContentText("USERNAME: " + EmailLogin.getText() +
                        "\nPASSWORD: " + LoginPass.getText());
                     infoAlert.showAndWait();}});

                   SignBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            //SIGNUP alert
            public void handle(ActionEvent e){
                Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                
                //alertmessage
                  infoAlert.setHeaderText("SIGNUP DETAILS");
                  infoAlert.setTitle("Information Message");
                  infoAlert.setContentText(FirName.getText() + " " + SurName.getText() + "\n" +
                  SignEmail.getText() + "\n" + SignUpPas.getText());
                  infoAlert.showAndWait();}});
                  }
      private GridPane getTopFields(){//TopColumns
        GridPane gridPane = new GridPane();
      //Column Split 20,20,20,20,20
        for(int i = 0; i < 5; i++){
            ColumnConstraints column = new ColumnConstraints();
            //column width
               column.setPercentWidth(20);
               gridPane.getColumnConstraints().add(column);
        }
        Label lblEmail = new Label(" Email:");
        lblEmail.setPrefWidth(120);
        //email displayed at top
        gridPane.add(lblEmail, 0, 0);
         EmailLogin = new TextField();
       //width
        EmailLogin.setPrefWidth(120);
        gridPane.add(EmailLogin, 1, 0);
        //password at top
        Label lblPassword = new Label(" Password:");
        lblPassword.setPrefWidth(120);
        gridPane.add(lblPassword, 2, 0);
        LoginPass = new PasswordField();
       //password field not displayed 
        LoginPass.setPrefWidth(120);
        gridPane.add(LoginPass, 3, 0);
         LoginBtn = new Button("Login");
        //login button displayed at the top Light blue
        LoginBtn.setPrefWidth(120);
        //Implementing the colour
        LoginBtn.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
          gridPane.add(LoginBtn, 4, 0);
          gridPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,BorderWidths.DEFAULT)));

        return gridPane;
    }
   //facebook imagery 
    private ImageView getCentreImage() throws Exception{
        FileInputStream input = new FileInputStream("image/facebook.png");
        Image image = new Image(input);
        return new ImageView(image);         
    }
   //sign up right text field 
    private VBox getRightFields(){
        VBox vBox = new VBox();
        vBox.setPrefWidth(150);//width
        Label lblSignUp = new Label("Sign Up");//sign up
        lblSignUp.setPrefWidth(Double.MAX_VALUE);
        lblSignUp.setFont(Font.font("SanSerif", FontWeight.BOLD, 18));//font 
        lblSignUp.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
        BorderWidths.DEFAULT)));
        vBox.getChildren().add(lblSignUp);
        //FirstName 
        FirName = new TextField();
        FirName.setPromptText("Enter First name");
        FirName.setPrefWidth(Double.MAX_VALUE);
        vBox.getChildren().add(FirName);
        //SecondName 
        SurName = new TextField();
        SurName.setPromptText("Enter Surname");
        SurName.setPrefWidth(Double.MAX_VALUE);
        vBox.getChildren().add(SurName);
        //Email 
        SignEmail = new TextField();
        SignEmail.setPromptText("Enter Email address");
        SignEmail.setPrefWidth(Double.MAX_VALUE);
        vBox.getChildren().add(SignEmail);
        //password Password field 
        SignUpPas = new PasswordField();
        SignUpPas.setPromptText("Enter Password");
        SignUpPas.setPrefWidth(Double.MAX_VALUE);
        vBox.getChildren().add(SignUpPas);
       //sign up button 
        SignBtn = new Button("Sign Up");
        SignBtn.setPrefWidth(Double.MAX_VALUE);
        SignBtn.setFont(Font.font("SanSerif", FontWeight.BOLD, 18));//font
        //Button colour
        SignBtn.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        vBox.getChildren().add(SignBtn);

        return vBox;
    }
}
