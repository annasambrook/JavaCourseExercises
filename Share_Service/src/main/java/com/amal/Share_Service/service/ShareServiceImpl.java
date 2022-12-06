package com.amal.Share_Service.service;

import com.amal.Share_Service.entity.Share;
import com.amal.Share_Service.persistence.ShareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareServiceImpl implements ShareService{
    @Autowired
    private ShareDao shareDao;

    @Override
    public Share searchSharebyId(int id) {
        return shareDao.findById(id).orElse(null);
    }
}
