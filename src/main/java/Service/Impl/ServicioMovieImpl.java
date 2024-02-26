package Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Movie;
import Repository.RepositorioMovie;

import Service.ServicioMovie;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ServicioMovieImpl implements ServicioMovie{

    

    @Autowired
    private RepositorioMovie movieRepositorio;


    @Override
    public String DeleteMovie(Long id) {
       
        movieRepositorio.delete(id);
        return "Pelicula eliminada con exito"; 
    }

    @Override
    public List<Movie> GetMovie() {
        return movieRepositorio.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public String PostMovie(Movie movie) {
        
        movieRepositorio.save(movie);
        return "Pelicula guardada con exito";
    }

    @Override
    public String PutMovie(Movie movie, Long id) {
      
    @SuppressWarnings("null")
    Movie movies2 = movieRepositorio.findById(id).get();

       if (movies2 !=null) {
            movies2.setNombre(movie.getNombre());
            movies2.setCategoria(movie.getCategoria());

            movieRepositorio.save(movies2);

            return "Pelicula Actualizada";

       }
       else{
        return "Hubo un error";
       }
    }

    public RepositorioMovie getMovieRepositorio() {
        return movieRepositorio;
    }

    public void setMovieRepositorio(RepositorioMovie movieRepositorio) {
        this.movieRepositorio = movieRepositorio;
    }


   

    

    

}
