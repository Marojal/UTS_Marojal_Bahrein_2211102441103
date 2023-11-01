import greenfoot.*;

public class Tail extends Actor {
    private int panjang;
    private Tail selanjutnya;

    public void act() {
        if (0 == panjang-- && Head.getAlive()) {
            getWorld().removeObject(this);
        }
    }

    public Tail(int panjangu, int rotation, Tail selanjutnya) {
        panjang = panjangu;
        setRotation(rotation);
        this.selanjutnya = selanjutnya;
    }

    public void increase() {
        panjang += Head.getScale();
        if (selanjutnya != null) {
            selanjutnya.increase();
        }
    }
}
