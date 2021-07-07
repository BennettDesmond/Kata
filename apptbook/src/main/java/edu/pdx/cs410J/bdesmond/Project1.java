package edu.pdx.cs410J.bdesmond;

/**
 * The main class for the CS410J appointment book Project
 */
public class Project1 {

  public static final String USAGE_MESSAGE = "usage: This is a command line program that needs an appointment book owner, and an appointment. An appointment needs a description and a start and end time.";

  public static void main(String[] args) {
    String name = null;
    String description = null;
    String startDate = null;
    String startTime = null;
    String start = null;
    String endDate = null;
    String endTime = null;
    String end = null;
    //AppointmentBook appointmentBook = new AppointmentBook();
    //Appointment appointment = new Appointment();  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    if(args.length == 0) {
      printErrorAndExit(USAGE_MESSAGE);
    }
    for (String arg : args) {
      if(name == null) {
        name = arg;
      } else if (description == null) {
        description = arg;
      } else if (startDate == null) {
        startDate = arg;
      } else if (startTime == null) {
        startTime = arg;
      } else if (endDate == null) {
        endDate = arg;
      } else {
        endTime = arg;
      }
    }
    start = startDate + startTime;
    end = endDate + endTime;
    Appointment appointment = new Appointment(start,end,description);
    AppointmentBook appointmentBook = new AppointmentBook(name);
    appointmentBook.addAppointment(appointment);
    System.out.println(appointmentBook);

    System.exit(0);
  }

  private static void printErrorAndExit(String message) {
    System.err.println(message);
    System.exit(1);
  }

}