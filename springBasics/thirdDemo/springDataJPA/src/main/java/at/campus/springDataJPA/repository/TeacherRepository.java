package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher,Long> {

}
