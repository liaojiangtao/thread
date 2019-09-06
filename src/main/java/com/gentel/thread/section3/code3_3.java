package com.gentel.thread.section3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 在使用不可变对象的情况下更新车辆的位置信息
 */
public class code3_3 {
    private Map<String, code3_2> locMap = new ConcurrentHashMap<String, code3_2>();

    public void updateLocation(String vehicleId, code3_2 newLocation){
        locMap.put(vehicleId, newLocation);
    }
}
