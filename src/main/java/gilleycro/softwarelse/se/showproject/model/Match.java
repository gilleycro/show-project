package gilleycro.softwarelse.se.showproject.model;


import gilleycro.softwarelse.se.showproject.model.enums.STATUS;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Match {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matchId;

    @Enumerated(EnumType.STRING)
    private STATUS STATUS;

    private Instant startTime;

}
