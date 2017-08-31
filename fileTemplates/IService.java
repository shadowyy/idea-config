#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#set($uppername = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))

import java.lang.Integer;
import java.util.List;

#parse("File Header.java")
public interface I${uppername}Service {
  boolean deleteByPrimaryKey(Integer integer);

  boolean updateByPrimaryKeySelective($uppername $NAME);

  boolean insertSelective($uppername $NAME);

  List<$uppername> querySelective($uppername $NAME);
}