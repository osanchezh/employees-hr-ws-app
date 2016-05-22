package org.osanchezhuerta.hr.employees.soa.services.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.TitleTO;
import org.osanchezhuerta.hr.employees.soa.model.Title;

public final class TitleTransformer {
  public static TitleTO toTransferObject(Title title){
	  TitleTO titleTO = new TitleTO();
	  titleTO.setEmpNo(title.getId().getEmpNo());
	  titleTO.setFromDate(title.getId().getFromDate());
	  titleTO.setTitle(title.getId().getTitle());
	  return titleTO;
  }
}
