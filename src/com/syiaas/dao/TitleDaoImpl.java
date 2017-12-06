package com.syiaas.dao;
import java.util.HashMap;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import com.syiaas.pojo.Title;

@Repository
public class TitleDaoImpl extends SqlSessionDaoSupport implements TitleDao {

	@Override
	public int save(String text,int titleid) {
		HashMap<Object, Object> hsmp = new HashMap<Object, Object>();
		hsmp.put("text",text);
		hsmp.put("titleid",titleid);
		return getSqlSession().insert("com.syiaas.dao.TitleDao.save",hsmp);
	}

	@Override
	public Title fingByTitleId(int titleid) {
		
		return getSqlSession().selectOne("com.syiaas.dao.TitleDao.fingByTitleId",titleid);
	
	
	}

	

	

	

}
