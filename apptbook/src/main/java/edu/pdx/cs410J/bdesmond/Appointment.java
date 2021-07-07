package edu.pdx.cs410J.bdesmond;

import edu.pdx.cs410J.AbstractAppointment;

/**
 * This class extends the abstractAppointment class.
 * It holds the data for an appointment and the necessary
 * methods to manage the data.
 */
public class Appointment extends AbstractAppointment {
  private String beginTime;
  private String endTime;
  private String description;

  /**
   * This is the constructor without parameters for the Appointment class.
   */
  public Appointment() {
    super();
    this.beginTime = null;
    this.endTime = null;
    this.description = null;
  }

  /**
   * This is the constructor with parameters for the appointment class.
   * @param beginTime
   *        This is when the event begins
   * @param endTime
   *        This is when the event ends
   * @param description
   *        This parameter gives a description of the appointment
   */
  public Appointment(String beginTime, String endTime, String description) {
    super();
    this.beginTime = beginTime;
    this.endTime = endTime;
    this.description = description;
  }

  /**
   * This function is the getter for the beginning time of the appointment.
   * @return
   *        The beginning time of the appointment
   */
  @Override
  public String getBeginTimeString() {
    return beginTime;
  }

  /**
   * This function is the getter for the end time of the appointment
   * @return
   *        The end time of the appointment
   */
  @Override
  public String getEndTimeString() {
    return endTime;
  }

  /**
   * This function is the getter for the description of the appointment
   * @return
   *        The description of the appointment
   */
  @Override
  public String getDescription() {
    return description;
  }
}
