public class ErrorHandling {
    
    public static void main(String[] args) {
       
    try {
        int[] testArray;

        testArray = new int[3];
        
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;

        System.out.println(testArray[99]);

    }

    catch (IndexOutOfBoundsException er) {

            System.out.println("Out of bounds exception thrown");

    }

    }

}
