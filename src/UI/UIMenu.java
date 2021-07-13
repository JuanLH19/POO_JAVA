package UI;
import model.Doctor;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Paciente patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    //showPatientMenu();
                    System.out.println("Paciente");
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Pablito", "pablito@hmail.com"));
        doctors.add(new Doctor("Rosa", "rosa@hmail.com"));
        doctors.add(new Doctor("Lalo", "lalo@hmail.com"));

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Oscar", "oscar@gmail.com"));
        pacientes.add(new Paciente("Laura", "laura@gmail.com"));
        pacientes.add(new Paciente("Omar", "omar@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType ==1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener los datos del usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }

                }
            }
            if (userType==2){
                for (Paciente p: pacientes){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        //show patient menu
                        UIPatientMenu.showPatientMenu();

                    }
                }
            }

        }while (!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
