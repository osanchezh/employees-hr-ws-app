package org.osanchezhuerta.hr.employees.soa.integration.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.TitleTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.TitleDTO;

public final class TitleTransformer {
	
  public static TitleDTO toDataTransferObject(TitleTO titleTO){
	  TitleDTO titleDTO = new TitleDTO();
	  titleDTO.setEmpNo(titleTO.getEmpNo());
	  titleDTO.setFromDate(titleTO.getFromDate());
	  titleDTO.setTitle(titleTO.getTitle());
	 
	  return titleDTO;
  }
}
