package org.example.music.service.impl;

import jakarta.annotation.Resource;
import org.example.music.domain.Singer;
import org.example.music.mapper.SingerMapper;
import org.example.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 27542@date 2024/12/26
 */
@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    /**
     * @param id
     * @return {@link Singer }
     */
    @Override
    public Singer querySingerById(Long id) {
        return singerMapper.selectByPrimaryKey(id);
    }

}

