package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		//System.out.println("===Test 3: vendedor");
		//List<Vendedor> list = vendedorDao.consultaTudo();
		//for(Vendedor obj : list) {
		//	System.out.println(obj);
		//}
		//System.out.println("===Test 3: vendedor");
		//Vendedor novoVendedor= new Vendedor(null, "Greg", "greg@gmail.com.br", new Date(), 4000.0, null);
		//vendedorDao1.insert(novoVendedor);
		//	System.out.println("Inserido! Novo id = " + novoVendedor.getId());
		//}
		//System.out.println("===Test 3: vendedor");
		//Vendedor vendedor = vendedorDao1.consultaId(1);
		//vendedor.setNome("Martha Waine");
		//vendedorDao.update(vendedor);
		//System.out.println("Update completo! ");
		System.out.println("Digite o Id para deletar");
		int id = sc.nextInt();
		vendedorDao.delete(id);
		System.out.println("Delete completo");
		
		sc.close();
		

	}
	}


