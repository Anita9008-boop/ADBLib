package com.adb.process.android;

import com.adb.command.andriodCmd.AndroidHardwareCmd;
import com.adb.process.AndroidCtrl;

import java.io.IOException;

public class AndroidHardware extends IAndroid {

    AndroidHardwareCmd cmd = new AndroidHardwareCmd();

    public AndroidHardware(AndroidCtrl context) {
        super(context);
    }

     /* 获取屏幕分辨率
     * @return
      */
    public String screenSize(){
        try {
            return context.exec(cmd.screenSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Physical density: 480
     * Override density: 160 //修改后
     * @return
     */
    public String screenDensity(){
        try {
            return context.exec(cmd.screenDensity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 屏幕信息
     * @return
     *
     * WINDOW MANAGER DISPLAY CONTENTS (dumpsys window displays)
     *   Display: mDisplayId=0
     *     init=1080x1920 420dpi cur=1080x1920 app=1080x1794 rng=1080x1017-1810x1731
     *     deferred=false layoutNeeded=false
     */
    public String screenInfo(){
        try {
            return context.exec(cmd.screenInfo());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 设备型号，如：Nexus 5、Mi 10
     * @return
     */
    public String devModel(){
        try {
            return context.exec(cmd.devModel());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String devIMEI(){
        try {
            return context.exec(cmd.devIMEI());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 系统版本
     * @return
     */
    public String SystemVersion(){
        try {
            return context.exec(cmd.systemVersion());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * SDK版本
     * @return
     */
    public String SDKVersion(){
        try {
            return context.exec(cmd.SDKVersion());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public String devBrand(){
        try {
            return context.exec(cmd.devBrand());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

}
