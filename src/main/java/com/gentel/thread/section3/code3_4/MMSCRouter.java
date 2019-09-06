package com.gentel.thread.section3.code3_4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 彩信中心路由规则管理器
 * 设计模式：不可变模式
 * 模式角色：ImmutableObject.ImmutableObject
 */
public final class MMSCRouter {

    // 用volatile修饰，保证多线程环境下该变量的可见性
    private static volatile MMSCRouter instance = new MMSCRouter();

    //
    private final Map<String, MMSCInfo> routeMap;

    public MMSCRouter() {
        // 将数据库表中的数据加载到内存，存为Map
        this.routeMap = MMSCRouter.retrieveRouteMapFromDB();
    }

    private static Map<String, MMSCInfo> retrieveRouteMapFromDB() {
        Map<String, MMSCInfo> map = new HashMap<String, MMSCInfo>();
        // 省略其他代码
        return map;
    }

    public static MMSCRouter getInstance() {
        return instance;
    }

    /**
     * 根据手机号码前缀获取对应的彩信中心信息
     *
     * @Param msisdnPrefix
     * 手机号码前缀
     * @Param 彩信中心信息
     */
    public MMSCInfo getMMSC(String msisdnPrefix) {
        return routeMap.get(msisdnPrefix);
    }

    /**
     * 将当MMSCRouter的实例更新为指定的新实例
     *
     * @Param newInstance
     * 新的MMSCRouter实例
     */
    public static void setInstance(MMSCRouter mmscRouter) {
        instance = mmscRouter;
    }

    private static Map<String, MMSCInfo> deepCopy(Map<String, MMSCInfo> m) {
        Map<String, MMSCInfo> result = new HashMap<String, MMSCInfo>();

        for (String key : m.keySet()) {
            result.put(key, new MMSCInfo(m.get(key)));
        }
        return result;
    }

    public Map<String, MMSCInfo> getRouteMap(){
        // 做防御性复制
        return Collections.unmodifiableMap(deepCopy(routeMap));
    }
}
