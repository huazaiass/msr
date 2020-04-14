package com.msr.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.eduservice.entity.EduTeacher;
import com.msr.eduservice.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author msr
 * @since 2020-04-13
 */
public interface EduTeacherService extends IService<EduTeacher> {
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
