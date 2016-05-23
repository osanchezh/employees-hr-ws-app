package org.osanchezhuerta.hr.employees.soa.persistence.dao.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.osanchezhuerta.hr.employees.soa.model.Salary;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.SalariesDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.impl.SalariesDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalariesDAOImplTest extends AbstractDBTestUnit{

	private static final Logger LOGGER = LoggerFactory.getLogger(SalariesDAOImplTest.class);
	private SalariesDAO salariesDAO = new SalariesDAOImpl();


	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(salariesDAO);

	}
	
    @Test
	public void testConsultar(){
		LOGGER.debug("inicio.testConsultar");
		List<Integer> lstEmpNo = new  ArrayList<Integer>(0);
		lstEmpNo.add(10001);
		lstEmpNo.add(10002);
		lstEmpNo.add(10003);
		lstEmpNo.add(10004);
		lstEmpNo.add(10005);

		List<Salary> lstSalary= salariesDAO.consultarSalariesPorRango(lstEmpNo, 1, 10);
		LOGGER.debug("lstSalary.size="+lstSalary.size());
		
		for(Salary salary:lstSalary){
		LOGGER.debug("Salary="+salary.toString());
		}

    }
}
