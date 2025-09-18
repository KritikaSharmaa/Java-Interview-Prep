package OOPS;


class Heart{
    String heartHealth;
    Heart(String heartHealth){
        this.heartHealth = heartHealth;
    }

    @Override
    public String toString(){
        return heartHealth;
    }
}

class Human {
    String name;
    int age;
    Heart heartHealth;

    Human(String name, int age, Heart heartHealth) {
        this.name = name;
        this.age = age;
        this.heartHealth = heartHealth; 
    }
}

public class Aggregation {
	public static void main(String[] args) {
        System.out.println("Composition in Java");
        Human h1 = new Human("John", 25, new Heart("Good"));    //create the Heart outside and pass it to Human constructor-This means the Heart exists independently of Human.
        System.out.println("Name: " + h1.name + ", Age: " + h1.age + ", Heart Health: " + h1.heartHealth.toString());
    }
}