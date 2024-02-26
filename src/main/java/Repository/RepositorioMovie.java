package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Movie;


public interface RepositorioMovie extends JpaRepository<Movie, Long> {

    void delete(Long id);

}
