package com.example.test.Service;

import com.example.test.Entity.CoursClassroom;

import java.util.List;

public interface ICoursClassroomService {
    public CoursClassroom addCoursClassroom (CoursClassroom r);
    public CoursClassroom updateCoursClassroom (CoursClassroom r);
    public void deleteCoursClassroom (int CoursId);
    public CoursClassroom getCoursClassroomById (int CoursId);
    public List<CoursClassroom> getAllCoursClassrooms();
}
