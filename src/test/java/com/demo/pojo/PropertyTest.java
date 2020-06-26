package com.demo.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ComponentScan({"com.demo.pojo"})
@EnableConfigurationProperties(com.demo.pojo.FruitProperty.class)
@SpringBootTest(classes = {com.demo.pojo.PropertyTest.class})
public class PropertyTest {

    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){
        List<Fruit> fruitData = fruitProperty.getList();

        assertThat(fruitData.get(0).getName(), is("banana"));
        assertThat(fruitData.get(0).getColor(), is("yellow"));

        assertThat(fruitData.get(1).getName(), is("apple"));
        assertThat(fruitData.get(1).getColor(), is("red"));

        assertThat(fruitData.get(2).getName(), is("water melon"));
        assertThat(fruitData.get(2).getColor(), is("green"));

        /*
        System.out.println(fruitData.get(0).get("name"));
        System.out.println(fruitData.get(0).get("color"));

        System.out.println(fruitData.get(1).get("name"));
        System.out.println(fruitData.get(1).get("color"));

        System.out.println(fruitData.get(2).get("name"));
        System.out.println(fruitData.get(2).get("color"));

        */
    }
}
