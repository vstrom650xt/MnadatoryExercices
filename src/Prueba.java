import contrasenya.Password;

public class Prueba {
    public static void main(String[] args) {

        Password p = new Password();
        p.generarPassword();
        System.out.println(p);
        System.out.println(p.esFuerte());

//        char aux;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(
//                    aux= (char) Math.floor(Math.random() * (48 - 122 + 1) + 122)
//            );
//        }





    }
}
