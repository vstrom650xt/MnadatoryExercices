package persona;

public enum SexType {
    HOMBRE("h"),
    MUJER("m"),
    NO("n");






    public void setType(String type) {
        this.type = type;
    }

    private String type;

    private SexType(String type){
        this.type=type;


    }
}
