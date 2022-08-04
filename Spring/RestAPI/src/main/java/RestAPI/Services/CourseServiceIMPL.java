package RestAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestAPI.Controller.entities.Course;
import RestAPI.Dao.CourseDao;


@Service
public class CourseServiceIMPL implements CourseService {

	@Autowired
	private CourseDao  courseDao;
	
//	List<Course> list;
	public CourseServiceIMPL() {
		
//		list = new ArrayList<>();
//		list.add(new Course(145,"java core courses","this course basic of java"));
//		list.add(new Course(146,"Spring Boot courses","Create rest API using spring boot")); 
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseID) {
		// TODO Auto-generated method stub
		
//		Course c= null;
//		for (Course course : list) {
//			if(course.getId()==courseID) {
//				c = course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseID);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e ->e.getId() != parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

}
