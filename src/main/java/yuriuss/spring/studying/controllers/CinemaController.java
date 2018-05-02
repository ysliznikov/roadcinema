package yuriuss.spring.studying.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yuriuss.spring.studying.service.CinemaService;

@Controller
public class CinemaController {
    private final Logger logger = LoggerFactory.getLogger(CinemaController.class);
    private final CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("@ Index() is executed!");

        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("title", "Welcome to RoadCinema!");
        return model;
    }




}
