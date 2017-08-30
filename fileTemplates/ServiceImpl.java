#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

#parse("File Header.java")
@Service
public class ${uppername}ServiceImpl implements I${uppername}Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(${uppername}ServiceImpl.class);

    @Resource
    ${uppername}Mapper ${NAME}Mapper;

    public int deleteByPrimaryKey(Integer id){
        return ${NAME}Mapper.deleteByPrimaryKey(id);
    }
    
    public int updateByPrimaryKeySelective($uppername $NAME){
        return ${NAME}Mapper.updateByPrimaryKeySelective($NAME);
    }
    
    public int insertSelective($uppername $NAME){
        return ${NAME}Mapper.insertSelective($NAME);
    }
    
    public List<$uppername> querySelective($uppername $NAME){
        return ${NAME}Mapper.querySelective($NAME);
    }
}