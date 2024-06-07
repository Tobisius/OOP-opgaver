public class Pedals {

    float RPM = 90.00F;
    float constant = 11.8F;
    public Pedals(float RPM, float constant) {
        this.RPM = RPM;
        this.constant = constant;
    }
    public void whatIsSpeed(float RPM, float constant){

        if (RPM != 0){

            Tyres tyres = new Tyres(90F, false, 2.2F);
            tyres.diameterOfTyre();
            int Omkreds = tyres.Omkreds;


            Float fartPaaCykel = RPM * constant * Omkreds;
            Float fartPaaCykel1 = (float) (0.001524 * (fartPaaCykel));

            System.out.println("Farten på cyklen er: " + fartPaaCykel1 + "kmt");
        } else if (RPM == 0) {
            System.out.println("Cyklen er ikke i bevægelse.");
        }
    }
}
