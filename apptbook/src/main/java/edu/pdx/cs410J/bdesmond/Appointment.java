package edu.pdx.cs410J.bdesmond;

import edu.pdx.cs410J.AbstractAppointment;

public class Appointment extends AbstractAppointment {
  private String beginTime;
  private String endTime;
  private String description;

  public Appointment() {
    super();
    this.beginTime = null;
    this.endTime = null;
    this.description = null;
  }

  public Appointment(String beginTime, String endTime, String description) {
    super();
    this.beginTime = beginTime;
    this.endTime = endTime;
    this.description = description;
  }

  @Override
  public String getBeginTimeString() {
    return beginTime;
  }

  @Override
  public String getEndTimeString() {
    return endTime;
  }

  @Override
  public String getDescription() {
    return description;
  }
}
