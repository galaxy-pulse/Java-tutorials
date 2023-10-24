public class SwitchStatements {
    
    public static void main(String[] args) {

        int fieldgoal;
        fieldgoal = 123;

        switch (fieldgoal) {

            case 6: 
                System.out.println ("This is a touchdown.");
                break;

            case 2:
                System.out.println ("This is a safety.");
                break;
            
            case 3:
                System.out.println ("This is a fieldgoal.");
                break;

            case 3000:
                System.out.println ("This is an impossible score.");
                break;

            default:
                System.out.println ("Nothing matches at all. YOU LOSE!");
                break;


        }




    }


}
