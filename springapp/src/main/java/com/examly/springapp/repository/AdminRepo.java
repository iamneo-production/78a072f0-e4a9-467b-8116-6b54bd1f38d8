package main.java.com.examly.springapp.repository;
import main.java.com.examly.springapp.
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
		Admin findByUsername(String username);
}
