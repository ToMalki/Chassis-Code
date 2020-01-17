package com.evergreen.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.evergreen.everlib.subsystems.motors.subsystems.MotorController;
import com.evergreen.everlib.subsystems.motors.subsystems.MotorController.ControllerType;

/**
 * SubsystemComponents
 */
public interface SubsystemComponents extends RobotMap {

    /**
     * SubsystemAComponents
     */
    public interface ChassisComponents {
        MotorController chassisRight = new MotorController(
            new MotorController(ControllerType.TALON_SRX,MotorPorts.chassisRightB),new MotorController(ControllerType.VICTOR_SPX,MotorPorts.chassisRightA));

        MotorController chassisLeft = new MotorController(
            new MotorController(ControllerType.TALON_SRX,MotorPorts.chassisLeftB),new MotorController(ControllerType.VICTOR_SPX,MotorPorts.chassisLeftA));
    }

    /**
     * SubsystemBComponents
     */
    public interface SubsystemBComponents {
            
    }


    /**
     * SubsystemCComponents
     */
    public interface SubsystemCComponents {
    
        
    }
}