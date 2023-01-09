package contrasenya;

public class Password {

    //de 48 a 122
    private int longitud;

    public static String getContrasenya() {
        return contrasenya;
    }

    private static String contrasenya;
    private static final int defLongitu = 10;

    //fuerte
    public Password() {
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

        for (int i = 0; i < defLongitu; i++) {
            aux += (char) (Math.floor(Math.random() * (48 - 122 + 1) + 122));

            while (!(aux > 48 && aux<57 ||aux>65 &&aux<90 ||aux>97 && aux<122 )){
                aux += (char) (Math.floor(Math.random() * (48 - 122 + 1) + 122));
            }
            pass+= aux;


        }
        return pass;
    }
// 2 mayúsculas, más de 1 minúscula y más de 4 números
//    public  boolean esFuerte() {
//        int contCap = 0, contLow = 0, contNum = 0;
//
//        for (int i = 0; i < contrasenya.length(); i++) {
//            if (contrasenya.charAt(i) > 48 && contrasenya.charAt(i) < 57) {
//                contNum++;
//            } else if (contrasenya.charAt(i) > 65 && contrasenya.charAt(i) < 90) {
//                contCap++;
//            } else if (contrasenya.charAt(i) > 97 && contrasenya.charAt(i) < 122) {
//                contLow++;
//            }
//
//        }
//
//        if (contCap>=2 && contLow>=1 && contNum > 4){
//            return true;
//
//
//        }
//
//
////        System.out.println(contCap + " mayus");
////        System.out.println(contLow + " minus");
////        System.out.println(contNum + " nums");
//
//
//        return false;
//
//
//    }

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

        if (contCap>=2 && contLow>=1 && contNum > 4){
            return true;


        }


//        System.out.println(contCap + " mayus");
//        System.out.println(contLow + " minus");
//        System.out.println(contNum + " nums");


        return false;


    }


    @Override
    public String toString() {
        return "Password{" +
                "contrasenya='" + contrasenya + '\'' +
                ", defLongitu=" + defLongitu +
                '}';
    }


}
