package gilleycro.softwarelse.se.showproject.model;

import gilleycro.softwarelse.se.showproject.model.enums.STATUS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Ticket {

    //todo: idea, start id for tickets from specific number
    @Id
    private long id;

    @OneToMany
    private Set<Match> matches;

    private STATUS ticketStatus;
}
