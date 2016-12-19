
public class Cat extends Animal {
	private int toneMeow;

    public Cat(String kind, String name, int age, int toneMeow) {
	    super(kind, name, age);
	    this.toneMeow = toneMeow;
    }
    
    public int toneMeow() {
        return toneMeow;
    }
    
    public void meow() {
         System.out.println("Meow!");
         System.out.println("Tone meow: " + toneMeow);
    }

}
