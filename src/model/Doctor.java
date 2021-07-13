package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Doctor extends Usuario {
    /* Atributos*/
    private String speciality;


    public Doctor(String name, String email){
        super(name,email);
        //System.out.println("El nombre del Doctor asignado es: "+name);

    }

    /* Comportamientos*/

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }



    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time) );
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Especialidad: "+speciality+"\nDisponible: "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Farallón");
        System.out.println("Departamento: Cirugías");

    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDate(String DATE){
            return date;
        }

        public String getDate() {

            return format.format(date);
        }

        public String getTime() {
            return time;
        }

        @Override
        public String toString() {
            return "\nCitas Disponibles \nFecha: "+date+"n Hora: "+time;
        }
    }
}
