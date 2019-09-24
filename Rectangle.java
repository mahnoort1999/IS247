
public class Rectangle {
	    double height = 1;
	    double width = 1;

	    Rectangle(){

	    }

	    Rectangle(double height, double width){
	        this.height = height;
	        this.width = width;
	    }
	//Getters and Setters
	    public double getHeight(){
	        return height;
	    }
	    public double getWidth(){
	        return width;
	    }
	    public void setHeight(double height){
	        this.height = height;
	    }
	    public void setWidth(double width){
	        this.width = width;
	    }

	    //Calculate area based on values passed in 
	    void getArea1(){
	        System.out.println(height * width);
	    }
	     
	    public double getArea() {
	    	return height*width;
	    }

	    //Calculate perimeter based on values passed in
	    public double getPerimeter(){
	        return ((2*height) + (2*width));
	    }
	} 
