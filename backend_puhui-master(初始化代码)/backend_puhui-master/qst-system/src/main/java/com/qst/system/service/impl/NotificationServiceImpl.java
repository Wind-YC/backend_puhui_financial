package com.qst.system.service.impl;

import com.qst.system.mapper.NotificationMapper;
import com.qst.system.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements INotificationService {

    @Autowired
    private NotificationMapper notificationMapper;
    @Override
    public int selectNotificationCount() {
        return notificationMapper.selectNotificationCount();
    }
}
