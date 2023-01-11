package contrasenya;

import java.security.PrivilegedAction;
import java.util.Objects;
import java.util.Scanner;



public class PassTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numPass,longPass;
        System.out.println("pon tamaño array");
        numPass= sc.nextInt();
        Password[] passwords = new Password[numPass];
        boolean [] sonFuertes = new boolean[numPass];
        System.out.println("pon tamaño passsword");
        longPass= sc.nextInt();
        for (int i = 0; i < numPass; i++) {
            passwords[i]=new Password(longPass);
            System.out.println(passwords[i]);

        }

        for (int i = 0; i < numPass; i++) {
            sonFuertes[i]=passwords[i].esFuerte();
            System.out.println(sonFuertes[i] + " " + passwords[i]);




        }

    }


}
