package tutorial;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@RestController
@Component
public class BasicController{

	private int count = 1;

	@RequestMapping("/basic")
	public String basic(@RequestParam(value="show", defaultValue="I am default") String show){
		return new ShowDate().toString();
	}

	@Scheduled(fixedRate = 2000)
	public void sendNo(){
		System.out.println(count);
		count++;
	}
}
