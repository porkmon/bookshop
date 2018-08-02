package cn.pork.action.front;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pork.entity.User;
import cn.pork.service.UserService;
import cn.pork.util.MD5Util;
import cn.pork.util.WebUtil;

@Controller
@RequestMapping(value="/front/user")
public class UserAction {
	@Resource
	private UserService userService;
	@RequestMapping(value="/reg")
	public String register(HttpSession session,String sCode,User user) {
		String code=(String)session.getAttribute("code");
		
		if(code.equals(sCode)) {
			user.setId(WebUtil.uuId());
			user.setPassword(MD5Util.md5(user.getPassword()));
			userService.insertOne(user);
		}else {
			session.setAttribute("errorMsg", "验证码错误！");
			return "forward:/jsp/error.jsp";
		}
		return "forward:/jsp/front/user/regsucc.jsp";		
	}
	
	@RequestMapping(value="/login")
	public String login(HttpSession session,String sCode,User user) {
		String code=(String)session.getAttribute("code");		
		if(code.equals(sCode)) {
			User users=userService.selectByName(user.getName());		
			if(users==null) {
				session.setAttribute("errorMsg", "用户不存在！");
				return "forward:/jsp/error.jsp";
			}else if(!MD5Util.md5(user.getPassword()).equals(users.getPassword())) {
				session.setAttribute("errorMsg", "密码错误");
				return "forward:/jsp/error.jsp";
			}else {
				session.setAttribute("user", users);
				return "forward:/front/index/showIndex.action";
			}
		}else {
			session.setAttribute("errorMsg", "验证码错误");
			return "forward:/jsp/error.jsp";
		}
		
	}
	
}
