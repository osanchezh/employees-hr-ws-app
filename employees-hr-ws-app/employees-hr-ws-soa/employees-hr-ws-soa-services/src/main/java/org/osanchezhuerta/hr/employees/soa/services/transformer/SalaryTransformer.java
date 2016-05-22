package org.osanchezhuerta.hr.employees.soa.services.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.SalaryTO;
import org.osanchezhuerta.hr.employees.soa.model.Salary;

public final class SalaryTransformer {
   public static SalaryTO toTransferObject(Salary salary){
	   SalaryTO salaryTO = new SalaryTO();
	   salaryTO.setEmpNo(salary.getId().getEmpNo());
	   salaryTO.setFromDate(salary.getId().getFromDate());
	   salaryTO.setSalary(salary.getSalary());
	   salaryTO.setToDate(salary.getToDate());
	   return salaryTO;
   }
}
