package biblioteca;

import java.util.Arrays;

public class Biblioteca {

    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + Arrays.toString(libros) +
                '}';
    }

   private   Libro[] libros = new Libro[100];
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
    private String name, barrio, poblacion;
    private  int numBook;


    public Biblioteca() {
//        libros[0] = new Libro("pp", "ptt", 3);
//        libros[1] = new Libro("pp2", "ptt2", 3);
//        libros[2] = new Libro("pp3", "ptt3", 3);

        for (int i = 0; i < allBooks.length; i++) {
            libros[i]=new Libro(allBooks[i][0],allBooks[i][1],3);
        }
        this.numBook=30;
    }


    public void addBook(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]==null){
                libros[i] = libro;
            }
        }
    }


    public void deleteBook(Libro libro){
        int i = 0 ;

        for ( i = 0; i < libros.length; i++) {
            if (libros[i]==libro){
                libros[i] = null;
            }

        }

     //   quicksort(libros[i].getTitle(),49,50);

    }

    public int findTitle(String title){
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i][0].contains(title))
                return i;
        }
        return -1;
    }

    public int puestoUsados(){
        int cont =0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]!= null)
                cont++;
        }


        return cont;



    }
    public  Libro[] sortBooks(){
        int cont = puestoUsados(), i = 0;
        Libro aux = null;
//        do {
//            if (libros[i] == null)
//             aux = libros[i];
//            libros[i]=libros[i+1];
//            libros[libros.length-1] = aux;
//            i++;
//        }while (i<cont|| );

            if (libros[i]==null && libros[libros.length -1] != null){
                aux=libros[libros.length-1];
                libros[i] = aux;
                libros[libros.length-1] = null;
            }

        return libros;
    }


    public  void swap(String[][] v, int i, int j) {
        String[] aux = v[i];
        v[i] = v[j];
        v[j] = aux;

    }

}
