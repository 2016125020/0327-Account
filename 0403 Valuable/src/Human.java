public class Human implements Valuable{
	private String name;
	private int age;
	private double POSITIVE_INFINITY;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return String.format("Human name : %s \nRegistered age : %d", name, age);
	}
	
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}	
}
