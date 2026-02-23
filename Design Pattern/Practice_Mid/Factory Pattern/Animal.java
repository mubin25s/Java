public interface animal{
    void sound();
}

class Dog implements animal{
    public void sound(){
        System.out.println("Woof");
    }
}

class Cat implements animal{
    public void sound(){
        System.out.println("Meow");
    }
}

class Cow implements animal{
    public void sound(){
        System.out.println("Moo");
    }
}

class Lion implements animal{
    public void sound(){
        System.out.println("Roar");
    }
}

class Tiger implements animal{
    public void sound(){
        System.out.println("Roar");
    }
}

class AnimalFactory{
    public static animal getAnimal(String type){
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

public class Animal {
    public static void main(String[] args) {
        animal a = AnimalFactory.getAnimal("Tiger");
        a.sound();
    }
}