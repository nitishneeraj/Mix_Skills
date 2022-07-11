package RestAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import RestAPI.Controller.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
