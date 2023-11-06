package com.example.test.Repository;

import com.example.test.Entity.CoursClassroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {
}
