package application;

import java.util.Date;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		
		
		VendedorDao vendedorDao = FabricaDao.criaVendedorDao();
		
		System.out.println("===Test 1: vendedor");
		
		Vendedor vendedor = vendedorDao.consultaId(1);
		
		System.out.println(vendedor);
	}

}
