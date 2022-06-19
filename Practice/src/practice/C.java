package practice;

class C extends B{
	void showC()
	{
		System.out.println("C class method");
	}
public static void  main(String[] args)
{
	A ob1= new A();
	ob1.showA();
	
	System.out.println("----------------");

	B ob2=new B();
	ob2.showB();		//B object through i can call itself
	ob2.showA();		//B object through i can call A method
	
	System.out.println("----------------");

	C ob3=new C();
	ob3.showC();		//C object through i can call itself
	ob3.showB();		//C object through i can call B method
	ob3.showA();		//C object through i can call A method

}
}
