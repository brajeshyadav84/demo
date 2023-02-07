package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService; 

	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@DeleteMapping("/courses/{id}")
    public String deleteBook(@PathVariable String id){
		courseService.deleteCourse(id);
        
        return "Deleted Successfully";
    }
	
	//@RequestMapping(method = RequestMethod.POST, value="/courses")
	@PostMapping("/courses")
	public String addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
		return "Added Successfully";
	}
	
}
