package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByGuardianName(String guardianName);

    //JPQL
    @Query("select s from Student s where s.emailId = ?1")
    Student findByEmailId(String emailId);

    //native query
    @Query(value = "SELECT * FROM student s where s.email_id = ?1", nativeQuery = true)
    Student getStudentByEmailIdNative(String emailId);
}
