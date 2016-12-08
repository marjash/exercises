
public class Cat extends Animal { // ���� Cat ������� � ����� Animal
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
