package com.gentel.thread.section3.code3_4;

/**
 * 彩信中心信息
 * 设计模式：不可变模式
 * 模式角色：ImmutableObject.ImmutableObject
 */
public class MMSCInfo {
    /**
     * 设备编号
     */
    private final String deviceID;

    /**
     * 彩信中心URL
     */
    private final String url;

    /**
     * 该彩信中心允许最大附件大小
     */
    private final int maxAttachmentSizeInBytes;

    public MMSCInfo(String deviceID, String url, int maxAttachmentSizeInBytes) {
        this.deviceID = deviceID;
        this.url = url;
        this.maxAttachmentSizeInBytes = maxAttachmentSizeInBytes;
    }

    public MMSCInfo(MMSCInfo prototype) {
        this.deviceID = prototype.getDeviceID();
        this.url = prototype.getDeviceID();
        this.maxAttachmentSizeInBytes = prototype.getMaxAttachmentSizeInBytes();
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getUrl() {
        return url;
    }

    public int getMaxAttachmentSizeInBytes() {
        return maxAttachmentSizeInBytes;
    }
}
