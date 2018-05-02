package yuriuss.spring.studying.service;

import org.junit.Test;

import java.util.List;

public class CinemaServiceTest {

  private CinemaService cinemaService;

  @Test
  public void contextLoads() {
    List<String> films = new CinemaService().getFilms();
  }

}