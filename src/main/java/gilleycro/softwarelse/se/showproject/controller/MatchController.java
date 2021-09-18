package gilleycro.softwarelse.se.showproject.controller;

import gilleycro.softwarelse.se.showproject.model.Match;
import gilleycro.softwarelse.se.showproject.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/v1/matches")
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @GetMapping("/playable")
    public Set<Match> fetchPlayableMatches(){
        return matchRepository.findAllPlayable();
    }

    @GetMapping("/all")
    public List<Match> fetchAllMatches(){
        return matchRepository.findAll();
    }

}
