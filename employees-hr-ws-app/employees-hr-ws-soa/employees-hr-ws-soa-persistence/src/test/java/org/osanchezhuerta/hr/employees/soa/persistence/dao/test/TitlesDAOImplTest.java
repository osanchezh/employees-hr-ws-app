package org.osanchezhuerta.hr.employees.soa.persistence.dao.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.osanchezhuerta.hr.employees.soa.model.Title;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.TitlesDAO;
import org.osanchezhuerta.hr.employees.soa.persistence.dao.impl.TitlesDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TitlesDAOImplTest  extends AbstractDBTestUnit {
	private static final Logger LOGGER = LoggerFactory.getLogger(TitlesDAOImplTest.class);
	
	private TitlesDAO titlesDAO = new TitlesDAOImpl();
	
	@Before
	public void setUp() {
		// Llamar la prueba padre para obtener el EntityManager
		super.setUp();
		// Llamar los datos de negocio
		// Conectar el EntityManager al servicio y sus daos
		connect(titlesDAO);

	}
    @Test
	public void testConsultar(){
		LOGGER.debug("inicio.testConsultar");
		List<Title> lstTitle= titlesDAO.obtenerTitlePorEmpNo(10005);
		LOGGER.debug("title.size="+lstTitle.size());
		for(Title title:lstTitle){
		LOGGER.debug("title="+title.toString());
		}
	}
}
