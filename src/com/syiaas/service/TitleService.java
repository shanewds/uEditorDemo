package com.syiaas.service;

import org.apache.ibatis.annotations.Param;

import com.syiaas.pojo.Title;

public interface TitleService {

    //添加用户信息
	public int save(String text,int titleid);
	//根据ID查询用户信息
	public Title fingByTitleId(int titleid);
	
}
