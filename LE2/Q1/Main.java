/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Voice{
    void prepareVoice(){
        Animal[] animal=new Animal[5];
        array[0]=new Animal("Cow");
        array[1]=new Animal("Dog");
        array[2]=new Animal("Pig");
        array[3]=new Animal("Goat");
        array[4]=new Animal("Lion");
        hear(animal);
    }
    void hear(Animal[] animal){
        for(int i=0;i<5;i++){
            animal[i].makeVoice();
        }
    }
}