package CoreProgrammingJava;
//public class Sedan {

	
	public class Sedan extends Car{
		private int length;
		public static void main(String[] args) {
		}
	
	public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
	
@Override
double getSalePrice() {
	if(length>20) {
		return regularPrice*0.95;//5%
	}else {
		return regularPrice*0.9;//10%
	}


    }
	}
