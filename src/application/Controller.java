package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable {
	
	CommandInterpreter interpreter;
	
	@FXML
	TextField field_command;
	
	@FXML
	ListView<String> list_executedCommands;
	ObservableList<String> executedCommands = FXCollections.observableArrayList();   
	
	@FXML
	ListView<String> list_recordedCommands;
	ObservableList<String> recordedCommands = FXCollections.observableArrayList();   
	
	@FXML
	ListView<String> list_log;
	
	@FXML
	Button btn_commandExecute;
	
	@FXML
	protected void executeCommand(){
		String command = field_command.getText();
		executedCommands.add(command);
		interpreter.interpret(command);
		field_command.clear();
	}
	
	@FXML
	protected void commandFieldAction(KeyEvent key){
		if (key.getCode() == KeyCode.ENTER) {
			executeCommand();
		
		// On UP get last command from list
		}else if (key.getCode() == KeyCode.UP) {
			if(executedCommands.size() > 0){
				String lastCommand = executedCommands.get(executedCommands.size()-1);
				field_command.setText(lastCommand);
			}			
		}
	}
	
	@FXML
	protected void recordCommand(){
		String selectedCommand = list_executedCommands.getSelectionModel().getSelectedItem();
		recordedCommands.add(selectedCommand);
	}
	

	@FXML
	protected void removeRecordedCommand(){
		int selctedIndex = list_recordedCommands.getSelectionModel().getSelectedIndex();
		recordedCommands.remove(selctedIndex);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list_executedCommands.setItems(executedCommands);	
		list_recordedCommands.setItems(recordedCommands);
		
		interpreter = new CommandInterpreter();
	}
}
