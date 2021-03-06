package org.usfirst.frc2408.robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController turnLFT;
    public static SpeedController turnRFT;
    public static SpeedController turnLBT;
    public static SpeedController turnRBT;
    public static RobotDrive turnsTrain;
    public static AnalogInput turnLFTE;
    public static AnalogInput turnRFTE;
    public static AnalogInput turnLBTE;
    public static AnalogInput turnRBTE;
    public static SpeedController driveLFM;
    public static SpeedController driveRFM;
    public static SpeedController driveLBM;
    public static SpeedController driveRBM;
    public static RobotDrive drivedTrain;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        turnLFT = new Spark(0);
        LiveWindow.addActuator("Turn", "LFT", (Spark) turnLFT);
        
        turnRFT = new Spark(1);
        LiveWindow.addActuator("Turn", "RFT", (Spark) turnRFT);
        
        turnLBT = new Spark(2);
        LiveWindow.addActuator("Turn", "LBT", (Spark) turnLBT);
        
        turnRBT = new Spark(3);
        LiveWindow.addActuator("Turn", "RBT", (Spark) turnRBT);
        
        turnsTrain = new RobotDrive(turnLFT, turnLBT,
              turnRFT, turnRBT);
        
        turnsTrain.setSafetyEnabled(true);
        turnsTrain.setExpiration(0.1);
        turnsTrain.setSensitivity(0.5);
        turnsTrain.setMaxOutput(1.0);

        turnLFTE = new AnalogInput(0);
        LiveWindow.addSensor("Turn", "LFTE", turnLFTE);
        
        turnRFTE = new AnalogInput(1);
        LiveWindow.addSensor("Turn", "RFTE", turnRFTE);
        
        turnLBTE = new AnalogInput(2);
        LiveWindow.addSensor("Turn", "LBTE", turnLBTE);
        
        turnRBTE = new AnalogInput(3);
        LiveWindow.addSensor("Turn", "RBTE", turnRBTE);
        
        driveLFM = new Spark(4);
        LiveWindow.addActuator("Drive", "LFM", (Spark) driveLFM);
        
        driveRFM = new Spark(5);
        LiveWindow.addActuator("Drive", "RFM", (Spark) driveRFM);
        
        driveLBM = new Spark(6);
        LiveWindow.addActuator("Drive", "LBM", (Spark) driveLBM);
        
        driveRBM = new Spark(7);
        LiveWindow.addActuator("Drive", "RBM", (Spark) driveRBM);
        
        drivedTrain = new RobotDrive(driveLFM, driveLBM,
              driveRFM, driveRBM);
        
        drivedTrain.setSafetyEnabled(true);
        drivedTrain.setExpiration(0.1);
        drivedTrain.setSensitivity(0.5);
        drivedTrain.setMaxOutput(1.0);
