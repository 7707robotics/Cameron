/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private DoubleSupplier forwardPower, turnPower;
  private DifferentialDrive drive;

  public DriveSubsystem(DoubleSupplier forwardPower, DoubleSupplier turnPower, DifferentialDrive drive) {
    this.forwardPower = forwardPower;
    this.turnPower = turnPower;
    this.drive = drive;
  }

  public void drive() {
    drive.arcadeDrive(forwardPower.getAsDouble(), turnPower.getAsDouble(), true);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
