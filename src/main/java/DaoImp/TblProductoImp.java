package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class TblProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProducto producto) {
		// nos conectamos con la unidad de persistencia
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
		EntityManager em=emf.createEntityManager();
		try{
			
		
		//Iniciamos Transaccion
		em.getTransaction().begin();
		
		//Invocamos al metodo registrar
		em.persist(producto);
		
		//vonfirmamos
		em.getTransaction().commit();
		
		}catch(RuntimeException ex){
			
			ex.getMessage();
		}finally{
		
		//cerramos
		em.close();
		}	
	}

	@Override
	public void ActualizarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProducto> ListarProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblProducto BuscarProducto(TblProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}//Fin de la clase
