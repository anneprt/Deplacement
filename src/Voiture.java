public class Voiture extends MoyenDeTransport {
    public Voiture(int xx, int yy) {
        super(xx, yy);
        vitesse = limitation(10, 100);
        System.out.println("Je suis une voiture ! ");
        System.out.println("Vitesse : " + vitesse);


    }

    public void deplacementenX() {
        x = x + vitesse;
        System.out.println("x : " + x);
    }

}
