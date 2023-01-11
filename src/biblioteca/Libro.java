package biblioteca;

public class Libro {
    @Override
    public String toString() {
        return "Libro{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numCopy=" + numCopy +
                ", numShared=" + numShared +
                '}';
    }

    public Libro(String title, String author, int numCopy) {
        this.title = title;
        this.author = author;
        this.numCopy = numCopy;
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





}
