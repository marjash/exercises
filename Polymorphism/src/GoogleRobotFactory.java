
public class GoogleRobotFactory implements RobotFactory {
	@Override
    public SportRobot getSportRobot() {
        return new GoogleSportRobot();
    }

    @Override
    public HomeRobot getHomeRobot() {
        return new GoogleHomeRobot();
    }
}
