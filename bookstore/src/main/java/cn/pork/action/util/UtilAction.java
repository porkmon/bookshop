package cn.pork.action.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pork.util.ValidateCodeUtils;

@Controller

public class UtilAction {
	@RequestMapping(value="/image")
	public void ImageCode(HttpServletResponse response,HttpSession session) {
		
		try {
			String code=ValidateCodeUtils.genNewCode(response.getOutputStream());
			session.setAttribute("code", code);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
	}
}
