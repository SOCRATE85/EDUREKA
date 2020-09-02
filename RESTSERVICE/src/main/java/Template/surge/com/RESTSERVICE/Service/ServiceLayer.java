package Template.surge.com.RESTSERVICE.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Template.surge.com.RESTSERVICE.Model.Vendor;
import Template.surge.com.RESTSERVICE.Repository.VendorRepository;

@Service
public class ServiceLayer {

	@Autowired
	private VendorRepository vendorRepository;
	
	public Optional<Vendor> getVendor(Integer vendorId) {
		return vendorRepository.findById(vendorId);
	}
}
