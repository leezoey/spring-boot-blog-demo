package com.blog.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.blog.dao.AdminDao;
import com.blog.domain.Admin;
import com.blog.dao.AdminLoginLogDao;
import com.blog.domain.AdminLoginLog;
import com.blog.dao.ArticleDao;
import com.blog.domain.Article;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTest {
    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testcount() throws Exception {
        int test = articleDao.countAllNum();
        System.out.println(test);
    }

    @Test
    public void testquery() throws Exception {
        List<Article> test = articleDao.queryAll();
        System.out.println(test);
    }



}
