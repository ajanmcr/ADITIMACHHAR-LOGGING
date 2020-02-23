import java.util.Scanner;
import java.util.logging.Logger;

public class MainCompound {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Logger LOGGER =  
                Logger.getLogger(Logger.class.getName()); 

		Scanner scanner = new Scanner(System.in);
		int principle, time, number;
		double rate;
		LOGGER.info("Enter Principle amount : ");
		principle = scanner.nextInt();
		LOGGER.info("Enter time : ");
		time = scanner.nextInt();
		LOGGER.info("Enter annual interest rate : ");
		rate = scanner.nextDouble();
		LOGGER.info("Enter number of times : ");
		number = scanner.nextInt();
		CompoundInterest compoundInterest = new CompoundInterest();
		compoundInterest.compute(principle, time, rate, number);
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.Simple(principle, rate, time);
	}

}
