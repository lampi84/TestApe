package application;

import org.openqa.selenium.WebDriver;

import application.commands.BasicCommand;
import application.commands.CloseBrowser;
import application.commands.OpenBrowser;
import application.commands.OpenUrl;

public class CommandInterpreter {
	
	public WebDriver driver;
	
	/**
	 * Initialize command interpreter with Chrome Driver as an Example
	 */
	public CommandInterpreter() {
	}
	
	public void interpret(String rawCommand){
		BasicCommand command = null;
		
		String commandType = rawCommand.split(" ")[0];
		
		switch (commandType) {
			case "openURL":			command = new OpenUrl(this, rawCommand);				
									break;
			
			case "openBrowser":		command = new OpenBrowser(this, rawCommand);				
									break;
			
			case "closeBrowser":	command = new CloseBrowser(this, rawCommand);				
									break;
	
			default:
				break;
			}
		
		// Execute interpreted command
		command.execute();
	}

}
