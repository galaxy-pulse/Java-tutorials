package CandyInheritanceTutorial;

public class InheritanceProgram {

    public static void main (String[] args) {

        Gumdrops Red = new Gumdrops();

        Gumdrops Green = new Gumdrops();

        Red.giveMeCinnamon();
            Red.SugarAmount = 10;
            Red.displaySugarAmount();

        Green.giveMeSpearmint();
            Green.SugarAmount = 9;
            Green.displaySugarAmount();


    }
    
}
