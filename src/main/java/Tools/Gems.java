package Tools;

public enum Gems {

    RUBY(10),
    DIAMOND(20),
    EMERALD(5),
    SAPHIRE(10);



    public final int value;
     Gems(int value){
        this.value= value;

    }


    public int getValue() {
        return value;
    }
}


