class Voice{
    void prepareVoice(){
        Animal[] animal=new Animal[5];
        array[0]=new Animal("Cow");
        array[1]=new Animal("Dog");
        array[2]=new Animal("Pig");
        array[3]=new Animal("Goat");
        array[4]=new Animal("Lion");
    }
    void hear(){
        for(int i=0;i<5;i++){
            animal[i].makeVoice();
        }
    }
    
}