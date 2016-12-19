
public class Animal {
	private String kind;
    private String name;
    private int age;
    
    protected String getKind() { 
	    return kind; 
    }
    
    protected String getName() { 
	    return name;
    }
    
    protected int getAge() {
    	return age;
    }
  
    public Animal(String kind, String name, int age) {     
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public void display() {
	    System.out.println("Kind: " + kind + ", Name: " + name + ", Age " + age);
    }
}
