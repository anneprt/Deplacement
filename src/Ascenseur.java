public class Ascenseur extends MoyenDeTransport {
    public Ascenseur(int xx, int yy) {
        super(xx, yy);
        vitesse = limitation(5, 20);
        System.out.println("Je suis un ascenseur ! ");
        System.out.println("Vitesse : " + vitesse);
    }

    public void deplacementEnY() {
        y = y + vitesse;
        System.out.println("y : " + y);
    }

}
