package com.blog.service;

import com.blog.domain.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
Admin getById(Integer id);

}
