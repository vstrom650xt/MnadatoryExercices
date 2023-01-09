package biblioteca;

public class Libro {
    public Libro(String title, String author, int numCopy) {
        this.title = title;
        this.author = author;
        this.numCopy = numCopy;
    }

    private String title, author;
    private int numCopy,numShared;

    public boolean getStock(){

        return false;


    }


}
