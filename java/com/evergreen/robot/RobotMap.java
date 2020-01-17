package com.evergreen.robot;

/**
 * A map mapping all the robot's elecronic component into integer ports.
 * <p>
 * 
 */
public interface RobotMap {

    //Detail Motor Components
    public interface MotorPorts {
        static final int 
            chassisRightA = 0, chassisRightB=1, chassisLeftA = 2, chassisLeftB =3;

    }
    
    //Detail Piston Components
    public interface PistonPorts {
    
        
    }
    
    //Detail Analog Components
    public interface AnalogPorts {
        
    }
    
    //Detail Digital components
    public interface DigitalPorts {
        
        
    }

    //Declare Encoder
    public interface EncoderPorts {
        
    }
    
    //Detail Joysticks used
    public interface JoystickPorts {
        static final int rightJoystick =1, leftJoystick=0;
        
    }
    
    //Detail Cameras used
    public interface CameraPorts {
    
        
    }
}