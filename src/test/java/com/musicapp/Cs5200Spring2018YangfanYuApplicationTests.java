package com.musicapp;

<<<<<<< Updated upstream
import org.junit.Test;
import org.junit.runner.RunWith;
=======
import com.musicapp.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cs5200Spring2018YangfanYuApplicationTests {

<<<<<<< Updated upstream
    @Test
    public void contextLoads() {
=======
    @Autowired
    private I18NService i18NService;

    @Test
    public void testMessageByLocaleService() throws Exception {
        String expectedResult = "Bootstrap starter template";
        String messageId = "index.main.callout";
        String actual = i18NService.getMessage(messageId);
        Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
>>>>>>> Stashed changes
    }

}