package gilleycro.softwarelse.se.showproject.controller;

import gilleycro.softwarelse.se.showproject.model.Ticket;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @PostMapping()
    public void placeTicket(@RequestBody Ticket ticket){

    }
}
