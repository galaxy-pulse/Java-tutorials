package CandyInheritanceTutorial;

public class Gumdrops extends Candy{                                    //Subclass "extends" Superclass
    
    String Cinnamon = "Cinnamon";
    String Spearmint = "Spearmint";

    void giveMeCinnamon() {

        System.out.println ("This is a " + Cinnamon + " gumdrop.");

    }

    void giveMeSpearmint() {

        System.out.println ("This is a " + Spearmint + " gumdrop.");

    }

}
