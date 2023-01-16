package biblioteca;

import java.util.Scanner;

public class BiblioTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title, author;

        Biblioteca pp = new Biblioteca("Biblio-01","barrio-01","benbaguasil");
        Biblioteca pp2 = new Biblioteca("Biblio-02","barrio-02","la pobla");

        System.out.println(pp);
        for (int i = 0; i < 2; i++) {
            System.out.println("pon titulo libro");
            title = sc.next();
            System.out.println("pon author libro");
            author=  sc.next();
            pp.addBook(new Libro(title,author),3);
        }

        pp.deleteBook("Don Quijote");
        pp.deleteBook("La ciu");
        pp.deleteBook("El amor");
        pp.deleteBook("33333");

        pp.giveBook("Desolación");
        pp.returnBook("20 poemas");



        pp2.deleteBook("Don Quijote");
        pp2.deleteBook("La ciu");
        pp2.deleteBook("El amor");
        pp2.deleteBook("33333");

        pp2.giveBook("Desolación");
        pp2.returnBook("20 poemas");

    }
}
