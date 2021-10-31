package ptithcm.dao.impl;

import org.springframework.stereotype.Repository;

import ptithcm.dao.ICategoryDAO;
import ptithcm.entity.CategoriesEntity;

@Repository
public class CategoryDAO extends GeneralDAO<CategoriesEntity, Integer> implements ICategoryDAO {

}
