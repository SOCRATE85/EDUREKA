package Template.surge.com.RESTSERVICE.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Template.surge.com.RESTSERVICE.Model.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Integer> {

}
