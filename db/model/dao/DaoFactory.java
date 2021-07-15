package db.model.dao;

import db.DB;
import db.model.dao.impl.DepartmentDaoJDBC;
import db.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return (SellerDao) new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return (DepartmentDao) new DepartmentDaoJDBC(DB.getConnection());
	}
}
