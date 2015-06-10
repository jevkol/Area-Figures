package FigureArea;
import java.lang.*;
public class Square implements Figure{
	static final String name = "Squares";
	public static Double s;
	public Double side;
	public Square(Double side){
		
		this.side = side;
		s = getAreaValue();
	    printArea();
		
    }
	
	
	public Double getAreaValue(){
	 if( side < 0 ) throw new IllegalArgumentException ("Value is negative" + side);
	 
	 return side*side;
    }
	
	public void printArea(){
		System.out.println("Areas square = " + s);
	}
	
	public String printName(){
		return name;
	}
	
	public boolean equals(Object square){
		if (this == square) {return true;}
		if (square == null) return false;
		if (!(square instanceof Square)) return false;
		Square otherSquare = (Square) square;
		return side.equals(otherSquare.side);	
        // if (otherSquare.side == this.side) {
            // return true;
        // } else {
            // return false;
        // }
    }		
    
	public int hashCode(){
		int h =  s.intValue();
		h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);		
	}
}