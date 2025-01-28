/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LE1q2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Child ob1=new Child();
		Mother ob2=new Mother();
		ob1.display();
		ob2.display();
		//ob1.super.display();
	}
}

class Mother{
    public void display(){
        System.out.println("Inside Mother Class");
    }
}

class Child extends Mother{
    public void display(){
        super.display();
        System.out.println("Inside child class");
    }
}