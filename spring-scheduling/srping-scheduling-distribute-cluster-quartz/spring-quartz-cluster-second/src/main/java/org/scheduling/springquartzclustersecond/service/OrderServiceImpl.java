package org.scheduling.springquartzclustersecond.service;

import org.scheduling.springquartzclustersecond.dao.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Map<String, Object>> getOrderInfo(String userId) {
        return orderMapper.getResourceInfo(userId);
    }
}