package application.commands;

import org.openqa.selenium.chrome.ChromeDriver;

import application.CommandInterpreter;

public class OpenBrowser extends BasicCommand {

	public OpenBrowser(CommandInterpreter interpreter, String command) {
		super(interpreter, command);
	}

	@Override
	public boolean execute() {
		
		switch (parameter[1]) {
			case "chrome" : // Getting directory path
							java.io.File file = new java.io.File("");
							String chromeDriverPath = file.getAbsolutePath() + "\\drivers\\chromedriver.exe";
							System.setProperty("webdriver.chrome.driver", chromeDriverPath);
							interpreter.driver = new ChromeDriver();
							break;
		}
		
		return true;
	}

}
