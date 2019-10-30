package ba.unsa.etf.rpr;

public class NewClass{

    private Color color;
    public enum Color {
        RED("r"),
        GREEN("g"),
        BLUE("b"),
        YELLOW("y");

        private final String colorCode;

        //Standardni enum konstruktor za dodjeljivanje vrijednosti
        Color(String colorCode){
            this.colorCode = colorCode;
        }

        //Dodatna metoda za pronalazak adekvatne Boje u odnosu na njen kod
        public static Color fromString(String input){
            for(Color c : Color.values()){
                if(c.colorCode.equals(input)) return c;
            }
            throw new IllegalArgumentException();
        }
    }

    //Standardni konstrukor klase
    public NewClass(Color color) {
        this.color = color;
    }

    //Konstruktor koji prima kod boje i pronalazi adekvatnu vrijednost enuma. Baca izuzetak ako kod boje nije potpuno isti kao definisani
    public NewClass(String colorCode) {
        this.color = Color.fromString(colorCode);
    }

    //Konstruktor koji prima string koji predstavlja naziv boje npr. "RED" i dodjeljuje atributu klase odgovarajuću boju.
    //Baca izuzetak ukoliko je naziv boje bilo kako drugaciji od enuma. Npr. da je proslijedjeno "red" ili "RED " izuzetak bi ponovo bio bačen
//    public NewClass(String colorName){
//        this.color = Color.valueOf(colorName);
//    }


    //Getteri i setteri
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
