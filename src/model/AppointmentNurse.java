package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable{
    private int id;
    private Enfermera enfermera;
    private Paciente paciente;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enfermera getEnfermera() {
        return enfermera;
    }

    public void setNurse(Enfermera enfermera) {
        this.enfermera = enfermera;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPatient(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {

    }
}