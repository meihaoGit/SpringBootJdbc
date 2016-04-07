package com.example;

        import org.junit.ClassRule;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.OutputCapture;
        import org.springframework.boot.test.SpringApplicationConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
        import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @ClassRule
    public static OutputCapture out = new OutputCapture(); // System.outの内容をキャプチャする

    @Test
    public void contextLoads() {

    }
}
