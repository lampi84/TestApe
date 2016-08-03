package application.commands;

import application.CommandInterpreter;

public class WaitSeconds extends BasicCommand {

	public WaitSeconds(CommandInterpreter interpreter, String command) {
		super(interpreter, command);
	}

	@Override
	public boolean execute() {
		try {
			//Set waiting time in millisecond
			Long waitTime = Long.valueOf(parameter[1]) * 1000;
			Thread.sleep(waitTime);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

}
