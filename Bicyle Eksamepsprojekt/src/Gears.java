public class Gears {

    public int gear = 1;

    public void incrementGear() {

        if (gear == 7) {

            System.out.println("Gearet kan ikke komme højere op");
        } else {

            System.out.println("Går op i gear");
            gear++;
        }

        System.out.println("Nuværende gear er: " + gear);
    }

    public void decrementGear() {

        if (gear < 2) {

            System.out.println("Gearet kan ikke komme længere ned");
        } else if (gear > 1) {

            System.out.println("Går ned i gear");

            gear--;
        }
        System.out.println("Gearet er nu: " + gear);
    }
}


