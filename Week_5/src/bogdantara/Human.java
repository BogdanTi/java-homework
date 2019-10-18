package bogdantara;

public class Human implements characterInterface {
    int hp = 100;
    int ammo = 200;
    boolean isDead = false;
    public int getAmmo() {
        return ammo;
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
        if(hp <= 0){
            isDead = true;
        }
        return isDead;
    }

    public void shootAlien(Alien alien){
        System.out.println(isDead);
        if(!isDead && ammo >= 15 && alien.getHealth() >= 1) {
            alien.hp -= 25;
            this.ammo = ammo - 15;
            alien.isDead();
        }else if(ammo < 15 & !isDead){
            System.out.println("The human can't kill the Alien with the ammo left!");
        }else if(alien.getHealth() < 0){
            System.out.println("The alien is dead");
        }else if(isDead){
            System.out.println("The human is dead cold...");
        }
    }
}
