package bogdantara;

public class Week5Homework {
    public static void main(String[] args) {
        Human h1 = new Human();
        Alien a1 = new Alien();
        Predator p1 = new Predator();

        System.out.println("Initial Human Health: " + h1.getHealth());
        System.out.println("Initial alien energy: " + a1.getEnergy());
        System.out.println("The alien will succesfully bite the human");
        a1.biteHuman(h1);
        System.out.println("Human health left after one bite from the alien: " + h1.getHealth());
        System.out.println("Alien energy left after biting the human once: " + a1.getEnergy());
        System.out.println("The human shoots the alien twice");
        h1.shootAlien(a1);
        h1.shootAlien(a1);
        System.out.println("Alien health after 2 human bullets: " + a1.getHealth());
        System.out.println("The human has " + h1.getAmmo() + " ammo left and " + h1.getHealth() + " health left.");
        System.out.println("\nOut of nowhere a hunter Predator appears and kills the alien with 3 spear hits");
        p1.spearAlien(a1);
        p1.spearAlien(a1);
        p1.spearAlien(a1);
        System.out.println("The predator has " + p1.getHealth() + " health and " + p1.getAmmo() + " spears left");
        System.out.println("The alien's health is " + a1.getHealth() + " and the human thinks he's saved...");

    }
}
