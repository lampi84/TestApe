package application.commands;

import application.CommandInterpreter;

public class CloseBrowser extends BasicCommand {

	public CloseBrowser(CommandInterpreter interpreter, String command) {
		super(interpreter, command);
	}

	@Override
	public boolean execute() {
		interpreter.driver.close();
		return true;
	}

}
