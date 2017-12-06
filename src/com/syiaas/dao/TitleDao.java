package com.syiaas.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.syiaas.pojo.Title;

public interface TitleDao {
    

    //添加用户信息
	public int save(@Param("text") String text,@Param("titleid") int titleid);
	//根据ID查询用户信息
	public Title fingByTitleId(@Param("titleid") int titleid);
	
}
