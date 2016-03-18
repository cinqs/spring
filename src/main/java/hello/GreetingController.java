package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "default") String name){
		System.out.printf("GET received, /greeting with name: %s", name );
		return new Greeting(counter.incrementAndGet(),
		String.format(template, name));
	}
	@RequestMapping("/cisong")
	public Cisong cisong(@RequestParam(value = "cisong", defaultValue = "Ci SONG") String name){
		System.out.printf("GET received, /cisong with name: %s", name );
		return new Cisong(3, true);
	}
}
