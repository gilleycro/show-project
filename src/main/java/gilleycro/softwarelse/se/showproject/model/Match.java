package gilleycro.softwarelse.se.showproject.model;


import gilleycro.softwarelse.se.showproject.model.enums.STATUS;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="match_generator")
    @SequenceGenerator(name = "match_generator", sequenceName = "match_sequence", allocationSize = 1)

    private long matchId;

    @Enumerated(EnumType.STRING)
    private STATUS STATUS;

    private Instant startTime;

}
