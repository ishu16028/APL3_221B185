class Beer extends Beverage{
    public void addCondiments(){
        System.out.println("Add nothing.");
    }
}

abstract class Beverage{

    protected void pourBeverage(int qnt){
        System.out.println("Pour " + qnt + " of beverage into a glass.");
    }
    protected abstract void addCondiments();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve through waiter.");
    }
    final public void templateMethod(int qnt){
        pourBeverage(qnt);
        addCondiments();
        stir();
        serve();
    }
}

class Whisky extends Beverage{
    public void addCondiments(){
        System.out.println("Add soda.");
    }
    public void stir(){
        System.out.println("Stir for 30 seconds.");
    }
}

class Main{
    public static void main(String args[]){
        Beverage b = new Whisky();
        b.templateMethod(30);
        b = new Beer();
        b.templateMethod(200);
    }
}