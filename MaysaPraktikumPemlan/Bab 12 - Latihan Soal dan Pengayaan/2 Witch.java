package LatihanHero;

public class Witch extends Enemy {
    private String sihir;
    private int step;

    public Witch(String namaEnemy, String sihir) {
        super(namaEnemy);
        this.sihir = sihir;
    }

    public void setSihir(String sihir) {
        this.sihir = sihir;
    }

    public String getSihir() {
        return sihir;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    @Override
    public void move(){
        super.move(getStep());
        System.out.print(" dengan sihir " + getSihir());
    }

    public String toString() {
        return String.format(super.toString() + "/nKekuatan: " + getSihir());
    }


}
