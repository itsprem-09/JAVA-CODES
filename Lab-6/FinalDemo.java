class DBConfig{
    int speedLimit = 50;
	private String url = "asdfasdfasdf";
	private String user = "asdfasdf";
	private String pass = "asdfasdfas";

	public void connect(){
		//asdfasdfasdf
	}
	public void printSpeedLimit(){
		System.out.println("Speed limit for the vehicle = "+speedLimit);
	}
}
class Car extends DBConfig{
	final int speedLimit = 100;
	public void printSpeedLimit(){
		System.out.println("Speed limit for the car = "+speedLimit);
	}
}
public class FinalDemo{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.printSpeedLimit();
	}
}