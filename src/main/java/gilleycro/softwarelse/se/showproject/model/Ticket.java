package gilleycro.softwarelse.se.showproject.model;

import gilleycro.softwarelse.se.showproject.model.enums.STATUS;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="ticket")
public class Ticket {

    //todo: idea, start id for tickets from specific number
    @Id
    private long ticketId;

    @OneToMany
    private Set<Match> matches;

    private STATUS ticketStatus;
}
