package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired()
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id){
		courseRepository.deleteById(id);
    }
}
