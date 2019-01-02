import com.lin.test.TestBean;
import com.lin.test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class BeanTests {
    @Autowired
    private TestBean testBean;
    @Test
    public void prodBean(){
        Assert.assertEquals("from prod",testBean.getContent());
    }
}
