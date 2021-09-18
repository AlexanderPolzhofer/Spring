package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Course;
import at.campus.springDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {
        Teacher teacher = Teacher.builder()
                .firstName("Alexander")
                .lastName("Teacher")
                .build();
        teacherRepository.save(teacher);
    }

}