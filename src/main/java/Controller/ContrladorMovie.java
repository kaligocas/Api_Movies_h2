package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Movie;

import Service.ServicioMovie;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/Movies")


public class ContrladorMovie {


    @Autowired
    private ServicioMovie movieServicio;

    @PostMapping
    public ResponseEntity<?> PostMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieServicio.PostMovie(movie));

    }

    @GetMapping
    public ResponseEntity<List<Movie>> GetMovie(){
        return ResponseEntity.ok(movieServicio.GetMovie());

    }

    // http://localhost:8080/Movies

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeletetMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieServicio.DeleteMovie(id));

    }

    

    @PutMapping("/{id}")
    public ResponseEntity<?> PutMovie(@RequestBody Movie movie, @PathVariable Long id){
        return ResponseEntity.ok(movieServicio.PutMovie(movie, id));

    }
   
    
   
}
