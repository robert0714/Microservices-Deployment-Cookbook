package com.packt.microservices.geolocation;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
@RequestMapping("/geolocation")
public class GeoLocationController {
	
	@Autowired
	private GeoLocationService service ;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody GeoLocation create(@RequestBody GeoLocation geoLocation) throws Exception {
	 

		 return service.create(geoLocation);
	}

	@RequestMapping( method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<GeoLocation> findAll() throws Exception {
		 
		return service.findAll();
	}
}
