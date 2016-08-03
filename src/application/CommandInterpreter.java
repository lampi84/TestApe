package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import application.commands.BasicCommand;
import application.commands.ClickLink;
import application.commands.CloseBrowser;
import application.commands.OpenBrowser;
import application.commands.OpenUrl;
import application.commands.WaitSeconds;

public class CommandInterpreter {
	
	public WebDriver driver;
	
	/**
	 * Initialize command interpreter with Chrome Driver as an Example
	 */
	public CommandInterpreter() {
	}
	
	/**
	 * INterprets the command on the given command text
	 * @param rawCommand
	 */
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
			case "clickLink":		command = new ClickLink(this, rawCommand);				
									break;
			case "waitSec":			command = new WaitSeconds(this, rawCommand);				
									break;
			default:				break;
			}
		
		// Execute interpreted command
		command.execute();
	}
	
	/*
	 * Web element selector based on the given selection type
	 */
	public WebElement findElement(String type, String selector) {
		switch (type) {
		case "css":		return driver.findElement(By.cssSelector(selector)); 	
		case "xpath":	return driver.findElement(By.xpath(selector)); 
		case "text":	return driver.findElement(By.linkText(selector)); 
		case "text*":	return driver.findElement(By.partialLinkText(selector)); 
		case "id":		return driver.findElement(By.id(selector)); 
		}
		return null;
	}

}
