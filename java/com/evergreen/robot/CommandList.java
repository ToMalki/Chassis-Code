package com.evergreen.robot;

import com.evergreen.everlib.subsystems.motors.commands.TankDrive;

/**
 * The list of all commands used by the robot, for both {@link OI} configurations
 * this shoulf be seperated into
 */
public interface CommandList extends SubsystemConstants {


    public interface ChassisCommands {
    TankDrive moveChassis = new TankDrive("chassis move", Robot.chassis, () -> (Robot.joystickLeft.getY())/2,  () -> (Robot.joystickRight.getY())/2);
    
    }

    public interface SubsystemBCommands {
    
        
    }

    public interface SubsystemCCommands {
            
    }

}