package com.keer.tai_ji_demo.dao;

import com.keer.tai_ji_demo.pojo.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @BelongsProject: tai_ji_demo
 * @BelongsPackage: com.keer.tai_ji_demo.dao
 * @Author: keer
 * @CreateTime: 2020-04-26 13:22
 * @Description:
 */
public interface DemoDao extends CrudRepository<Student,Integer> {
}
