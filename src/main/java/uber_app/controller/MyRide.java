package uber_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRide {
	
	@GetMapping("/pickup")
	public String destination() {
		return "mydestination";
	}

}
