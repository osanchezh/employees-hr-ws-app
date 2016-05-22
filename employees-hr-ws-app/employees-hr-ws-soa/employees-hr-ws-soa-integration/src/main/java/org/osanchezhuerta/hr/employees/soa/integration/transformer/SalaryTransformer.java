package org.osanchezhuerta.hr.employees.soa.integration.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.SalaryTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.SalaryDTO;

public final class SalaryTransformer {
   public static SalaryDTO toDataTransferObject(SalaryTO salaryTO){
	   SalaryDTO salaryDTO = new SalaryDTO();
	   salaryDTO.setEmpNo(salaryTO.getEmpNo());
	   salaryDTO.setFromDate(salaryTO.getFromDate());
	   salaryDTO.setSalary(salaryTO.getSalary());
	   salaryDTO.setToDate(salaryTO.getToDate());
	   
	   return salaryDTO;
   }
   
}
