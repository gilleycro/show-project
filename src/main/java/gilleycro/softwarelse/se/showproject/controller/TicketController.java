package gilleycro.softwarelse.se.showproject.controller;

import gilleycro.softwarelse.se.showproject.model.BetPlacer;
import gilleycro.softwarelse.se.showproject.model.Ticket;
import gilleycro.softwarelse.se.showproject.model.enums.STATUS;
import gilleycro.softwarelse.se.showproject.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/getticket")
    public Ticket getTicket(Long ticketId) {
        return ticketRepository.findById(ticketId).orElse(new Ticket());
    }

    @PostMapping("/placeticket")
    public Long placeTicket(@RequestBody BetPlacer betPlacer) {
        var ticket = new Ticket(betPlacer.getMatches(), STATUS.UNKNOWN);
        var result = ticketRepository.save(ticket);
        return result.getTicketId();
    }
}
