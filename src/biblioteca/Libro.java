package biblioteca;

public class Libro {


    public Libro(String title, String author, int numCopy) {
        this.title = title;
        this.author = author;
        this.numCopy = numCopy;
    }

    public String getTitle() {
        return title;
    }

    private String title, author;
    private int numCopy,numShared;

    public boolean getStock(){
        return numCopy != 0;
    }

    public void decreaseBook(Libro book){
        if (getStock()){
            numCopy--;
        }else{
            System.out.println("no qda");
        }
    }

    public void increaseBook(Libro book){
        numCopy++;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "title='" + title + '\'' +

                '}';
    }


}
