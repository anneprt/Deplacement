public class MoyenDeTransport implements Deplacement {
    public final static int VITESSE_INITIALE = 10;
    protected int x;
    protected int y;
    protected int vitesse;

    public MoyenDeTransport(int nx, int ny) {
        x = nx;
        y = ny;

    }

    public void afficher() {
        System.out.println("Position en " + x + ", " + y);
    }

    public void seDeplacer() {
        deplacementEnX();
        deplacementEnY();
    }

}
