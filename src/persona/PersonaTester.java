package persona;

import persona.SexType;

import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //por defecto los atributos nombre,apellidos , edad se deben introducir cuando
        //se construye el objeto

        //si pone el dni tiramos del constructor grande , sino se queda en el peq
        String name;
        String lastName;
        int age;
        double altura,peso;

        SexType sexType ;
        Persona p3;

        //SexType s = SexType.No;
        System.out.println("ur name");
        name = sc.nextLine();
        System.out.println("ur lastname");
        lastName = sc.nextLine();
        System.out.println("ur age");
        age = sc.nextInt();
        System.out.println("desea dni?");
        String ans = sc.next();
        if (ans.equals("s")){
            System.out.println("pon alt");
            altura=sc.nextDouble();
            System.out.println("pon peso");
            peso=sc.nextDouble();
            System.out.println("would u like to change your sextype?");
            ans=sc.next();
            if (ans.equals("s")){
                int a ;
                System.out.println("press 1 for man 2 for women 3 for none");
                a=sc.nextInt();

                if (a==1){
                    sexType= SexType.HOMBRE;
                  //  p3.setSexType(SexType.HOMBRE);
                }else if (a==2){
                    sexType= SexType.MUJER;

                   // p3.setSexType(SexType.MUJER);
                }else {
                    sexType= SexType.NO;

                   // p3.setSexType(SexType.NO);
                }

            }
            sexType= SexType.NO;
            p3=new Persona(name,lastName,age,altura,peso,sexType);
            System.out.println(p3);


        }else{

            p3=new Persona(name,lastName,age);
            System.out.println(p3);
        }
        p3.setSexType(SexType.HOMBRE);
        System.out.println(p3);



//
//
//        Persona p = new Persona(name,lastName,age);
//        System.out.println(p);


//        Persona p2 = new Persona(name,lastName,29,70,1.78);
//        System.out.println(p2);
//        p2.;












    }
}
