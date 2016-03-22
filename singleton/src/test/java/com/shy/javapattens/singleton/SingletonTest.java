package com.shy.javapattens.singleton;

import org.junit.Test;
/**
 * Created by 29517 on 2016/3/22.
 */
public class SingletonTest {

    @Test
    public void testSimpleSingleton(){
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();

        if(simpleSingleton==simpleSingleton1){
            System.out.println("普通单例模式：实例化了一个对象！");
        }else{
            System.out.println("普通单例模式：哟，出错了！");
        }
    }

    @Test
    public void testSeniorSingleton(){
        SeniorSingleton seniorSingleton = SeniorSingleton.getInstance();
        SeniorSingleton seniorSingleton1 = SeniorSingleton.getInstance();

        if(seniorSingleton==seniorSingleton1){
            System.out.println("线程安全单例模式：实例化了一个对象！");
        }else{
            System.out.println("线程安全单例模式：哟，出错了！");
        }
    }

    @Test
    public void testOtherSingleton(){
        OtherSingleton otherSingleton = OtherSingleton.getInstance();
        OtherSingleton otherSingleton1 = OtherSingleton.getInstance();

        if(otherSingleton==otherSingleton1){
            System.out.println("内部类实现单例模式：实例化了一个对象！");
        }else{
            System.out.println("内部类实现单例模式：哟，出错了！");
        }
    }
}
