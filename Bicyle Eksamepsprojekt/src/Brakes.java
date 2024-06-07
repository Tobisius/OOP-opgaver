public class Brakes {

    boolean breaks;
    boolean Conditions;
    boolean frontBreak;
    boolean backBreak;

    public Brakes(boolean breaks, boolean Conditions, boolean frontBreak, boolean backBreak) {

        this.breaks = breaks;
        this.Conditions = Conditions;
        this.frontBreak = frontBreak;
        this.backBreak = backBreak;
    }

    public void Bagbremse(boolean backBreak) {
        System.out.println("Bremser på baggremsen");
    }

    public void Forbremse(boolean frontBreak) {
        System.out.println("Bremser på forbrensen");
    }
    public void whatIsBreakLength(float speed){
        float breakingDistance = 0;
        if (breaks) {

            System.out.println("Bremser virker og er monteret korrekt");

        }else if (!breaks){

                System.out.println("Fejl på bremser");
            }

        if (Conditions || breaks){
            //https://korkortonline.se/en/theory/reaction-braking-stopping/#:~:text=Conditions%3A%20Good%20and%20dry%20road,conditions%20is%20approximately%200.4%20metres.
            //Formel for at udrenge bremselængde, hvor 250 er en konstant og 0.1 er konstant for bremselængde i gode forhold.

            breakingDistance = (float) (Math.pow(speed,2)/(250 * 0.1));

            String formattedDistance = String.format("%.2f", breakingDistance);

            System.out.println("Bremselængden er: " + formattedDistance);

        } else if (!Conditions || breaks){

            // 0.8 er konstant for dårlige formhold, ved Condtions = false.

            breakingDistance = (float) (Math.pow(speed, 2)/(250 * 0.8));

            String formattedDistance = String.format("%.2f", breakingDistance);

            System.out.println("Bremselængden er: " + formattedDistance);

        }
    }
    }
