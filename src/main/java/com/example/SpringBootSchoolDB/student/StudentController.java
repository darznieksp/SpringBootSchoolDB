package com.example.SpringBootSchoolDB.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewStudent (@RequestParam String firstName, @RequestParam String lastName, @RequestParam String grade){
        Student st = new Student();
        st.setFirstName(firstName);
        st.setLastName(lastName);
        st.setGrade(grade);
        studentRepository.save(st);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable <Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping (path="/getbyid")
    public @ResponseBody Student getStudentByID (@RequestParam int id){
        return studentRepository.findById(id).orElse(null);
    }


}

