package CoreProgrammingJava;

//import CoreProgrammingJava.Car;

//public class Ford {
	public class Ford extends Car{
		 int year;
	     int manufacturerDiscount;

	public static void main(String[] args) {
	}
	public Ford(int speed,int year,int manufacturerDiscount,double regularPrice,String color) {
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
@Override
double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}

	

}
