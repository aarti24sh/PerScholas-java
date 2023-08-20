package CoreProgrammingJava;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan=new Sedan(150,20000,"Blue",22);
		Ford ford1=new Ford(160,25000,2000,2022,"Red");
		Ford ford2=new Ford(170,28000,1500,2023,"Green");
		Car car=new Car(180,30000,"Black");
		
		System.out.println("Sedan Sale Price:$" + sedan.getSalePrice());
		System.out.println("Ford1 Sale Price:$" + ford1.getSalePrice());
		System.out.println("Ford2 Sale Price:$" + ford2.getSalePrice());
		System.out.println("Car Sale Price:$" + car.getSalePrice());
		

	}

}
