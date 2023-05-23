package Event.Event.Repository;

import Event.Event.Entities.SeatReservations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatReservationsRepo extends JpaRepository<SeatReservations,Integer> {

    List<SeatReservations> findByName (String name);
    List<SeatReservations> findByStatus(String status);
}
