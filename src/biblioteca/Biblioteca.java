package biblioteca;

import java.util.Arrays;

public class Biblioteca {


    private Libro[] libros = new Libro[100];
    private String[][] allBooks = {
            {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
            {"Cien años de soledad", "Gabriel García Márquez"},
            {"El alquimista", "Paulo Coehlo"},
            {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
            {"La ciudad y los perros", "Mario Vargas Llosa"},
            {"La casa de los espíritus", "Isabel Allende"},
            {"Desolación", "Gabriela Mistral"}, {"Rayuela", "Julio Cortázar"},
            {"El Aleph", "Jorge Luis Borges"},
            {"El amor en los tiempos del cólera", "Gabriel García Márquez"}};
    private String name = "";


    public Biblioteca(String... name) {
        for (int i = 0; i < allBooks.length; i++) {
            libros[i] = new Libro(allBooks[i][0], allBooks[i][1]);
        }
        int numBook = 30;
        this.name = Arrays.toString(name);
    }


    public int contBooks() {
        int cont = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                cont++;
            }
        }

        return cont;

    }

    public Libro addBook(Libro libro, int numEjemp) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                contBooks();
                return libros[i];
            }
        }
        return libro;
    }


    public Object deleteBook(String libro) {

        for (int i = 0; i < contBooks(); i++) {
            if (libros[i].getTitle().contains(libro)) {
                libros[i] = null;
                sortBooks();
                contBooks();
                return libros[i];


            }
        }

        System.out.println("we couldnt find that book");

        return libros;
    }

    public int findTitle(String title) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getTitle().contains(title))
                return i;
        }
        return -1;
    }



    public Libro[] sortBooks() {
        int index = 0;
        Libro[] aux = new Libro[libros.length];
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                aux[index] = libros[i];
                index++;
            }
        }
        libros = aux;
        return libros;

    }

    public boolean returnBook(String book) {
        for (int i = 0; i < contBooks(); i++) {
            if (libros[i].getTitle().contains(book)){
                libros[i].increaseBook();
            }
        }
        return false;

    }

    public boolean giveBook(String book) {

        if (findTitle(book)== -1)
            return false;

        for (int i = 0; i < contBooks(); i++) {
            if (libros[i].getTitle().contains(book)){
                libros[i].decreaseBook();
            }
        }
        return false;
    }

//    public boolean giveBook(Libro book) {
//        if (book.getStock()) {
//            book.decreaseBook(book);
//            return true;
//        }
//        return false;
//    }

    @Override
    public String toString() {


        String output = "Biblioteca " + name + "\n";

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                output += libros[i].toString();

            }

        }
        return output;

    }
// para ver los nulls
//    @Override
//    public String toString() {
//
//        String output = "Biblioteca " + name + "\n" +
//                "Barrio " + barrio + "\n" +
//                "Poblacion " + poblacion + "\n" + '}' + Arrays.toString(libros);
//
//
//        return output;
//
//    }


}
