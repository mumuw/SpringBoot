package com.lin.pattern.singleton.register.Enum;

public enum EnumSingleton {
    //jdk层面为枚举不被反射和序列化保驾护航
    //序列化破坏
    //ObjectInputStream readObject 方法读取Enum的时候是Enum.valueOf((Class)cl, name);
    //jvm使用class和name读取唯一一个对象
    //反射破坏
    //Enum 无无参数构造函数
    //newInstance 方法是枚举直接抛异常
    //if ((clazz.getModifiers() & Modifier.ENUM) != 0)
    //   throw new IllegalArgumentException("Cannot reflectively create enum objects");
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


}
