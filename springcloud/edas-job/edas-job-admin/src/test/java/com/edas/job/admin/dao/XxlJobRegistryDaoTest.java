package com.edas.job.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edas.job.admin.core.model.XxlJobRegistry;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XxlJobRegistryDaoTest {

    @Resource
    private XxlJobRegistryDao xxlJobRegistryDao;

    @Test
    public void test(){
        int ret = xxlJobRegistryDao.registryUpdate("g1", "k1", "v1");
        if (ret < 1) {
            ret = xxlJobRegistryDao.registrySave("g1", "k1", "v1");
        }

        List<XxlJobRegistry> list = xxlJobRegistryDao.findAll(1);

        int ret2 = xxlJobRegistryDao.removeDead(1);
    }

}
