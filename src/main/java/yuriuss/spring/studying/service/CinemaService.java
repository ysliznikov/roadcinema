package yuriuss.spring.studying.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaService {
    private static final Logger logger = LoggerFactory.getLogger(CinemaService.class);


    public List<String> getFilms() {
        logger.info("@ Get available films ...");
        List<String> films = new ArrayList<>();
        films.add("Man in black III");
        films.add("Avatar");
        films.add("Predator");
        return films;
    }

    public String getAddress() {
        return "194021, Gravity Falls, OR, USA";
    }

}
