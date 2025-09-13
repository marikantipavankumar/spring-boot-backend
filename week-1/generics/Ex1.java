public class Ex1{
    public static void main(String[] args) {

        AlmondBox almondBox = new AlmondBox(10);
        almondBox.add(new Almond("California almond"));
        almondBox.add(new Almond("India almond"));
        almondBox.add(new Almond("NZ almond"));
        almondBox.add(new Almond("Srilanka almond"));
        almondBox.add(new Almond("US almond")); 
        System.out.println(almondBox.get(3));

        CashewBox cashewBox = new CashewBox(10);
        cashewBox.add(new Cashew("California cashew"));
        cashewBox.add(new Cashew("India cashew"));
        cashewBox.add(new Cashew("Srilanka cashew"));
        cashewBox.add(new Cashew("NZ cashew"));
        System.out.println(cashewBox.get(3));
    }
}
class Almond{
    String name;

    public Almond(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Almond [name= " +name + "]";
    }
}

class AlmondBox{
    Almond[] almonds;
    int index;
    public AlmondBox(int size){
        almonds  = new Almond[size];
        index = 0;
    }
    public void add(Almond almond){
        almonds[index]= almond;
        index++;
    }

    public Almond get(int i){
        return almonds[i];
    }
}
