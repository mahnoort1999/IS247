public class RectangleDriver{

    public static void main(String[] args){
        int var = 10;

            System.out.println(var);

        Rectangle rec1 = new Rectangle(30, 4); //this is an instance

            System.out.println(rec1.getArea());
            System.out.println(rec1.getPerimeter());

        Rectangle rec2 = new Rectangle(3, 5); // an instance
            System.out.println(rec2.getArea());
            System.out.println(rec2.getPerimeter());

        //rec1 = rec2; If i do this, i am changing the reference value for rec2 to be the same as rec1

        System.out.println(rec1); //prints the ADDRESS: Rectangle@5451c3a8

        doSomething(var); //passes 10
        doSomethingAgain(rec1); //passes by reference. Passes the pointer into that method. I am passing in the address location.
                                // go to this address and change.
        System.out.println(var); // equal to 10 still

        System.out.println(rec1.height); // equal to 20
        System.out.println(rec1.width); // equal to 20
    
    //Getters and Setters part
        rec2.setHeight(10);
        rec2.setWidth(10);
        System.out.println(rec2.getHeight()); // prints 10
        System.out.println(rec2.getWidth());// prints 10
        
    }


    public static void doSomething(int var){
        var = 20;
    }

    public static void doSomethingAgain(Rectangle recObj){
        recObj.width = 20;
        recObj.height = 20;
    }

   
}