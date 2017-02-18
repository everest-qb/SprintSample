package tw.taichung.spring.test;

import org.springframework.data.repository.CrudRepository;

import tw.taichung.spring.test.jpa.Abc;

public interface AbcRepository extends CrudRepository<Abc, Integer> {
	
	/*@Query("select h.city as city, h.name as name, avg(r.rating) as averageRating "
			+ "from Hotel h left outer join h.reviews r where h.city = ?1 group by h")
	Page<HotelSummary> findByCity(City city, Pageable pageable);*/
}
