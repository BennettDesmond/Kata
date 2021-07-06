package edu.pdx.cs410J.bdesmond;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the {@link Appointment} class.
 *
 * You'll need to update these unit tests as you build out your program.
 */
public class AppointmentTest {

  @Disabled
  @Test
  void getBeginTimeStringNeedsToBeImplemented() {
    Appointment appointment = new Appointment();
    assertThrows(UnsupportedOperationException.class, appointment::getBeginTimeString);
  }

  @Disabled
  @Test
  void initiallyAllAppointmentsHaveTheSameDescription() {
    Appointment appointment = new Appointment();
    assertThat(appointment.getDescription(), containsString("not implemented"));
  }

  @Test
  void forProject1ItIsOkayIfGetBeginTimeReturnsNull() {
    Appointment appointment = new Appointment();
    assertThat(appointment.getBeginTime(), is(nullValue()));
  }

  @Test
  void getBeginTimeStringOutputsCorrectBeginTime() {
    Appointment appointment = new Appointment("7/15/202112:00","7/15/202113:00","Meeting with Bernice");
    assertThat(appointment.getBeginTimeString(), equalTo("7/15/202112:00"));
  }

  @Test
  void getBeginTimeStringOutputsCorrectBeginTimeWhenValIsNull() {
    Appointment appointment = new Appointment();
    assertThat(appointment.getBeginTimeString(), equalTo(null));
  }

  @Test
  void getEndTimeStringOutputsCorrectEndTime() {
    Appointment appointment = new Appointment("7/15/202112:00","7/15/202113:00","Meeting with Bernice");
    assertThat(appointment.getEndTimeString(), equalTo("7/15/202113:00"));
  }

  @Test
  void getEndTimeStringOutputsCorrectEndTimeWhenValIsNull() {
    Appointment appointment = new Appointment();
    assertThat(appointment.getEndTimeString(), equalTo(null));
  }

  @Test
  void getDescriptionStringOutputsCorrectDescription() {
    Appointment appointment = new Appointment("7/15/202112:00","7/15/202113:00","Meeting with Bernice");
    assertThat(appointment.getDescription(), equalTo("Meeting with Bernice"));
  }

  @Test
  void getDescriptionStringOutputsCorrectDescriptionWhenValIsNull() {
    Appointment appointment = new Appointment();
    assertThat(appointment.getDescription(), equalTo(null));
  }

}
