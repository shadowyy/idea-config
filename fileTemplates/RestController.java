#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

#parse("File Header.java")
@RestController
@RequestMapping("/$NAME")
public class ${uppername}Controller {
    @Resource
    private I${uppername}Service ${NAME}ServiceImpl;

    @RequestMapping(value = "/deleteByPrimaryKey", method = GET)
    public boolean deleteByPrimaryKey(Integer id){
        return ${NAME}ServiceImpl.deleteByPrimaryKey(id);
    }
    
    @RequestMapping(value = "/updateByPrimaryKeySelective", method = POST)
    public boolean updateByPrimaryKeySelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.updateByPrimaryKeySelective($NAME);
    }
    
    @RequestMapping(value = "/insertSelective", method = POST)
    public boolean insertSelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.insertSelective($NAME);
    }
    
    @RequestMapping(value = "/querySelective", method = POST)
    public List<$uppername> querySelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.querySelective($NAME);
    }
}