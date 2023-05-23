package Event.Event.Service;

import Event.Event.DTO.SeatReservationsDTO;
import Event.Event.Entities.SeatReservations;
import Event.Event.Entities.SnackOrder;
import Event.Event.Repository.SeatReservationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatReservationService {
    @Autowired
    private SeatReservationsRepo seatReservationRepository;

    public List<SeatReservations> getAllSeatReservations() {
        return seatReservationRepository.findAll();
    }

    public List<SeatReservations> FindByName(String name) {
            return seatReservationRepository.findByName(name);
        }

    public List<SeatReservations> FindByStatus(String status){
        return seatReservationRepository.findByStatus(status);
    }
}
