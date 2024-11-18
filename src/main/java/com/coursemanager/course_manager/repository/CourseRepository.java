package com.coursemanager.course_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanager.course_manager.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByName(String name);

}
