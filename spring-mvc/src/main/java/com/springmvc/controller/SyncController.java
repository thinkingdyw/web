package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.common.Result;
import com.common.utils.HttpStatus;
import com.dto.Person;

@Controller
@RequestMapping("/sync/")
public class SyncController {
	
	private Logger logger = Logger.getLogger(SyncController.class);
	@RequestMapping("/index")
	public ModelAndView toIndex(){
		ModelAndView view = new ModelAndView();
		view.setViewName("views/index");
		return view;
	}
	
	@RequestMapping("/type_convert")
	@ResponseBody
	public Result<String> demo1(Person person){
		//通用的相应结果对象，可以应对较快的需求变更
		Result<String> result = new Result<String>();
		result.setStatusCode(HttpStatus._2XX_200);
		result.setData("This is Response data!!!");
		result.setMsg("请求成功!");
		logger.info(person.getBirthday());
		return result;
	}
	@RequestMapping("/server_encode")
	@ResponseBody
	public Result<String> demo2_testServerCharset(HttpServletRequest request){
		Result<String> result = new Result<String>();
		String encoder = request.getCharacterEncoding();
		result.setMsg("服务器默认编码格式："+encoder);
		logger.info(encoder);
		return result;
	}
}