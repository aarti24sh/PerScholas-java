package CoreProgrammingJava;

public class Car {
	
	
 int speed;
 double regularPrice;
private String color;


public static void main(String[] args) {
	
}
public Car(int speed , double regularPrice,String color) {
	this.speed= speed;
	this.regularPrice=regularPrice;
	this.color= color;
}

double getSalePrice() {
return regularPrice;
}
}



