import java.util.logging.Logger;

public class SimpleInterest {
	void Simple(int principle, double rate, int time) {
		double simpleI = (principle * rate * time) / 100;
		Logger LOGGER =  
                Logger.getLogger(Logger.class.getName()); 
		LOGGER.info("Simple interest after" + time + " years is " +  simpleI);

	}
}
