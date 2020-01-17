/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.evergreen.robot;

import java.util.List;

import com.evergreen.everlib.CommandEG;
import com.evergreen.everlib.oi.joysticks.ExtremeProJoystick;
import com.evergreen.everlib.shuffleboard.loggables.DashboardStreams;
import com.evergreen.everlib.structure.Tree;
import com.evergreen.everlib.subsystems.motors.commands.TankDrive;
import com.evergreen.everlib.subsystems.motors.subsystems.DriveTank;
import com.evergreen.everlib.subsystems.motors.subsystems.MotorSubsystem;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;

/**
 * This is the class representing our robot!
 * <p>
 * It contains each of its subsystems, and the code it runs at each stage of the game.
 * <p>
 * created and constructed in {@link Main} - The code actually ran.
 * The DriverStation will call each game stage corresponding <code>init()</code> method at its start,
 * and then repeatedly call its <code>periodic()</code> method. 
 * <p>
 * <b>Note That these methods aren't overriden in here, and it is preferable to only use the supplied {@link Tree} methods for
 * organizing the robot code.</b>
 */
public class Robot extends Tree implements SubsystemComponents {

  
  //----------Subsystem Declerations----------
  //-----Motor Subsystems-----
  // public static final MotorSubsystem subsystemA = new MotorSubsystem(...);
  // public static final MotorSubsystem subsystemB = new MotorSubsystem(...);
   public static final DriveTank chassis = new DriveTank("chassis",ChassisComponents.chassisLeft,ChassisComponents.chassisRight);

  //-----Piston Subsytem-----
  // public static final PistonSubsystem subsystemC = new PistonSubsystem(..);
  
  //-----Joysticks-----
  // public static final F310Gamepad joystickButton = new F310Gamepad(...)
   public static final Joystick joystickLeft = new Joystick(JoystickPorts.leftJoystick);
   public static final Joystick joystickRight = new Joystick(JoystickPorts.rightJoystick);

  //-----Network Tables-----
  // public final NetworkTable imageProccesing = NetworkTableInstance.getDefault().getTable("...");


  @Override
  protected void componentSetup() {
    // SubsystemAComponents.motors.setInverted(...);
  }
  
  
  @Override
  protected void bindButtons() {
    
    // joystickButton.getButton(F310.X).whenPressed(...)
    
  }
  
  @Override
  protected void commandConfig() {
    //subsystem.setDefaultCommand(...)
    chassis.setDefaultCommand(CommandList.ChassisCommands.moveChassis);
  }
  
  @Override
  protected void log() {
    // DashboardStreams.addLoggable(...);
    // DashboardStreams.addDouble(...)
  }
  
  @Override
  protected void whenEnabled() {
    // SubsystemC.setForward();
  }

  @Override
  protected void test() {
    //SubsystemA.move(...);
  }
  
  @Override
  protected void autoConfig() {    
    // subsystem.setDefaultCommand(...)
  }

  @Override
  protected void teleopConfig() {
    // subsystem.setDefaultCommand(...)
  }

  @Override
  protected List<CommandEG> getAutoCommands() {
    // return List.of (...);
    return super.getAutoCommands();
  }

  @Override
  protected List<CommandEG> getTeleopCommands() {
    // return List.of(...);
    return super.getTeleopCommands();
  }


}
