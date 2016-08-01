package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import application.commands.BasicCommand;
import application.commands.OpenUrl;

public class CommandInterpreter {
	
	public WebDriver driver;
	
	/**
	 * Initialize command interpreter with Chrome Driver as an Example
	 */
	public CommandInterpreter() {
		// TODO To be set as relative path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patric\\workspace\\TestApe\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void interpret(String rawCommand){
		BasicCommand command = null;
		
		String commandType = rawCommand.split(" ")[0];
		
		switch (commandType) {
			case "openURL":		command = new OpenUrl(this, rawCommand);				
								break;
	
			default:
				break;
			}
		
		// Execute interpreted command
		command.execute();
	}

}
