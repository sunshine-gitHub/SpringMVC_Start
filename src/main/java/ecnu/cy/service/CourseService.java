package ecnu.cy.service;

import org.springframework.stereotype.Service;

import ecnu.cy.model.Course;
@Service
public interface CourseService {
	Course getCoursebyId(Integer courseId);
}
