package TestEntidades;



import java.util.Date;

import DaoImp.TblProductoImp;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		//realizamos instancia
		TblProducto tblprod=new TblProducto();
		TblProductoImp tblimp=new TblProductoImp();
		
		//asignamos vamlores
		tblprod.setNomprod("azucar rubia");
		tblprod.setPrecio(3.5);
		tblprod.setCantidad(4);
		tblprod.setTotal(tblprod.getPrecio()*tblprod.getCantidad());
		tblprod.setCodbarras("777777");
		tblprod.setNroloter("lote4589");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblprod.setFechaven(fechasql);
		
		tblimp.RegistrarProducto(tblprod);
		
		System.out.println("dato registrado en BD");

	}//fin del metodo principal

}// fin de la clase
