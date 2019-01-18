package mc.dao;

import mc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	

	public User login(@Param("user")User user);

}
