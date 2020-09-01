package SurgeprojectRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SurgeprojectRest.Model.BookRequest;
import SurgeprojectRest.Repository.BookMyShowRepository;


@SpringBootApplication
@RequestMapping("BookMyShow/Service")
public class ConsumeRestcallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestcallApplication.class, args);
	}
}
