
public class RobotFactoryTest {
	public static void main(String[] args) {

        RobotFactory factory = new AppleRobotFactory();
        Robot homeRobot = factory.getHomeRobot();
        Robot sportRobot = factory.getSportRobot();

        System.out.println("Made by: " + homeRobot.madeBy() + ", type: " + homeRobot.getType());
        System.out.println("Made by: " + sportRobot.madeBy() + ", type: " + sportRobot.getType());

        factory = new GoogleRobotFactory();
        homeRobot = factory.getHomeRobot();
        sportRobot = factory.getSportRobot();

        System.out.println("Made by: " + homeRobot.madeBy() + ", type: " + homeRobot.getType());
        System.out.println("Made by: " + sportRobot.madeBy() + ", type: " + sportRobot.getType());


    }

}
