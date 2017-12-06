package com.syiaas.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.syiaas.dao.TitleDao;
import com.syiaas.pojo.Title;
@Service
@Transactional
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleDao titleDao;
	
	@Override
	public int save(String text, int titleid) {
		
		return titleDao.save(text, titleid);
	}

	@Override
	public Title fingByTitleId(int titleid) {
		
		return titleDao.fingByTitleId(titleid);
		
	}

	

	
	

}
