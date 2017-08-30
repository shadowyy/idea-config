#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import java.lang.Integer;
import java.util.List;

#parse("File Header.java")
public interface I${uppername}Service {
  int deleteByPrimaryKey(Integer integer);

  int updateByPrimaryKeySelective($uppername $NAME);

  int insertSelective($uppername $NAME);

  List<$uppername> querySelective($uppername $NAME);
}