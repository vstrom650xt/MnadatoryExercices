package persona;

import persona.SexType;

public class Persona {

    private String dni;


    public void setSexType(SexType sexType) {

        this.sexType = sexType;

    }


    private SexType sexType;
    private double weight;
    private double height;

    //estos los pone cuando se construye el objeto
    private final String name;
    private final String lastName;
    private final int age;

    boolean withDni;




    public Persona(String name, String lastname, int age,  double weight, double height,SexType sexType){
        this.name =name;
        this.lastName =lastname;
        this.age =age;
        this.dni=generateDni();
        this.sexType = sexType;
        this.weight = weight;
        this.height =height;
        this.withDni=true;


    }




    public Persona(String nombre, String apellidos, int edad) {
        this.name = nombre;
        this.lastName = apellidos;
        this.age = edad;
        this.sexType = SexType.NO;



    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public int getAge() {
        return age;
    }
    public int calcularIMC() {
        final int bajoPeso = -1;
        final int rangoNormal = 0;
        final int sobrePeso = 1;
        final int obeso = 2;

        double peso = getWeight();
        double altura = getHeight();

        double result = peso / (altura*altura);
        System.out.println(result);

        if (result < 18.5) {
            return  bajoPeso;
        } else if (result >18.5 && result < 24.99) {
            return rangoNormal;
        } else if (result > 25 && result < 29.99) {
            return sobrePeso;
        } else {
            return obeso;
        }

    }


    public boolean esMayorDeEdad() {
         int edad = getAge();
        return edad > 18;
    }
    private static String generateNumber() {
        String numeros = "";
        for (int i = 0; i < 8; i++) {
            numeros += (int) (Math.random() * 10);
        }
        return numeros;
    }

    private static char dniLetter(String numDni) {
        int dni = Integer.parseInt(numDni);
        char[] caracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        return caracteres[resto];
    }

    private  String generateDni() {
        String numDni = generateNumber();
        char letra = dniLetter(numDni);
        return numDni + letra;
    }

    @Override
    public String toString() {

        if (withDni){

            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", sexType=" + sexType +
                    ", peso=" + weight +
                    ", altura=" + height +
                    ", nombre='" + name + '\'' +
                    ", apellidos='" + lastName + '\'' +
                    ", edad=" + age +
                    '}';
        }else{
            return "Persona{" +
                    ", nombre='" + name + '\'' +
                    ", apellidos='" + lastName + '\'' +
                    ", edad=" + age +
                    '}';
        }

    }


}
