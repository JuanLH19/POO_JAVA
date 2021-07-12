import java.util.Date;
import static UI.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        /*
        Doctor myDoctor = new Doctor();//Declarando e instanciando un objeto

        myDoctor.name = "Juan Leyva";//Le asignamos un valor al objeto, en esta caso name
        myDoctor.speciality = "Cirujano";
        myDoctor.showName();//Usando nuestro objeto, mandamos a llamar el metodo
        myDoctor.showId();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Luis Leyva";
        myDoctor2.showName();
        myDoctor2.showId();
        */
        //showMenu();
        Doctor myDoctor = new Doctor("Juan Leyva", "leyvajuan@hotmail.com", "Cirujano Plastico");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+ " "+ aA.getTime() );
        }
        Paciente paciente = new Paciente("Alicia Jaramillio", "jaso@gmail.com");
        Paciente paciente2 = new Paciente("Luis Leyva", "luis@gmail.com");
        System.out.println(paciente);


    }
}
