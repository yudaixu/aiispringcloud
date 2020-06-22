package com.yudaixu.repository.impl;

import com.yudaixu.entity.Student;
import com.yudaixu.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

import java.util.Collection;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student>  studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",25));
        studentMap.put(2L,new Student(2L,"李四",23));
        studentMap.put(3L,new Student(3L,"王五",24));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
