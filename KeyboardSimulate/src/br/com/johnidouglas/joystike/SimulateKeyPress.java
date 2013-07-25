package br.com.johnidouglas.joystike;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SimulateKeyPress {
	
	
	
	public static void simulateKeyPress( EnumJoystick enumJoystick  ) 
			throws AWTException, InterruptedException {
		
		new SimulateKeyPress().execute( enumJoystick );
				
	}
	
	
	// http://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html	
	private Robot robot;
	
	public SimulateKeyPress() throws AWTException {
		robot = new Robot();
	}
	
	private void pressKey( int keyCode ) {
		robot.keyPress( keyCode );
		robot.keyRelease( keyCode );		
	}
			
	public void execute( EnumJoystick enumJoystick ) throws InterruptedException {
						
		switch (enumJoystick) {
		
		case BUTTON_RED:
			pressKey( KeyEvent.VK_CONTROL );
			break;

		case DRIVRE_COTNROL_FRONT:
			pressKey( KeyEvent.VK_UP );
			
			break;		
			
		case DRIVRE_COTNROL_BACK:
			pressKey( KeyEvent.VK_DOWN );
			
			break;	
			
		case DRIVRE_COTNROL_LEFT:
			pressKey( KeyEvent.VK_LEFT );
			
			break;	
			
		case DRIVRE_COTNROL_RIGHT:
			pressKey( KeyEvent.VK_RIGHT );
			
			break;
		default:
			break;	
			
		}
		
	}
	
}
