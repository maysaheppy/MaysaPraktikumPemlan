package LatihanHero;

public class Enemy extends Character{
    private String namaEnemy;
    private int atk = 5;
    private int health = 10;
    private int expHero = 0;
    private int levelHero = 0;

    public Enemy(String namaEnemy) {
        this.namaEnemy = namaEnemy;
    }

    public String getNamaEnemy() {
        return namaEnemy;
    }
    public int getAtk() {
        return atk;
    }
    public int getExpHero() {
        return expHero;
    }
    public int getHealth() {
        return health;
    }
    public int getLevelHero() {
        return levelHero;
    }

    @Override
        public void move() {
            System.out.println(getNamaEnemy() + " mulai melangkah.");
        }

    public void move(int step) {
        System.out.println(getNamaEnemy() + " berjalan " + step + " langkah.");
    }

    public String toString() {
        return String.format("Biodata Enemy \n Nama Enemy : " + getNamaEnemy() +
        "\natk : " + getAtk() + 
        "\nhealth : " + getHealth() +
        "\nexpHero : " + getExpHero() +
        "/nlevelHero : " + getLevelHero());
    }
}
