
public class Cat extends Animal { // клас Cat унаслідує з класу Animal
	private int age;

    public Cat(String kind, String name, int age) {
	    super(kind, name);
	    this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void meow() {
         System.out.println("Meow!");
    }

}
