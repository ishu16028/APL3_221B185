/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class q3
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Child ob1=new Child();
		Mother ob2=new Mother();
		Mother m1=new Child ( );
		m1.display();
	}
}

class Mother{
    public  static void display(){
        System.out.println("Inside Mother Class");
    }
}

class Child extends Mother{
    public static void display(){
        System.out.println("Inside child class");
    }
}