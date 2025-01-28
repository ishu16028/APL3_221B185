/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Q4
{
    public static void main(String args[]){
        Two ob1=new Two(21);
    }
}

class One{
     One(int x){
        System.out.println(x);
    }
}

class Two extends One{
    Two(int j){
       super(j);
       System.out.println("constructor two has beem called");
    }
}