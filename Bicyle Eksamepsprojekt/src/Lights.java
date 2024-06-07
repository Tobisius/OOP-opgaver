public class Lights {

    String colourFrontlight;
    boolean backlight;
    boolean frontLight;
    String colourBacklight;


    public Lights(String colourBacklight, String colourFrontlight, boolean backlight, boolean frontLight) {
        this.colourBacklight = colourBacklight;
        this.colourFrontlight = colourFrontlight;
        this.frontLight = frontLight;
        this.backlight = backlight;

    }

    public void controlbacklights() {
        if (backlight) {

            System.out.println("Tænder baglygten, med farven: " + colourBacklight);

        } else {
            System.out.println("Baglygtenvirker ikke");
        }
    }
    public void controlFrontlights(){
        if (frontLight) {
            System.out.println("Tænder forlygten, med farven: " + colourFrontlight);
        } else {
            System.out.println("Der er ingen forlygte");
        }
    }
}



