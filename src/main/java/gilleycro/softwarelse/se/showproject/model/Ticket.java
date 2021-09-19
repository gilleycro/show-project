package gilleycro.softwarelse.se.showproject.model;

import gilleycro.softwarelse.se.showproject.model.enums.STATUS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ticket_generator")
    @SequenceGenerator(name = "ticket_generator", sequenceName = "ticket_sequence", allocationSize = 1)
    private long ticketId;

    @ManyToMany
    @JoinTable(
            name = "ticket_matches",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "match_id"))
    private Set<Match> matches;

    private STATUS ticketStatus;

    public Ticket(Set<Match> matches, STATUS ticketStatus) {
        this.matches = matches;
        this.ticketStatus = ticketStatus;
    }
}
