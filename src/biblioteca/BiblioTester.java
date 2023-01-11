package biblioteca;

public class BiblioTester {

    public static void main(String[] args) {
        Libro p = new Libro("ptt","pp", 3);
        p.decreaseBook(p);
        System.out.println(p);

    }
}
