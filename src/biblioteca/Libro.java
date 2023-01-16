package biblioteca;

public class Libro {


    public Libro(String title, String author) {
        this.title = title;
        this.author = author;
        this.numCopy = 3;
    }

    public String getTitle() {
        return title;
    }

    private String title, author;
    private int numCopy, numShared;

    public boolean getStock() {
        return numCopy != 0;
    }

    public void decreaseBook() {
        if (getStock()) {
            numCopy--;
        } else {
            System.out.println("no qda");
        }
    }

    public void increaseBook() {
        if (getStock()) {
            numCopy++;
        } else {
            System.out.println("no qda");
        }
    }


    @Override
    public String toString() {

        return "\t" + "Libro " +
                "-> " + title + ' ' +
                ", copies = " + numCopy + ' ' +
                ", shared = " + numShared + '.' +
                "\n";
    }


}
