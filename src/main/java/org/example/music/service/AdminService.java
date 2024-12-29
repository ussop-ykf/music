package org.example.music.service;

import org.example.music.domain.Admin;

/**
 * @author 27542
 */
public interface AdminService {
    Boolean queryAdminByName(String name, String password);
}
