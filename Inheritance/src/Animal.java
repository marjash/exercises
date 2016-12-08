
public class Animal {
	private String kind;
    private String name;
    
    protected String getKind() { 
	    return kind; 
    }
    
    protected String getName() { 
	    return name;
    }
  
    public Animal(String kind, String name) {     
        this.kind = kind;
        this.name = name;
    }

    public void display() {
	    System.out.println("Kind: " + kind + ", Name: " + name);
    }
}
