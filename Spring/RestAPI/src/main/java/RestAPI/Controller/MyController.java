package RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RestAPI.Controller.entities.Course;
import RestAPI.Services.CourseService;

@RestController // Rest:- representational state transfer (jisme data json ya xmal ki format me
				// tranfer krte h
public class MyController {

	@Autowired  //Automatic obj create interface class
	private CourseService C_Services;

	@GetMapping("/home")
	public String home() {
		return "This is my Controller page :";
	}

	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses() {

		return this.C_Services.getCourses();
	}
	
	
	//Single course get
	@GetMapping("/courses/{courseID}")
	public Course getsCourse(@PathVariable String courseID) {
		return this.C_Services.getCourse(Long.parseLong(courseID));
	}
	
	// course add
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.C_Services.addCourse(course);
	}
	
	//Update course using PUT request
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return this.C_Services.updateCourse(course);
	}
	
	
	//Delete Course
	@DeleteMapping("/courses/{courseID}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseID){
		try {
			this.C_Services.deleteCourse(Long.parseLong(courseID));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
