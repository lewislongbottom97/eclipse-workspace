import com.pi4j.io.gpio.GpioPinDigitalOutput;

public class stopActuator {
	private static void stopActuator() throws InterruptedException {
		GpioPinDigitalOutput relay1 = null;
		relay1.low();
		GpioPinDigitalOutput relay2 = null;
		relay2.low();
		System.out.println("Actuator Stopped"); //Glider is bottomed out
		Thread.sleep(10000);
	}
}
