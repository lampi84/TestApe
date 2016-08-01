package application.commands;

import org.openqa.selenium.WebDriver;

import application.CommandInterpreter;

/**
 * OpenUrl opens a given URL
 * Parameterlist: 
 * - command 
 * - URL
 */
public class OpenUrl extends BasicCommand {

	public OpenUrl(CommandInterpreter interpreter, String command) {
		super(interpreter, command);
	}

	@Override
	public boolean execute() {
		WebDriver driver = interpreter.driver;
		try {
			// Open the given URL
			driver.get(parameter[1]);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

}
