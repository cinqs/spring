package tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController{

	@RequestMapping("/basic")
	public String basci(@RequestParam(value="show", defaultValue="i am default") String show){
		return show;
	}
}
