public class ThisTutorials {
    
    private int one;

    public ThisTutorials (int one) {
        this.one = one;                             //The "this" keyword is basically an instance 
    }


public static void main (String[] args) {

    ThisTutorials testThis = new ThisTutorials(79);

    System.out.println(testThis.one);

}

}
