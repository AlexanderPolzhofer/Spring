package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Guardian;
import at.campus.springDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .firstName("Alexander")
                .lastName("Polzhofer")
                .emailId("alexander@polzhofer.com")
//                .guardianName("knight")
//                .guardianEmail("knight@mail.com")
//                .guardianMobile("436015278925465")
                .build();
        this.studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("guardianTheEvil")
                .mobileNumber("0043658792451")
                .email("guardian@test.com")
                .build();

        Student student = Student.builder()
                .firstName("Person")
                .lastName("Test")
                .emailId("person@test.com")
                .guardian(guardian)
                .build();
        this.studentRepository.save(student);
    }
}