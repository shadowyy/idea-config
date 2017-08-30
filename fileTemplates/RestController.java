#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

#parse("File Header.java")
@RestController
@RequestMapping("/$NAME")
public class ${uppername}Controller {
    @Resource
    private I${uppername}Service ${NAME}ServiceImpl;

    @RequestMapping(value = "/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return ${NAME}ServiceImpl.deleteByPrimaryKey(id);
    }
    
    @RequestMapping(value = "/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.updateByPrimaryKeySelective($NAME);
    }
    
    @RequestMapping(value = "/insertSelective")
    public int insertSelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.insertSelective($NAME);
    }
    
    @RequestMapping(value = "/querySelective")
    public List<$uppername> querySelective(@RequestBody $uppername $NAME){
        return ${NAME}ServiceImpl.querySelective($NAME);
    }
}