package ConstructorsTutorial;
public class ConstructorsAddition {
    
    int firstNumber;
    int secondNumber;

    public int getNumber() {

        return(firstNumber + secondNumber);

    }

    ConstructorsAddition() {                                        //Must be same name as class

        firstNumber = 10;
        secondNumber = 20;

    }

    ConstructorsAddition (int L, int B) {

        firstNumber = L;
        secondNumber = B;

    }
    }

