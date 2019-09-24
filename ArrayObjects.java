
public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10, 3, 5, 6}; //size is 4. index begins at 0. 
        int[] intArray1 = new int[10]; //creates array that has a length of 10.

        System.out.println(intArray[0]); //prints the first index of the array: 10

        for (int i = 0; i < intArray.length; i++){    //This is how I would print all the values of intArray.
            System.out.println(intArray[i]);
        }

        for (int i = 0; i < intArray1.length; i++){  //whatever i is equal to, I assign it to the indexes of intArray1. intArray1[0] has 0 stored in it.
            System.out.println(intArray1[i] = i);
        }

//Practice - put the multiples of 2 into each index. e.g. 2, 4, 6...etc.
        int[] myPractice = new int[10];
        for (int i = 0; i < myPractice.length; i++){
            System.out.println(myPractice[i] = i*2); //this loop puts the multiples of 2 into the array into each index.
        }


// be able to create an array of objects and assign values to those objects
// any class that we have done, create an array of objects of that class
//give us an account class or any other type of class and create an array of objects for that class


        Rectangle[] rectArray= new Rectangle[5];  //creates a rectangle array

        for (int i=0; i< rectArray.length; i++) {
            rectArray[i]= new Rectangle(); //creates rectangle objects and stores into the index of the array
        }
        
        for (int i=0; i< rectArray.length; i++) {
            System.out.println(rectArray[i]); //printing all the objects in the array at all the indexes.
        }
        
        //The above prints out all the addresses for the rectangle objects in each index of the array
        
        Rectangle object1 = rectArray[0]; //in rectArray[0] there is already an object.
        object1.width = 10.0;
        object1.height = 20.0;
        System.out.println(object1);

        Rectangle object2 = rectArray[1]; 
        object2.width = 20.0;
        object2.height = 20.0;
        System.out.println(object2);

        Rectangle object3 = rectArray[2]; 
        object3.width = 30;
        object3.height = 20;
        System.out.println(object3);

        Rectangle object4 = rectArray[3]; 
        object4.width = 40;
        object4.height = 20;
        System.out.println(object4);

        Rectangle object5 = rectArray[4]; 
        object5.width = 50;
        object5.height = 20;
        System.out.println(object5);


        for(int i = 0; i < rectArray.length; i++){
            rectArray[i].getArea1();
        }
        
        Student[] myCourses = new Student[4];
        
        for(int i = 0; i < myCourses.length; i++) {
        	myCourses[i] = new Student();
        	System.out.println(myCourses[i]);
        	
        }
        

	}

}
