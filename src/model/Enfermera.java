package model;

public class Enfermera extends Usuario{
    private String speciality;

    public Enfermera(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Farallón");
        System.out.println("Departamento: Pediatría");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
