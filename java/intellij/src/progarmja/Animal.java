package progarmja;

public class Animal {
    void makesound(){
        System.out.println("Animal sound");
    }
}
class cat extends Animal{
        void makesound() {
            System.out.println("Cat meaw");
    }
}
class dog extends Animal{

    void makesound() {
        System.out.println("Dog Barking");
    }
}
class elephent extends Animal{
    void makesound() {
        System.out.println("Elephent Trumpeting");
    }
}
class polymorphism{
    public static void main(String[] args) {
        Animal animal;
        animal=new cat();
        animal.makesound();
        animal=new dog();
        animal.makesound();
        animal=new elephent();
        animal.makesound();
    }
}

