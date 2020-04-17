package application;

import java.util.List;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		
		
		VendedorDao vendedorDao = FabricaDao.criaVendedorDao();
		
		//System.out.println("===Test 1: vendedor");
		
		//Vendedor vendedor = vendedorDao.consultaId(1);
		
		//System.out.println(vendedor);
		//System.out.println("===Test 2: vendedor");
		//Departamento departamento = new Departamento(2, null);
		//List<Vendedor> list = vendedorDao.buscaPorDepartamento(departamento);
		//for(Vendedor obj : list) {
		//	System.out.println(obj);
		//}
		System.out.println("===Test 3: vendedor");
		List<Vendedor> list = vendedorDao.consultaTudo();
		for(Vendedor obj : list) {
			System.out.println(obj);
		}
		
	}

}
