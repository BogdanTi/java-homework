package bogdantara;


public class Alien implements characterInterface {

        int hp = 200;
        int energy = 100;
        boolean isDead = false;
        @Override
        public int getHealth() {
            return hp;
        }
        @Override
        public void setHealth(int health) {
            this.hp = health;
        }
        @Override
        public boolean isDead() {
            if(hp <= 0){
                isDead = true;
            }
            return isDead;
        }
        public int getEnergy() {
            return energy;
        }

        public void biteHuman(Human human){
            if(!isDead && energy >= 10 && human.getHealth() >= 1){
                if(energy >= 80 && energy <= 100) {
                    human.hp -= 25;
                }else if(energy <= 80 && energy >= 50){
                    human.hp -= 15;
                }else if(energy <= 50 && energy >= 10){
                    human.hp -= 10;
                }
                this.energy -= 10;
                human.isDead();
            }else if(energy < 10 && !isDead) {
                System.out.println("The alien is to weak to kill the human");
            }else if(human.getHealth() < 0){
                System.out.println("The human is dead cold");
            }else if(isDead){
                System.out.println("The alien is dead.");
            }
        }
    }
