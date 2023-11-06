package com.example.test.Controller;

import com.example.test.Entity.Classe;
import com.example.test.Entity.CoursClassroom;
import com.example.test.Service.IClasseService;
import com.example.test.Service.ICoursClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CoursClassroom")
public class CoursClassroomController {
    @Autowired
    ICoursClassroomService coursClassroomService;

    @PostMapping("/add-cours")
    public CoursClassroom addCoursClassroom(@RequestBody CoursClassroom r){
        CoursClassroom coursclassroom = coursClassroomService.addCoursClassroom(r);
        return coursclassroom;
    }
    @PutMapping("/update-cours/{CoursId}")
    public CoursClassroom updateCoursClassroom(@PathVariable int CoursId, @RequestBody CoursClassroom r){
        r.setIdCours(CoursId);
        CoursClassroom updateCours = coursClassroomService.updateCoursClassroom(r);
        return  updateCours;
    }
    @DeleteMapping("/delete-cours/{CoursId}")
    public void deleteCoursClassroom(@PathVariable int CoursId){
        coursClassroomService.deleteCoursClassroom(CoursId);
    }
    @GetMapping("/get-bloc/{CoursId}")
    public CoursClassroom getCoursClassroomById(@PathVariable int CoursId){
        return coursClassroomService.getCoursClassroomById(CoursId);
    }
    @GetMapping("/get-all-blocs")
    public List<CoursClassroom> getAllCoursClassrooms(){
        return coursClassroomService.getAllCoursClassrooms();
    }
}
