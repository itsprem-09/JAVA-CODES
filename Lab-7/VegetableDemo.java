abstract class Vegetable{
    String color;
    abstract public String toString();
}

class Potato extends Vegetable{
    public Potato(){
        color = "Yellow";
    }
    public String toString(){
        return color;
    }
}
class Brinjal extends Vegetable{
    public Brinjal(){
        color = "Purple";
    }
    public String toString(){
        return color;
    }
}
class Tomato extends Vegetable{
    public Tomato(){
        color = "Red";
    }
    public String toString(){
        return color;
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Potato p = new Potato();
        System.out.println("Color of Potato : "+p.toString());

        Brinjal b = new Brinjal();
        System.out.println("Color of Brinjal : "+b.toString());

        Tomato t = new Tomato();
        System.out.println("Color of Tomato : "+t.toString());
        
    }
}
