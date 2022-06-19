package practice;

public class Scooter extends Vehicle {
void start()
{
	System.out.println("scooter starts with kick");
}
public static void main(String[] args)
{
	//Vehicle v=new Vehicle();
	Car c=new Car();
	c.start();
	
	Scooter s=new Scooter();
	s.start();
	
}
}
