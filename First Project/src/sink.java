import com.pi4j.io.gpio.GpioPinDigitalOutput;

public class sink {
	private static void sink() throws InterruptedException {
		GpioPinDigitalOutput relay1 = null;
		relay1.low();
		GpioPinDigitalOutput relay2 = null;
		relay2.high();
		System.out.println("Actuator Retracting"); //Glider taking on water
		Thread.sleep(20000);
	}

}
