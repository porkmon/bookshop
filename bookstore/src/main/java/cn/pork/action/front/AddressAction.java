package cn.pork.action.front;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.pork.entity.Address;
import cn.pork.entity.User;
import cn.pork.service.AddressService;
import cn.pork.util.WebUtil;
@Controller
@RequestMapping(value="/front/address")
public class AddressAction {
	@Resource
	private AddressService addressService;
	
	@RequestMapping("/list")
	public String list(HttpSession session) {
		User user=(User) session.getAttribute("user");
		
		session.setAttribute("addrs", addressService.selectList(user.getId()));
		return "forward:/jsp/front/address/list.jsp";
	}
	@RequestMapping("/add")
	public String add(HttpSession session,Address address) {
		address.setId(WebUtil.uuId());
		address.setMktime(WebUtil.getTime());
		//address.setDft('0');
		User user=(User)session.getAttribute("user");
		address.setUserId(user.getId());
		List<Address> addrs=addressService.selectList(user.getId());
		if(addrs==null||addrs.size()==0) {
			address.setDft(1);
		}else {
			address.setDft(0);
		}
		addressService.insertOne(address);
		return "forward:/jsp/front/address/addback.html";
	}
	@RequestMapping("/chgDft")
	public String chgDft(HttpSession session,@RequestParam("id")String id) {
		addressService.updateDft(id);
		User user=(User) session.getAttribute("user");
		
		session.setAttribute("addrs", addressService.selectList(user.getId()));
		return "forward:/jsp/front/address/list.jsp";
	}
	@RequestMapping("/delete")
	public String delete(HttpSession session,@RequestParam("id")String id) {
		addressService.deleteOne(id);
		User user=(User) session.getAttribute("user");
		
		session.setAttribute("addrs", addressService.selectList(user.getId()));
		return "forward:/jsp/front/address/list.jsp";
	}
}
