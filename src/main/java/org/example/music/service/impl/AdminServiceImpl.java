package org.example.music.service.impl;

import org.example.music.domain.Admin;
import org.example.music.mapper.AdminMapper;
import org.example.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Boolean queryAdminByName(String name, String password) {
        Admin admin = adminMapper.selectByName(name);
        return admin != null && admin.getPassword().equals(password);
    }
}
