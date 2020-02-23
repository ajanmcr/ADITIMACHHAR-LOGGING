import java.util.Scanner;
import java.util.logging.Logger;

public class MainConstruction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double area;
		String standard;
		boolean fullyAutomated;
		Logger LOGGER =  
                Logger.getLogger(Logger.class.getName()); 

		LOGGER.info("Enter the area");
		area = scanner.nextDouble();
		LOGGER.info("Enter the standard");
		standard = scanner.next();
		LOGGER.info("Fully Automated or not");
		fullyAutomated = scanner.nextBoolean();
		Construction construction = new Construction();
		construction.compute(standard, fullyAutomated, area);

		
	}

}
