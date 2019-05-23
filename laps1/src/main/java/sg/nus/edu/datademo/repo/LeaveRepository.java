package sg.nus.edu.datademo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.nus.edu.datademo.model.LeaveDetail;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveDetail, Integer>{

		List<LeaveDetail> findByCategory(String category);

		Optional<LeaveDetail> findById(String id);

}