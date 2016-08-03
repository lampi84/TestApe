package application.commands;

import org.openqa.selenium.WebElement;

import application.CommandInterpreter;

public class ClickLink extends BasicCommand {

	public ClickLink(CommandInterpreter interpreter, String command) {
		super(interpreter, command);
	}

	@Override
	public boolean execute() {
		try {
			WebElement link = interpreter.findElement(parameter[1], parameter[2]);
			link.click();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

}
