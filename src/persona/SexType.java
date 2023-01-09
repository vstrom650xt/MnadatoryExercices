package persona;

public enum SexType {
    Hombre("h"),
    Mujer("m"),
    No("n");






    public void setType(String type) {
        this.type = type;
    }

    private String type;

    private SexType(String type){
        this.type=type;


    }
}
