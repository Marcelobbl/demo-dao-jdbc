package model.dao;

import db.DB;
import model.dao.impl.VendedorDaoImplJDBC;

public class FabricaDao {
	
	public static VendedorDao criaVendedorDao() {
		return new VendedorDaoImplJDBC(DB.getConnection());
	}

}
