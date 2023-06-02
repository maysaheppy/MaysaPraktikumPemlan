package LatihanHero;

public class Hero extends Character{
    private String namaHero;
    private int atk = 5;
    private int health = 10;
    private int expHero = 0;
    private int levelHero = 0;

   public Hero(String namaHero) {
    this.namaHero = namaHero;
   }

    public String getNamaHero() {
        return namaHero;
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
        System.out.println(getNamaHero() + " mulai bergerak.");
    }

    public void move(String direction) {
        System.out.println(getNamaHero() + " bergerak ke " + direction);
    }

    public String toString() {
        return String.format("Biodata Hero \n Nama Hero : " + getNamaHero() +
        "\natk : " + getAtk() + 
        "\nhealth : " + getHealth() +
        "\nexpHero : " + getExpHero() +
        "/nlevelHero : " + getLevelHero());
    }
    
}
