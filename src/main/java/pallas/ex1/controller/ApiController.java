package pallas.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping(value="/teszt/{name}")
	public String index(@PathVariable("name") String name) {
		String result = "Szia";
		return result+" "+name+" !";
	}
	
	@GetMapping("/GetInvoiceItemInitPage")
	public String database() {
		return "Database!!!!!!!";
	}
}
