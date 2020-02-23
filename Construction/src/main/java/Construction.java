import java.util.logging.Logger;

public class Construction {
	void compute(String standard, boolean fullyAutomated, double area) {
		double result = 0;
		if(standard.equals("standard")) {
			result = 1200 * area;
		}
		else if (standard.equals("above")) {
			result = 1500 * area;
		}
		else if (standard.equals("higher")&& fullyAutomated) {
			result = 2500 * area;
		} 
		else if (standard.equals("higher") ) {
			result = 1800 * area;
		} 
		Logger LOGGER =  
                Logger.getLogger(Logger.class.getName()); 

		LOGGER.info("The cost of construction is" + result);
	}
	
}
 