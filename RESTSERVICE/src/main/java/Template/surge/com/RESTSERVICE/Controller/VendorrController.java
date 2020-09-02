package Template.surge.com.RESTSERVICE.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Template.surge.com.RESTSERVICE.Model.Vendor;
import Template.surge.com.RESTSERVICE.Service.ServiceLayer;

@RestController
//@RequestMapping("/myapp")
public class VendorrController {
	
	@Autowired
	private ServiceLayer servlay;
	
	@RequestMapping (value = "/getdataObjectofVendor/{vendorId}" , method = RequestMethod.GET)
	public Optional<Vendor> getVend(@PathVariable("vendorId") Integer vendorId) {
		
		servlay.getVendor(vendorId);
		
		return servlay.getVendor(vendorId);
	}
	
	
	
	/*
	 * @Autowired private RestTemplate restTemplate;//RestTemplate extend another
	 * class
	 * 
	 * //Return list of Object
	 * 
	 * @GetMapping("/Countries") public List<Object> getCountries(){ String url =
	 * "http://localhost:8081/countries"; Object[] objects =
	 * restTemplate.getForObject(url, Object[].class); return
	 * Arrays.asList(objects); }
	 */
}
