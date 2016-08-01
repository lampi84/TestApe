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
			case "chrome" : // TODO To be set as relative path
							System.setProperty("webdriver.chrome.driver","C:\\Users\\patric\\workspace\\TestApe\\drivers\\chromedriver.exe");
							interpreter.driver = new ChromeDriver();
							break;
		}
		
		return true;
	}

}
