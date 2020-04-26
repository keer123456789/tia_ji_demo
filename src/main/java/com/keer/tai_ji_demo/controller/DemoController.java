package com.keer.tai_ji_demo.controller;

import com.keer.tai_ji_demo.pojo.Student;
import com.keer.tai_ji_demo.pojo.WebResult;
import com.keer.tai_ji_demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: tai_ji_demo
 * @BelongsPackage: com.keer.tai_ji_demo.controller
 * @Author: keer
 * @CreateTime: 2020-04-26 13:19
 * @Description:
 */
@RestController
public class DemoController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DemoService demoService;
    @RequestMapping(value = "/addStudentInfo",method = RequestMethod.POST)
    public WebResult addStudentInfo(@RequestBody Student student){
        logger.info("接收到增加学生信息的请求，请求信息："+student.toString());
        return demoService.addStudentInfo(student);
    }
}
