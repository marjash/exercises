
public class FoodStore {
	public static void main (String[] args) {
        Watermelon watermelon = new Watermelon();
        watermelon.setWeight(-5);
        System.out.println(watermelon.getWeight());
        watermelon.setWeight(5);
        System.out.println(watermelon.getWeight());
    }
}
