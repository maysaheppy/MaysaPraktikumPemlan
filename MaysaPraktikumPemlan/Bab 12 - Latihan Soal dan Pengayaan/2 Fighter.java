package LatihanHero;

public class Fighter extends Hero{
    private String direction;
    private String kekuatan;

    public Fighter(String namaHero, String kekuatan) {
        super(namaHero);
        this.kekuatan = kekuatan;
    }

    public void setKekuatan(String kekuatan) {
        this.kekuatan = kekuatan;
    }

    public String getKekuatan() {
        return kekuatan;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public void move() {
        super.move(getDirection());
        System.out.print(" dengan kekuatan " + getKekuatan());
    }

    public String toString() {
        return String.format(super.toString() + "/nKekuatan: " + getKekuatan());
    }
}
