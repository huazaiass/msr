package com.msr.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.eduservice.entity.EduSubject;
import com.msr.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EduSubjectService extends IService<EduSubject> {
    //添加课程分类
    void saveSubject(MultipartFile file,EduSubjectService subjectService);
    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
