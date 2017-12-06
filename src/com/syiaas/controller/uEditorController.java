package com.syiaas.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syiaas.pojo.State;
import com.syiaas.service.TitleService;
@Controller
@RequestMapping("/ueditor")
public class uEditorController {

	
	@Autowired
	private TitleService titleService ;
	

	//��Ӧ״ֵ̬
	State state = new State();
	
	
    @RequestMapping("/save")  
	@ResponseBody  
    public Object jsonData(String text, int titleid,HttpServletRequest request) throws Exception{ 
			String data = new String((request.getParameter("text")).getBytes("iso-8859-1"),"utf-8");
			System.out.println("text"+data);
	    	System.out.println("titleid"+titleid);
    	    if(titleService.save(data, titleid)>0){
    	    	state.setResult(true);
    	    	state.setMsg("����ɹ�");
    	    	state.setStatusCode(200);
    	    }else{
    	    	state.setResult(true);
    	    	state.setMsg("����ʧ��");
    	    	state.setStatusCode(400);
    	    }
    	  return state; 
    	  
    }  
    
    @RequestMapping("/select")  
   	@ResponseBody  
    public Object jsonData(int titleid){ 
    	 if(null!=titleService.fingByTitleId(titleid)){
 	    	state.setResult(true);
 	    	state.setMsg("���سɹ�");
 	    	state.setStatusCode(200);
 	    	state.setResponseBean(titleService.fingByTitleId(titleid));
 	     }else{
 	    	state.setResult(true);
 	    	state.setMsg("����ʧ��");
 	    	state.setStatusCode(400);
 	     }
       return state; 
           
    }  
    
    
    
    //��ת����ͼҳ��
    @RequestMapping("/ueditorshow")
	public String getFirstPage() {
	    return "ueditorshow";
	}
    
    
}
