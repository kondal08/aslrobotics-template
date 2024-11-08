package frc.robot.subsystems.pivot;

import org.littletonrobotics.junction.AutoLog;

public interface PivotIO {
  @AutoLog
  public static class PivotIOInputs {
    public double pivotPositionRad = 0.0;
    public double pivotVelocityRadPerSec = 0.0;
    public double pivotAppliedVolts = 0.0;
    public double[] pivotCurrentAmps = new double[] {};
  }

  /** Updates the set of loggable inputs. */
  public void updateInputs(PivotIOInputs inputs);

  /** Run open loop at the specified voltage. */
  public void setVoltage(double volts);

  /** Run closed loop at the specified velocity. */
  public void setPosition(double angleRad, double ffVolts);

  /** Stop in open loop. */
  public default void stop() {}

  /** Set position PID constants. */
  public void configurePID(double kP, double kI, double kD);
}
