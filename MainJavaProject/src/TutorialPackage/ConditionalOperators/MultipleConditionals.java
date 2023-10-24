package ConditionalOperators;

public class MultipleConditionals {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;

        if (((a==5) || (b==6)) && ((c==7) || (d==8)))

            System.out.println("The conditions are true.");

        else {System.out.println("The conditions are false.");}
        
    }
    
}
