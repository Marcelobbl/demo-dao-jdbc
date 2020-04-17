package model.dao;

import model.dao.impl.VendedorDaoImplJDBC;

public class FabricaDao {
	
	public static VendedorDao criaVendedorDao() {
		return new VendedorDaoImplJDBC();
	}

}
