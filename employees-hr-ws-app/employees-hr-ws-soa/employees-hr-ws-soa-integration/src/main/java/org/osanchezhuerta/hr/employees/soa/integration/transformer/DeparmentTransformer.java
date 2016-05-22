package org.osanchezhuerta.hr.employees.soa.integration.transformer;

import org.osanchezhuerta.hr.employees.soa.commons.to.DepartmentTO;
import org.osanchezhuerta.hr.employees.soa.integration.api.dto.DepartmentDTO;

public final class DeparmentTransformer {
	
	public static DepartmentTO toDataTransferObject(DepartmentDTO departmentDto){
		DepartmentTO departmentTO =new DepartmentTO();
		departmentTO.setDeptName(departmentDto.getDeptName());
		departmentTO.setDeptNo(departmentDto.getDeptNo());
		return departmentTO;
	}
	

}
