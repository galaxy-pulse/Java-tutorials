public class Scope {

    static int number = 7;     

    public static void main (String[] args) {

        //int number = 7;                                 //This is a local vairable. We are declaring and initializing it.

        System.out.println(number);

    }
    
    static void getNumber () {

        System.out.println(number);

    }

}
