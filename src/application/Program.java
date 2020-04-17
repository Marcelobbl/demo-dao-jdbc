package application;

import java.util.Date;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		//Departamento obj = new Departamento(1, "Livros");
		//System.out.println(obj);
		//Vendedor vendedor = new Vendedor(21, "Bob", "bob.gmail.com", new Date(), 3000.0 , obj);
		
		VendedorDao vendedorDao = FabricaDao.criaVendedorDao();
		
		Vendedor vendedor = vendedorDao.consultaId(3);
		
		System.out.println(vendedor);
	}

}
