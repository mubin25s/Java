public interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Woof");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}

class Cow implements Animal{
    public void sound(){
        System.out.println("Moo");
    }
}

class Lion implements Animal{
    public void sound(){
        System.out.println("Roar");
    }
}

class Tiger implements Animal{
    public void sound(){
        System.out.println("Roar");
    }
}

class AnimalFactory{
    public static Animal getAnimal(String type){
        if(type.equals("Dog")){
            return new Dog();
        }else if(type.equals("Cat")){
            return new Cat();
        }else if(type.equals("Cow")){
            return new Cow();
        }else if(type.equals("Lion")){
            return new Lion();
        }else if(type.equals("Tiger")){
            return new Tiger();
        }else{
            return null;
        }
    }
}

public class Main{ 
    public static void main(String[] args) {
        Animal a = AnimalFactory.getAnimal("Tiger");
        a.sound();
    }
}