import static UI.UIMenu.*;
import model.Doctor;
import model.ISchedulable;
import model.Paciente;
import model.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        model.Doctor myDoctor = new model.Doctor();//Declarando e instanciando un objeto

        myDoctor.name = "Juan Leyva";//Le asignamos un valor al objeto, en esta caso name
        myDoctor.speciality = "Cirujano";
        myDoctor.showName();//Usando nuestro objeto, mandamos a llamar el metodo
        myDoctor.showId();

        model.Doctor myDoctor2 = new model.Doctor();
        myDoctor2.name = "Luis Leyva";
        myDoctor2.showName();
        myDoctor2.showId();
        */
        showMenu();
        /*
        Doctor myDoctor = new Doctor("Juan Leyva", "leyvajuan@hotmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        System.out.println(myDoctor);
        Usuario usuario = new Doctor("José Montero", "Montero@infinitum.com");
        usuario.showDataUser();

        Usuario usuario2 = new Paciente("Marta Hernández", "mhn@gmail.com");
        usuario2.showDataUser();
        Usuario usuario1 = new Usuario("Anahi", "ann@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Magallanes");
                System.out.println("Departamento: Nutrición");
            }
        };

        usuario1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        */
        /*for(model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+ " "+ aA.getTime() );
        }*/
        /*
        Paciente paciente = new Paciente("Alicia Jaramillio", "jaso@gmail.com");
        Paciente paciente2 = new Paciente("Luis Leyva", "luis@gmail.com");
        System.out.println(paciente);
        */

    }
}
