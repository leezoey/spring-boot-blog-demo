package com.blog.service;

import com.blog.domain.AdminLoginLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminLoginLogService {

    List<AdminLoginLog> selectRencent(Integer adminId);

    int insert(AdminLoginLog adminLoginLog);

    int selectCountByAdminId(int adminId);
}
