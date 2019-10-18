package bogdantara;

public class Predator implements characterInterface {
    int hp = 100;
    int spears = 200;
    boolean isDead = false;

    public int getAmmo() {
        return spears;
    }

    @Override
    public int getHealth() {
        return hp;
    }

    @Override
    public void setHealth(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean isDead() {
        if (hp <= 0) {
            isDead = true;
        }
        return isDead;
    }

    public void spearAlien(Alien alien) {
        System.out.println(isDead);
        if (!isDead && spears >= 15 && alien.getHealth() >= 1) {
            alien.hp -= 50;
            this.spears = spears - 1;
            alien.isDead();
        } else if (spears < 2 & !isDead) {
            System.out.println("The predator can't kill the Alien with the ammo left!");
        } else if (alien.getHealth() < 0) {
            System.out.println("The alien is dead");
        } else if (isDead) {
            System.out.println("The predator is dead cold...");
        }

    }
}
