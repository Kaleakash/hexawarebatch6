class Car {
	Car() {
		System.out.println("Object created....");
	}
	void carInfo() {
		System.out.println("Car Info method");	
	}	
}
class CarTest {
	public static void main(String args[]){
	Car santro = new Car();	
	santro.carInfo();	
	}
}