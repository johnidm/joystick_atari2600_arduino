package br.com.johnidouglas.joystike;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class MainJoystick {

	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
			
		while (true) {
		
			Thread.sleep( 5000 );			
			SimulateKeyPress.simulateKeyPress( EnumJoystick.DRIVRE_COTNROL_BACK );
			System.out.println("Enviou");
			
		}
		
		
	}
	
	

}
