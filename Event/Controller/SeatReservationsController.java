package Event.Event.Controller;

import Event.Event.DTO.SeatReservationsDTO;
import Event.Event.Entities.SeatReservations;
import Event.Event.Service.SeatReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/seatreservations")
public class SeatReservationsController {
    @Autowired
    private SeatReservationService seatReservationService;
    @GetMapping
    public List<SeatReservations> getAllSeatReservations() {
        return seatReservationService.getAllSeatReservations();
    }

    @GetMapping("/name")
    public ResponseEntity<?> getAllByName(@RequestParam("name") String name){

        return ResponseEntity.ok().body( seatReservationService.FindByName(name));
    }
    @GetMapping("/status")
    public ResponseEntity<?> getAllByStatus(@RequestParam("status") String status){
        if(status==null){
            ResponseEntity.badRequest().body("No status is Found");
        }
        return ResponseEntity.ok().body(seatReservationService.FindByStatus(status));
    }

}
