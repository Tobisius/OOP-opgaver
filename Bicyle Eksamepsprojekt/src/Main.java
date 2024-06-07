import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n Vælg del af cyklen, for at få informationer heromkring:\n" +
                    "1 Ringeklokke \n" +
                    "2 Cykel \n" +
                    "3 Dæk \n" +
                    "4 Gear \n" +
                    "5 Bremser og Bremselængde \n" +
                    "6 Fart \n" +
                    "7 Lys \n" +
                    "8 Lukker programmet \n");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Handlebars handlebars = new Handlebars("Red", false, true, "Curved");
                    handlebars.ringBell();
                    break;
                case 2:
                    Bolts bolts = new Bolts("Grey", false);
                    bolts.areBoltsFixed();
                    break;
                case 3:
                    Tyres tyres = new Tyres(700.0F, true, 2.2F);
                    tyres.isFlat();
                    tyres.diameterOfTyre();
                    break;
                case 4:
                    Gears gear = new Gears();
                    while (true) {
                        System.out.println("Tast 1 for at gå op i gear, 2 for at gå ned i gear og 3 for at afslutte");

                        int gearChoice = input.nextInt();

                        if (gearChoice == 1) {
                            gear.incrementGear();
                        } else if (gearChoice == 2) {
                            gear.decrementGear();
                        } else if (gearChoice == 3) {
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Tast 1 for at bruge forbremsen, 2 for bagbremsen, 3 for begge og 4 for bremselængden");
                    int breakChoice = input.nextInt();

                    Brakes brakes = new Brakes(true, true, true, true);

                    switch (breakChoice) {
                        case 1:
                            brakes.Forbremse(true);
                            break;
                        case 2:
                            brakes.Bagbremse(true);
                            break;
                        case 3:
                            brakes.Forbremse(true);
                            brakes.Bagbremse(true);
                            break;
                        case 4:
                            brakes.whatIsBreakLength(20.00F);
                            break;
                    }
                    break;
                case 6:
                    Pedals pedals = new Pedals(100.00F, 11.8F);
                    pedals.whatIsSpeed(60F, 11.8F);
                    break;

                case 7:
                    Lights lights = new Lights("rød","hvid",true, true);
                    System.out.println("Vælg lys, 1 for forlygte, 2 for baglygt 3 for begge lys");

                    int lightChoice = input.nextInt();
                    switch (lightChoice){
                        case 1:
                            lights.controlFrontlights();
                            break;
                        case 2:
                            lights.controlbacklights();
                            break;

                        case 3:
                            lights.controlFrontlights();
                            lights.controlbacklights();
                            break;
                    }
                break;
                case 8:
                    System.out.println("Lukker systemet...");

                    break;
                default:
                    System.out.println("Ukendt input, prøv igen");
                    break;
            }
            if (choice == 8){

                break;
            }
        }
    }
}

//With my Bicycle I can ride it forward by stepping on the pedals,
//and by changing gears I can go faster if I choose a higher
//gearing, but it also becomes harder to step on the pedals.
//For that reason, I start in first gear. I have front and backlights
//which switch on if it becomes dark.
//The wheels I can take off when I need to fix holes in the tire.
//When I brake, I can use
//both front and read brakes.