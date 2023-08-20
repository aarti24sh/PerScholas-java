package CoreProgrammingJava;
//public class Truck {
	public class Truck extends Car{
		 int weight;

	
	public static void main(String[] args) {
	}
	 Truck(int speed , double regularPrice,String color) {
	super(speed,regularPrice,color);
	this.weight=weight;
	}
	@Override
	double getSalePrice() {
		if(weight>2000) {
			return regularPrice*0.9;//10%discount
		}else {
			return regularPrice*0.8;//20%discount
		}
	
	}
	}

	
