package raycook.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raycook.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
