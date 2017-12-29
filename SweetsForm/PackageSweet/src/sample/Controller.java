package sample;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    //Form sample.fxml
    @FXML
    private ChoiceBox cbox;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private TextField weight;

    @FXML
    private TextField uniqParam;

    @FXML
    private TextArea tArea;

    @FXML
    private Label lbTotal;

    //Actions
    @FXML
    private void toolTipComboBox(){
        cbox.setTooltip(new Tooltip("Select the sweets"));
    }

    //Form CreateFile.fxml
    @FXML
    private Button btnCreateFileNew;

    @FXML
    private Button btnCreateFileOld;

    @FXML
    private Button btnCreateFileClose;

    String pathBackup = "BackUp/";


    private Pack p = new Pack();
    private SaveInFile s = new SaveInFile();


    @FXML
    private void saveSweetInPack() throws Exception {

        switch (cbox.getSelectionModel().getSelectedIndex()) {
            case 0:
                    p.addSweetInPack(new Sweet(name.getText(), Double.parseDouble(price.getText()), Double.parseDouble(weight.getText())));
                break;
            case 1:
                p.addSweetInPack(new Cake(name.getText(), Double.parseDouble(price.getText()), Double.parseDouble(weight.getText()), uniqParam.getText()));
                break;
            case 2:
                p.addSweetInPack(new Candy(name.getText(), Double.parseDouble(price.getText()), Double.parseDouble(weight.getText()), Integer.parseInt(uniqParam.getText())));
                break;
            case 3:
                p.addSweetInPack(new Chocolate(name.getText(), Double.parseDouble(price.getText()), Double.parseDouble(weight.getText()), Integer.parseInt(uniqParam.getText())));
                break;

        }
        tArea.appendText(p.whatInThePackages() + "\n");
        lbTotal.setText(p.mainCharacteristic());
        s.saveinFile(p.getSweet());
    }

    @FXML
    private void contextRequest(){

        cbox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number oldNum, Number newNum )->{
                    switch (cbox.getSelectionModel().getSelectedIndex()){

                        case 0:
                            name.setDisable(false); name.setOpacity(1);
                            price.setDisable(false); price.setOpacity(1);
                            weight.setDisable(false); weight.setOpacity(1);
                            uniqParam.setDisable(true); uniqParam.setOpacity(0.4);

                            break;
                        case 1:
                            name.setDisable(false); name.setOpacity(1);
                            price.setDisable(false); price.setOpacity(1);
                            weight.setDisable(false); weight.setOpacity(1);
                            uniqParam.setDisable(false); uniqParam.setOpacity(1);

                            break;
                        case 2:
                            name.setDisable(false); name.setOpacity(1);
                            price.setDisable(false); price.setOpacity(1);
                            weight.setDisable(false); weight.setOpacity(1);
                            uniqParam.setDisable(false); uniqParam.setOpacity(1);

                            break;
                        case 3:
                            name.setDisable(false); name.setOpacity(1);
                            price.setDisable(false); price.setOpacity(1);
                            weight.setDisable(false); weight.setOpacity(1);
                            uniqParam.setDisable(false); uniqParam.setOpacity(1);

                            break;
                    }
                });
    }

    //Изменяем название старого файла на дату + системное время и перекладываем в папку pathBackUp
    @FXML
    private void backupOldFile() throws IOException {
        Stage stage = (Stage)btnCreateFileNew.getScene().getWindow();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_hhmmss");
        File file = new File( "SweetsPackage.txt");
        File newFile = new File (pathBackup + "SweetsPackage" + format.format(new Date()) + ".txt");
        file.renameTo(newFile);

        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = new Stage();
        stage.setTitle("Choice Sweets");
        stage.setScene(new Scene(root, 416, 294));
        stage.show();
    }

    //Добавляем в старый файл
    @FXML
    private void addInOldFile() throws IOException{
        Stage stage = (Stage)btnCreateFileOld.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = new Stage();
        stage.setTitle("Choice Sweets");
        stage.setScene(new Scene(root, 416, 294));
        stage.show();
    }

    //просто закрыть
    @FXML
    private void closeProgramm(){
        Stage stage = (Stage)btnCreateFileClose.getScene().getWindow();
        stage.close();
    }
}

