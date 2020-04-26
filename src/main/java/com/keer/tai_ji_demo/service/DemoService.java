package com.keer.tai_ji_demo.service;

import com.keer.tai_ji_demo.pojo.Student;
import com.keer.tai_ji_demo.pojo.WebResult;

/**
 * @BelongsProject: tai_ji_demo
 * @BelongsPackage: com.keer.tai_ji_demo.service
 * @Author: keer
 * @CreateTime: 2020-04-26 13:20
 * @Description:
 */
public interface DemoService {
    /**
     * 增加学生信息
     * @param student
     * @return
     */
    WebResult addStudentInfo(Student student);
}
