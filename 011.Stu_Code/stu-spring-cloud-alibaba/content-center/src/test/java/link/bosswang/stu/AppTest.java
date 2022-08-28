package link.bosswang.stu;

import lombok.Data;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testLombok() {
        System.out.println("------------>" + (new AppVO().toString()));
    }

    @Data
    public static class AppVO implements Serializable {
        private String appName = "初始化名称";
    }
}
