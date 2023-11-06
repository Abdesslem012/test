package com.example.test.Service;

import com.example.test.Entity.CoursClassroom;
import com.example.test.Repository.ClasseRepository;
import com.example.test.Repository.CoursClassroomRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CoursClassroomServiceImpl implements ICoursClassroomService {

    @Autowired
    CoursClassroomRepository coursClassroomRepository;


    @Override
    public CoursClassroom addCoursClassroom(CoursClassroom r) {
        return coursClassroomRepository.save(r);
    }

    @Override
    public CoursClassroom updateCoursClassroom(CoursClassroom r) {
        return coursClassroomRepository.save(r);
    }

    @Override
    public void deleteCoursClassroom(int CoursId) {
        coursClassroomRepository.deleteById(CoursId);
    }

    @Override
    public CoursClassroom getCoursClassroomById(int CoursId) {
        Optional<CoursClassroom> blocOptional = coursClassroomRepository.findById(CoursId) ;
        return blocOptional.orElseThrow(() -> new EntityNotFoundException("Bloc not found with ID: " + CoursId));
    }

    @Override
    public List<CoursClassroom> getAllCoursClassrooms() {
        return coursClassroomRepository.findAll();
    }
}
