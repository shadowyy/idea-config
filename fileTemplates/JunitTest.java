#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

#parse("File Header.java")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/mybatis-spring.xml")
public class Test$uppername {
    @Resource
    private ${uppername}Mapper ${NAME}deptMapper;
    
    @Test
    public void test1() throws Exception {
    }
}