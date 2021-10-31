package ptithcm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptithcm.dao.IProductDAO;
import ptithcm.entity.ProductsEntity;
import ptithcm.service.IProductService;

@Service
public class ProductService extends GeneralService<ProductsEntity, Integer>implements IProductService {

//	@Autowired
//	private IProductDAO dao;
//
//	@Autowired
//	private ICookieService cookieService;
//
//	public List<ProductsEntity> findByKeywords(String keyWords) {
//		return dao.findByKeywords(keyWords);
//	}
//
//
//	public List<ProductsEntity> findAllProductByCategory(int id) {
//		return dao.findByCategoryId(id);
//	}
//
//	public List<ProductsEntity> findByHot(String key) {
//		return dao.findItemByHot(key);
//	}
//
//	public List<ProductsEntity> getViewProduct(String name, String id) {
//		String ids = cookieService.getCookieValue(name, id.toString());
//		if (!ids.contains(id.toString())) { 
//			ids += "," + id.toString();
//		}
//		cookieService.createCookie(name, ids, 15);
//		return dao.findByIdsInCookie(ids); 
//	}
//
//	public List<ProductsEntity> getFaVoProduct(String name, String id) {
//		String favos = cookieService.getCookieValue(name, "");
//		if (favos.length() > 0) 
//		{
//			return dao.findByIdsInCookie(favos); 
//		} else
//			return null;
//	}
//
//
//	public List<ProductsEntity> findByIdsInCookie(String ids) {
//		return dao.findByIdsInCookie(ids);
//	}
//
//
//	public List<ProductsEntity> getViewProduct(String name, String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public List<ProductsEntity> getFaVoProduct(String name, String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}

