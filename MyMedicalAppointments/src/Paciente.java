public class Paciente extends Usuario {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Paciente(String name, String email){//Metodo constructor
        super(name, email);//da una mejor legibilidad
        System.out.println();
    }

    public void setWeight(double weight){//vamos a recibir un dato creando nuestro metodo set
        this.weight = weight;
    }
    public String getWeight(){//creamos el metodo get que nos devolvera un valor
        return this.weight + " Kg. ";
    }
    public void setHeight(double height){
        this.height = height;
    }

    public String getHeight(){
        return this.height + " m. ";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Edad: "+birthday+"\n Peso: "+getWeight()+
                "\n Altura: "+getHeight()+"\n Tipo sangre: "+blood;
    }
}
