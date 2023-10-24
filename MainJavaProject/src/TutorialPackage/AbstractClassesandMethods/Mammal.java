package AbstractClassesandMethods;

public abstract class Mammal {                  //Class MUST be abstract in order for IntelliSense not to freak out
                                                //When you tag a class as abstract, you can't create a constructor/obj with it

    public abstract void hair();                //We will fill in the details later -- this is a blank method
    public abstract void breathe();
    

    public void swim () {



    }

    public void walk () {

        

    }
}


//This class is abstract because we don't want to create objects from it. We only want to apply its attributes to objects
//that happen to have the same characteristics that we established in the abstract concept of the class. 

//In other words, you don't see a mammal walking down the street. You see an object with the characteristics that MAKE them a mammal
//or label them a mammal walking down the street. There's no such thing as a mammal object. Just mammal-like objects. 