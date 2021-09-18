package gilleycro.softwarelse.se.showproject.repository;

import gilleycro.softwarelse.se.showproject.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query( value = "SELECT * FROM match m WHERE m.start_time >  NOW() - INTERVAL '5 MINUTES' AND m.status = 'UNKNOWN'",
            nativeQuery = true)
    public Set<Match> findAllPlayable();
}
