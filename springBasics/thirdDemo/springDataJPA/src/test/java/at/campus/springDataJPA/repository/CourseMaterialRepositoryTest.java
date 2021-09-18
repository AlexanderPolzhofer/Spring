package at.campus.springDataJPA.repository;

import at.campus.springDataJPA.entity.Course;
import at.campus.springDataJPA.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

//    @Test
//    public void saveCourseMaterial() {
////        Course course = Course.builder()
////                .credit(25)
////                .title("football")
////                .build();
////
////        CourseMaterial courseMaterial = CourseMaterial.builder()
////                .course(course)
////                .url("www.football.com")
////                .build();
////        this.repository.save(courseMaterial);
////    }

}