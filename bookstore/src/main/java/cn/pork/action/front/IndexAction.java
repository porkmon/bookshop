package cn.pork.action.front;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pork.entity.Type;
import cn.pork.service.TypeService;

@Controller
@RequestMapping(value="/front/index")
public class IndexAction {
	@Resource
	private TypeService typeService;
	
	@RequestMapping(value="/showIndex")
	public String showIndex(ModelMap map) {
		
		List<Type> typeList=typeService.selectAll();
		map.addAttribute("typeList", typeList);
		
		
		return "forward:/jsp/front/shopIndex.jsp";
		
	}

}
