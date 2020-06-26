package com.havi;

import com.havi.SpringBootTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/*
@SpringBootTest(value = "value=test", properties = {"property.value=propertyTest"},
classes = {SpringBootTestApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
*/
@RunWith(SpringRunner.class)
@SpringBootTest(value = "value=test", classes = {SpringBootTestApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTestApplicationTests {

    @Value("${value}")
    private String value;
/*
    @Value("${property.value}")
    private String propertyValue;
*/
    @Test
    public void contextLoads(){
        assertThat(value, is("test"));
        //assertThat(propertyValue, is("propertyTest"));
    }
}
