package com.shy.javapattens.factory;

import com.shy.javapattens.abstractfactory.LiNingShoeFactory;
import com.shy.javapattens.abstractfactory.NikeShoeFactory;
import com.shy.javapattens.abstractfactory.Shoe;
import com.shy.javapattens.abstractfactory.ShoeFactory;
import org.junit.Test;

/**
 * Created by 29517 on 2016/3/30.
 */
public class AbstractFactoryTest {
    @Test
    public void test(){
        ShoeFactory liNingShoeFactory = new LiNingShoeFactory();
        Shoe liNingShoe = liNingShoeFactory.produce();
        liNingShoe.sayBrand();

        ShoeFactory nikeShoeFactory = new NikeShoeFactory();
        Shoe nikeShoe = nikeShoeFactory.produce();
        nikeShoe.sayBrand();
    }
}
