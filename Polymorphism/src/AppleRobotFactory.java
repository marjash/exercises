
public class AppleRobotFactory implements RobotFactory {

    @Override
    public SportRobot getSportRobot() {
        return new AppleSportRobot();
    }

    @Override
    public HomeRobot getHomeRobot() {
        return new AppleHomeRobot();
    }
}
