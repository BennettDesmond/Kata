package edu.pdx.cs410J.bdesmond;

import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;

import java.util.Collection;
import java.util.LinkedList;

public class AppointmentBook extends AbstractAppointmentBook {
    private String owner;
    private LinkedList<Appointment> appointments;

    public AppointmentBook() {
        super();
        owner = null;
        appointments = new LinkedList<Appointment>();
    }

    public AppointmentBook(String owner) {
        super();
        this.owner = owner;
        appointments = new LinkedList<Appointment>();
    }

    public AppointmentBook(String owner, Collection<Appointment> appointments) {
        super();
        this.owner = owner;
        this.appointments = (LinkedList) appointments;
    }

    @Override
    public String getOwnerName() {
        return owner;
    }

    @Override
    public Collection<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public void addAppointment(AbstractAppointment abstractAppointment) {
        appointments.add((Appointment) abstractAppointment);
    }
}