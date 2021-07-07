package edu.pdx.cs410J.bdesmond;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The main class for the CS410J appointment book Project
 */
public class Project1 {

  public static final String USAGE_MESSAGE = "usage: This is a command line program that needs an appointment book owner, and an appointment. An appointment needs a description and a start and end time.";
  static final String MISSING_DESCRIPTION = "No description was given.";
  static final String MISSING_BEGINDATE = "No starting date was given.";
  static final String MISSING_BEGINTIME = "No starting time was given.";
  static final String MISSING_ENDDATE = "No ending date was given";
  static final String MISSING_ENDTIME = "No ending time was given";
  static final String INCORRECT_DATE_FORMAT = "Incorrect Date format; correct: MM/dd/yyyy";
  static final String INCORRECT_TIME_FORMAT = "Incorrect Time format; correct: 24 hour time";

  public static void main(String[] args) {
    String name = null;
    String description = null;
    String startDate = null;
    String startTime = null;
    String begin = null;
    String endDate = null;
    String endTime = null;
    String end = null;
    int numOfOptions = 0;
    boolean printFlag = false;
    //AppointmentBook appointmentBook = new AppointmentBook();
    //Appointment appointment = new Appointment();  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    if((args[0] == "-README") || (args[0] == "-print")) {
      numOfOptions++;
    }
    if((args[1] == "-README") || (args[1] == "-print")) {
      numOfOptions++;
    }
    printFlag = optionCheck(args);
    if(args.length == 0) {
      printErrorAndExit(USAGE_MESSAGE);
    } else if(args.length > (6+numOfOptions)) {
      System.err.println("Too many arguments");
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
    validateInput(name,description,startDate,startTime,endDate,endTime);
    begin = startDate + startTime;
    end = endDate + endTime;
    Appointment appointment = new Appointment(begin,end,description);
    AppointmentBook appointmentBook = new AppointmentBook(name);
    appointmentBook.addAppointment(appointment);
    System.out.println(appointmentBook);
    if(printFlag) {
      System.out.println(appointmentBook.getAppointments());
    }

    System.exit(0);
  }

  private static void printErrorAndExit(String message) {
    System.err.println(message);
    System.exit(1);
  }

  private static void validateInput(String name,String description,String startDate,String startTime,String endDate,String endTime) {
    if(name == null) {
      printErrorAndExit(USAGE_MESSAGE);
    } else if(description == null) {
      printErrorAndExit(MISSING_DESCRIPTION);
    } else if(startDate == null) {
      printErrorAndExit(MISSING_BEGINDATE);
    } else if(startTime == null) {
      printErrorAndExit(MISSING_BEGINTIME);
    } else if(endDate == null) {
      printErrorAndExit(MISSING_ENDDATE);
    } else if(endTime == null) {
      printErrorAndExit(MISSING_ENDTIME);
    }
    validateAndBuildEventDates(startDate,startTime);
    validateAndBuildEventDates(endDate,endTime);
  }

  private static boolean validateDate(String date) {
    DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    sdf.setLenient(false);
    try {
      sdf.parse(date);
    } catch (ParseException e) {
      return false;
    }
    return true;
  }

  private static boolean validateTime(String time) {
    String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
    Pattern p = Pattern.compile(regex);
    if (time == null) {
      return false;
    }
    Matcher m = p.matcher(time);
    return m.matches();
  }

  private static void validateAndBuildEventDates(String date, String time) {
    if(!validateDate(date)) {
      printErrorAndExit(INCORRECT_DATE_FORMAT);
    }
    if(!validateTime(time)) {
      printErrorAndExit(INCORRECT_TIME_FORMAT);
    }
  }

  private static boolean optionCheck(String[] args) {
    if((args[0] == "-README") || (args[1] == "-README")) {
      readMe();
    }
    if((args[0] == "-print") || (args[1] == "-print")) {
      readMe();
    }
    return true;
  }

  private static void readMe() {
    System.out.println("Bennett Desmond\n");
    System.out.println("Project 1\n");
    System.out.println("This program accepts parameters at the command line and makes" +
            "an appointment book and an appointment. This program only accepts one appointment" +
            "All parameters must be present for the project to run. The appointment book has" +
            "a name and an array of appointments, and the appointments have a description, a start time" +
            "and an end time.\n");
    System.exit(0);
  }

}