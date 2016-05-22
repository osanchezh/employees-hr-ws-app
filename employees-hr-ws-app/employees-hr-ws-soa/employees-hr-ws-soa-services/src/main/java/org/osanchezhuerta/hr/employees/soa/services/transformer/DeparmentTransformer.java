package org.osanchezhuerta.hr.employees.soa.services.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.DepartmentTO;
import org.osanchezhuerta.hr.employees.soa.model.Department;

public final class DeparmentTransformer {
	
	//public static DepartmentTO toDataTransferObject(DepartmentDTO departmentDto){
		
	//}
	
	public static Department toEntity(DepartmentTO departmentTO){
		Department department = new Department();
		department.setDeptNo(departmentTO.getDeptNo());
		department.setDeptName(departmentTO.getDeptName());
		return department;
	}
}
