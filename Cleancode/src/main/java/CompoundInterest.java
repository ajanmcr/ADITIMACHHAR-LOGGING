import java.util.logging.Logger;public class CompoundInterest {
	void compute(int principle, int time, double rate, int number) {
		double amount = principle * Math.pow(1+(rate / number), number * time);
		double cinterest = amount - principle;
		Logger LOGGER =  
                Logger.getLogger(Logger.class.getName()); 
		LOGGER.info("Compound interest after" + time + "years is " + cinterest);
		LOGGER.info("\nAmount after" + time + " years is " +  amount);
	}
}
