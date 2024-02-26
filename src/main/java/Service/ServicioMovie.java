package Service;


import java.util.List;

import Model.Movie;


public interface ServicioMovie {
    
    List<Movie> GetMovie();

    String DeleteMovie(Long id);

    String PostMovie(Movie movie);

    String PutMovie(Movie movie , Long id);

}
