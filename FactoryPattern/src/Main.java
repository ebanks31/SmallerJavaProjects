
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(CarFactory.getCar(CarSize.SMALL));
		
		Car car = CarFactory.getCar(CarSize.SMALL);
		
		car.printCarName();
	}

}
