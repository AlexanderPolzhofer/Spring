package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Guardian;
import at.campus.springDataJPA.entity.Student;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    public void printAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("List of students: " + studentList);
    }

    @Test
    public void printAllStudentsByFirstName() {
        List<Student> students = studentRepository.findByFirstName("Alexander");
        System.out.println("student: " + students);
    }

    @Test
    public void printAllStudentsByFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("lex");
        System.out.println("student: " + students);
    }

    @Test
    public void printByGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("knight");
        System.out.println("student: " + students);
    }

    @Test
    public void findStudentByEmailId() {
        Student student = studentRepository.findByEmailId("person@test.com");
        System.out.println("student: " + student);
    }

    @Test
    public void getStudentByEmailIdNativeQuery() {
        Student student = studentRepository.getStudentByEmailIdNative("alexander@polzhofer.com");
        System.out.println("student: " + student);
    }
}