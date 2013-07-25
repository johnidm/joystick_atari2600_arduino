package br.com.johnidouglas.joystike;



public class ConvertSketchArduino {
	
	//http://playground.arduino.cc/Interfacing/Java
		
	public EnumJoystick toKeyJoystick(String command) {
						
		if ( command.equals( "PUSH_UP" ) ) {
			return EnumJoystick.DRIVRE_COTNROL_FRONT;
		} else if ( command.equals( "PUSH_DOWN" ) ) {
			return EnumJoystick.DRIVRE_COTNROL_BACK;
		} else if ( command.equals( "PUSH_LEFT" ) ) {
			return EnumJoystick.DRIVRE_COTNROL_LEFT;
		} else if ( command.equals( "PUSH_RIGHT" ) ) {
			return EnumJoystick.DRIVRE_COTNROL_RIGHT;
		} else if ( command.equals( "PUSH_BUTTON" ) ) {
			return EnumJoystick.BUTTON_RED;
		} else {			
			return EnumJoystick.EMPTY;
		}	
		
	}
	

}
