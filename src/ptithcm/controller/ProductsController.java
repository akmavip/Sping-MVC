package ptithcm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductsController {
	
	@RequestMapping("products/index")
	public String products(HttpServletRequest request, ModelMap model){
		
		List<String> products = new ArrayList<String>();
		for(int i = 1;i<=100;i++) {
			products.add("canh: "+ i);	
		}
		PagedListHolder pagedListHolder = new PagedListHolder(products);
		int page = ServletRequestUtils.getIntParameter(request, "p", 2);// trang hiện tại
		pagedListHolder.setPage(page);
		pagedListHolder.setMaxLinkedPages(5); //5 link page
		pagedListHolder.setPageSize(10);// 10 cột trong 1 link
		model.addAttribute("pagedListHolder", pagedListHolder);
		
		return "products/index";
	}
	
	@RequestMapping("products/products_detal")
	public String products_detal(){
		return "products/detal/product";
	}
}
