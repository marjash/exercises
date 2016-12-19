
public class FactoryMethodTest {
	public static void main(String [] args) {

        RobotFactory factory = RobotProviderFactory.getFactoryProvider(FactoryProvider.GOOGLE);
        Robot homeRobot = factory.getHomeRobot();
        Robot sportRobot = factory.getSportRobot();

        System.out.println("Made by: " + homeRobot.madeBy() + ", type: " + homeRobot.getType());
        System.out.println("Made by: " + sportRobot.madeBy() + ", type: " + sportRobot.getType());

        factory = RobotProviderFactory.getFactoryProvider(FactoryProvider.APPLE);
        homeRobot = factory.getHomeRobot();
        sportRobot = factory.getSportRobot();

        System.out.println("Made by: " + homeRobot.madeBy() + ", type: " + homeRobot.getType());
        System.out.println("Made by: " + sportRobot.madeBy() + ", type: " + sportRobot.getType());
    }

}

