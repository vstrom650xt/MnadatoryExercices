package biblioteca;

public class BiblioTester {

    public static void main(String[] args) {
        Libro ptt = new Libro("pttStyle","ptt",5);


        Biblioteca pp = new Biblioteca();

        pp.addBook(ptt);
       // System.out.println(pp);

        pp.deleteBook(ptt);
        System.out.println(pp);




    }
}
