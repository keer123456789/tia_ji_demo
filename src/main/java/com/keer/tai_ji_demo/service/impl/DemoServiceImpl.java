package com.keer.tai_ji_demo.service.impl;

import com.keer.tai_ji_demo.dao.DemoDao;
import com.keer.tai_ji_demo.pojo.Student;
import com.keer.tai_ji_demo.pojo.WebResult;
import com.keer.tai_ji_demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: tai_ji_demo
 * @BelongsPackage: com.keer.tai_ji_demo.service.impl
 * @Author: keer
 * @CreateTime: 2020-04-26 13:21
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DemoDao demoDao;

    @Override
    public WebResult addStudentInfo(Student student) {
        WebResult webResult = new WebResult();
        Student stu = demoDao.save(student);
        if (stu != null) {
            logger.info("数据库增加学生信息成功");
            webResult.setStatus(WebResult.SUCCESS);
            webResult.setMessage("增加学生信息成功");
        } else {
            logger.info("数据库增加学生信息失败");
            webResult.setMessage("增加学生信息失败");
            webResult.setStatus(WebResult.ERROR);
        }
        return webResult;
    }
}
