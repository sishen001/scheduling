package org.scheduling.springquartzcluster.service;

import java.util.List;
import java.util.Map;

public interface OrderService {

    List<Map<String,Object>> getOrderInfo(String userId);
}