package FigureArea;
import java.util.*;
import FigureArea.Sum;


class Main{
	public static void main(String[] args){
	    int d;
		Random r = new Random();
		Collection<Figure> cs = new ArrayList<Figure>();
		
		for (int i = 0; i < 10; i++){
			d = r.nextInt(100);
			Figure sqr = new Circle(new Double(d));
			cs.add(sqr);
		}
		System.out.println();
		System.out.println("Size figure's collection " + cs.size());
		System.out.println();
		Sum.sum(cs);
		System.out.println(); 
		 MiMa.min(cs);
		 System.out.println();
		 Max.max(cs);
		 System.out.println();
		 Repeat.repeat(cs);
		 System.out.println();
	}
}