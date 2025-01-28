/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LE0q1
{
    int age;
    String name;
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
	public static void main(String[] args) {
	    Main m1 = new Main();
	    System.out.println(m1.getName()+" "+m1.getAge());
		System.out.println("Hello World");
		m1.setName("Ishu");
		m1.setAge(20);
		System.out.println(m1.getName()+" "+m1.getAge());
	}
}