class Animal {
void sound() {
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
void Barks() {
System.out.println("Dog Barks");
}
}
public class Main {
public static void main(String[] args) {
Dog d=new Dog();
d.sound();
d.Barks();
}
}

