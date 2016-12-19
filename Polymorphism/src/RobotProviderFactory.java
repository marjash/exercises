
public class RobotProviderFactory {
	public static RobotFactory getFactoryProvider(FactoryProvider provider) {
        switch (provider) {
            case APPLE:
                return new AppleRobotFactory();
            case GOOGLE:
                return new GoogleRobotFactory();
            default:
                System.out.println("Unexpected provider");
                return null;
        }
    }

}
