package org.osanchezhuerta.hr.employees.soa.persistence.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.EmployeesDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.impl.EmployeesDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeesDAOImplTest  extends AbstractDBTestUnit {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	private EmployeesDAO employeesDAO = new EmployeesDAOImpl();
	
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(employeesDAO);

	}
	@Test
	public void testBajaEmployee(){
		LOGGER.debug("iniciando.prueba");
		int respuesta = employeesDAO.bajaEmployeePorNo(10002);
		//employeesDAO.flush();
		super.commit();
		LOGGER.debug("respuesta="+respuesta);
	}
}
