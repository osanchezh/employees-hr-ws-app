package org.osanchezhuerta.hr.employees.soa.persistence.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.osanchezhuerta.hr.employees.soa.model.Department;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.DepartmentsDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.impl.DepartmentsDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepartmentsDAOImplTest extends AbstractDBTestUnit {
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentsDAOImplTest.class);
	private DepartmentsDAO departmentsDAO = new DepartmentsDAOImpl();


	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(departmentsDAO);

	}
	

    @Test
	public void testConsultar(){
     
		LOGGER.debug("inicio.testConsultar");
		try{
		Department departmentNew=new Department();
		departmentNew.setDeptName("DEPARTAMENTO PRUEBA");
		departmentNew.setDeptNo("5001");
		departmentsDAO.create(departmentNew);
		departmentsDAO.flush();
		this.commit();
		}catch(Exception exception){
			LOGGER.debug(exception.getMessage(),exception);
		}

    }
}
