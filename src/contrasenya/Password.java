package contrasenya;

public class Password {

    //de 48 a 122
    private int longitud;
    private  String contrasenya;
    private static final int defLongitu = 10;

    //fuerte
    public Password() {
        this.longitud = defLongitu;
        do {
            this.contrasenya = generarPassword();


        }while (!esFuerte());


    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenya = generarPassword();

    }

    public String generarPassword() {
        String pass = "";
        char aux = ' ';

        for (int i = 0; i < longitud; i++) {
            aux += (char) (Math.floor(Math.random() * (48 - 122 + 1) + 122));

            while (!(aux > 48 && aux<57 ||aux>65 &&aux<90 ||aux>97 && aux<122 )){
                aux += (char) (Math.floor(Math.random() * (48 - 122 + 1) + 122));
            }
            pass+= aux;


        }
        return pass;
    }


    public    boolean esFuerte() {
        int contCap = 0, contLow = 0, contNum = 0;

        for (int i = 0; i < contrasenya.length(); i++) {
            if (contrasenya.charAt(i) > 48 && contrasenya.charAt(i) < 57) {
                contNum++;
            } else if (contrasenya.charAt(i) > 65 && contrasenya.charAt(i) < 90) {
                contCap++;
            } else if (contrasenya.charAt(i) > 97 && contrasenya.charAt(i) < 122) {
                contLow++;
            }

        }

        return contCap >= 2 && contLow >= 1 && contNum > 4;
    }


    @Override
    public String toString() {
        return  contrasenya;
    }


}
