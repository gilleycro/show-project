package gilleycro.softwarelse.se.showproject.repository;

import gilleycro.softwarelse.se.showproject.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
