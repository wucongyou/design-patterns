package com.echo.designpattern.singleton;

public class DCLVolatileSingletonWithStringParam {

    private volatile static DCLVolatileSingletonWithStringParam singleton = null;

    private DCLVolatileSingletonWithStringParam() {
    }

    /**
     * 带参数的构造方法，
     * 使用传入的参数完成初始化操作
     */
    private DCLVolatileSingletonWithStringParam(String param) {
        // do
        // LockSingletonWithStringParam
        // init work through
        // param.
    }


    /**
     * 定义一个公有静态无返回的init（）方法，在该方法中生成此单例对象
     */
    public static void init(String param) {
        // do something.
        if (singleton == null) {
            synchronized (DCLVolatileSingletonWithStringParam.class) {
                if (singleton == null) {
                    singleton = new DCLVolatileSingletonWithStringParam(param);
                }
            }
        }
    }

    /*
     * init()方法的存在使得获取单例对象的getInstance方法不需要带参数
     * */
    public static DCLVolatileSingletonWithStringParam getInstance() {
        return singleton;
    }

}
