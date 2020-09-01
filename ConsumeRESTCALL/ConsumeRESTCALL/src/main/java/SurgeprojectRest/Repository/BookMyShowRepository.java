package SurgeprojectRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SurgeprojectRest.Model.BookRequest;

public interface BookMyShowRepository extends JpaRepository<BookRequest, Integer>{

}