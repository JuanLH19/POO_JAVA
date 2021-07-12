import java.util.ArrayList;
import java.util.Date;
public class Doctor extends Usuario {
    /* Atributos*/
    private String speciality;


    Doctor(String name, String email, String speciality){
        super(name,email);
        System.out.println("El nombre del Doctor asignado es: "+name);
        System.out.println("Y su especialidad es: "+speciality);
        this.speciality = speciality;
    }

    /* Comportamientos*/

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time) );
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
    }
}
