package edu.pdx.cs410J.bdesmond;

import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;

import java.util.Collection;

public class AppointmentBook extends AbstractAppointmentBook {
    private String owner;
    private Appointment[] appointments;

    public AppointmentBook() {
        super();
        owner = "";
        appointments = new Appointment[10]; //This number will most likely change
    }

    public AppointmentBook(String owner, Appointment[] appointments) {
        super();
        this.owner = owner;
        //I believe I will need a function to copy over the data to the new array.
        this.appointments = appointments;
    }
    @Override
    public String getOwnerName() {
        throw new UnsupportedOperationException("This method is not implemented yet");
    }

    @Override
    public Collection<AbstractAppointment> getAppointments() {
        throw new UnsupportedOperationException("This method is not implemented yet");
    }

    @Override
    public void addAppointment(AbstractAppointment abstractAppointment) {

    }
}