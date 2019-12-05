package be.ehb.demo.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeestDAO extends CrudRepository<Beest, Integer> {

    //dieren zoeken op soort
    Iterable<Beest>findBySoortOrderByNaam(String soort);


    @Query(value = "SELECT b from Beest where b.naam = :naam")
    Iterable<Beest>ZoekBijNaam(String naam);

}
