public class Fusee extends MoyenDeTransport {
    public Fusee(int xx, int yy) {
        super(xx, yy);

        vitesse = limitation(100, 2000);
        System.out.println("Je suis une fusée ! ");
        System.out.println("Vitesse : " + vitesse);
    }

    public void deplacementEnX() {
        x = x + vitesse;
        System.out.println("x : " + x);
    }

    public void deplacementEnY() {
        y = y + vitesse;
        System.out.println("y : " + y);
    }
}
