package FigureArea;
import java.lang.*;
public class Circle implements Figure{
	static final String name = "Circles";
	public static Double s;
	public Double radius;
	public Circle(Double radius){
		
		this.radius = radius;
		s = getAreaValue();
	    printArea();
		
    }
	
	
	public Double getAreaValue(){
	 if( radius < 0 ) throw new IllegalArgumentException ("Value is negative" + radius);
	 
	 return Math.PI*radius*radius;
    }
	
	public void printArea(){
		System.out.println("Areas circle = " + s);
	}
	
	public String printName(){
		return name;
	}
	
	
	public boolean equals(Object circle){
		if (this == circle) {return true;}
		if (circle == null) return false;
		if (!(circle instanceof Circle)) return false;
		Circle otherCircle = (Circle) circle;
		return radius.equals(otherCircle.radius);	
        
    }		
    
	public int hashCode(){
		int h =  s.intValue();
		h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);		
	}
}