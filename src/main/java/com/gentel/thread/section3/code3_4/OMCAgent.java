package com.gentel.thread.section3.code3_4;

/**
 * 与运维中心（operation and maintenance center）对接的类
 * 设计模式：不可变模式
 * 模式角色：ImmutableObject.manipulator
 */
public class OMCAgent extends Thread {

    @Override
    public void run() {
        boolean isTbaleModificationMsg = false;
        String updatedTableName = null;

        while(true){
            // 沈略其他代码
            /**
             * 从与OMC连接的Socket中读取消息并进行解析
             * 解析到数据表更新消息后，重置MMSCRouter实例
             */
            if (isTbaleModificationMsg){
                if ("MMSCInfo".equals(updatedTableName)){
                    MMSCRouter.setInstance(new MMSCRouter());
                }
            }

            // 省略其他代码

        }
    }
}
