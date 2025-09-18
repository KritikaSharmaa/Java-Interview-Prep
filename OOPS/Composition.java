package OOPS;


class Heart1{
    String heartHealth;
    Heart1(String heartHealth){
        this.heartHealth = heartHealth;
    }

    @Override
    public String toString(){
        return heartHealth;
    }
}

class Human1 {
    String name;
    int age;
    Heart1 heartHealth;

    Human1(String name, int age) {
        this.name = name;
        this.age = age;
        this.heartHealth = new Heart1("Good"); // Composition: Human has a Heart
    }
}

public class Composition {
	public static void main(String[] args) {
        System.out.println("Composition in Java");
        Human1 h1 = new Human1("John", 25);    //create the Heart outside and pass it to Human constructor-This means the Heart exists independently of Human.
        System.out.println("Name: " + h1.name + ", Age: " + h1.age + ", Heart Health: " + h1.heartHealth.toString());
    }
}