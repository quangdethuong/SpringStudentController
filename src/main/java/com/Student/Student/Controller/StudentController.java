package com.Student.Student.Controller;

import com.Student.Student.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentModel studentModel;

    @PostMapping("/addParam")
    public ResponseEntity<?> addParam(
            @RequestParam String name,
            @RequestParam int age
    ) {
        List<StudentModel> list = new ArrayList<>();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/addPathVar/{name}/{age}")
    public ResponseEntity<?> addPath(
            @PathVariable("name") String name,
            @PathVariable("age") int age
    ) {
        List<StudentModel> list = new ArrayList<>();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/addBody")
    public ResponseEntity<?> addBody(
            @RequestBody StudentModel student
    ) {
        List<StudentModel> list = new ArrayList<>();
        studentModel.setName(student.getName());
        studentModel.setAge(student.getAge());
        list.add(studentModel);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }



}
