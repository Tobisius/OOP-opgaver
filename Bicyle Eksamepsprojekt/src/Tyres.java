public class Tyres {

    static float Diameter;
    boolean Flat;
    float Pressure;

    public Tyres(float Diameter, boolean Flat, float Pressure){

        this.Diameter = Diameter;
        this.Flat = Flat;
        this.Pressure = Pressure;
    }
    int Omkreds = 91;

    public void isFlat() {


        if (Pressure < 1.5) {

            System.out.println("Dækket skal pumpes");

        } else {
            System.out.println("Dækket er ikke helt fladt");

        }
    }

    public void diameterOfTyre(){
        System.out.println("Diameteren på dækket er: " + Diameter + "cm");

    }
}
