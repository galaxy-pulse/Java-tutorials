public class Casting {
    
    public static void main (String[] args) {
/*
        double source = 150.9999999;                    //Variable to variable cast
        int destination = (int) source;

                                                        //date to data cast 
        int I = 1255;                                   //int range is from -2 billion to 2 billion
        byte B = (byte) I;                              //byte is -127 to 127

        Integer wholeNumber = new Integer (400);    //object to variable
        int dest = wholeNumber.intValue();

        String val = "47";                              //Variable to object
        int intObject = Integer.parseInt(val);          //This cast will only work if the String has numerics in it


        //The above are explicit casts */

        int x = 47;
        double y = 3.5;
        double xy = x + y;                              //Java will assume "x" as a decimal to do the arithmetic 


        System.out.println (xy);

    }

}

//Casting converts elements to new elements
