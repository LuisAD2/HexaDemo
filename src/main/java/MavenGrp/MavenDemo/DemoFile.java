package MavenGrp.MavenDemo;

class Animal{
	
	int maxSpeed = 120;
	
	public Animal() {
		System.out.println("I am super constructor");
	}
	
	public String Color="White";
	
	public void disp() {
		System.out.println("I am the disp method");
	}
	
}

class Dog extends Animal{
	int maxSpeed = 180;
	public Dog() {
		super();
		System.out.println("Testing");
	}
	
	public String Color="Black";
	
	   public void disp() {
		super.disp();
		System.out.println("I am the disp child method");
		 //+ super.maxSpeed + " "+ maxSpeed
	}
}

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("This is not my test file");
		Dog dg=new Dog();
		dg.disp();
		
		//System.out.println(dg.Color);
		
		/*if(args.length>0) {
			System.out.println(args.length);
		}*/
		/*int x;
		x=5;
		{
			int y=6;
			System.out.println(x+ " " + y);
		}
		System.out.println(x + " " + y);*/
		/*int p=1;
		int q=2;
		int r=3;
		p |=4;
		q >>=1;
		r<<=1;
		p ^=r;
		System.out.println(q + " " + q + " "+ r);*/
	}

}
