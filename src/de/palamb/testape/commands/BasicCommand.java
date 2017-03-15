package application.commands;

import application.CommandInterpreter;

public abstract class BasicCommand {

	CommandInterpreter interpreter;
	String rawCommand;
	String[] parameter;
	
	public BasicCommand(CommandInterpreter interpreter, String command) {
		this.interpreter = interpreter;
		this.rawCommand = command;
		
		// Fill parameterList
		parameter = rawCommand.split(" ");
		
	}
	
	public abstract boolean execute();
	
}
