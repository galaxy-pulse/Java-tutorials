package VoidandReturn;

public class Food {

    private String foodA;

    public Food(String A) {

        foodA = A;

    }

    public String getFood () {

        return foodA;

    }

    void systemPrint() {

        System.out.println(foodA);

    }
    
}

//Void means you are not returning a value
//Return means you are returning a value