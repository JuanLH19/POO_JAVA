package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido "+UIMenu.doctorLogged.getName());
            System.out.println("1. Añadir cita disponible");
            System.out.println("2. Mi calendario de citas");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response !=0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("Añade una cita disponible");
            System.out.println("Selecciona un mes: ");

            for (int i = 0; i < 3; i++) {
                int j= i+1;
                System.out.println(j+". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response >0 && response <4){
                int monthSelected = response;
                System.out.println(monthSelected+" . "+UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Inserta la fecha disponible: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Es tu fecha: "+ date+ "\n 1.-Correcta \n2. Cambiar fecha");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time ="";
                do{
                    System.out.println("Inserte el tiempo disponible para la cita: "+date);
                    time = sc.nextLine();
                    System.out.println("Tu hora es: "+time+"\n1. Correcto \n2. Cambiar");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime==2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);


            }else if(response==0){
                showDoctorMenu();
            }
        }while (response!=0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size()>0
        && !doctorAvailableAppointments.contains(doctor)){
            doctorAvailableAppointments.add(doctor);
        }
    }
}
