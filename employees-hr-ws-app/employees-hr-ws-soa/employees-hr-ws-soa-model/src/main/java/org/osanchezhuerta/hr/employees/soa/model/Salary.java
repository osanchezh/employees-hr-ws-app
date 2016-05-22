package org.osanchezhuerta.hr.employees.soa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the salaries database table.
 * 
 */
@Entity
@Table(name="salaries")
@NamedQuery(name="Salary.findAll", query="SELECT s FROM Salary s")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalaryPK id;

	private int salary;

	@Temporal(TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="emp_no")
	private Employee employee;

	public Salary() {
	}

	public SalaryPK getId() {
		return this.id;
	}

	public void setId(SalaryPK id) {
		this.id = id;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Salary [" + (id != null ? "id=" + id + ", " : "") + "salary=" + salary + ", "
				+ (toDate != null ? "toDate=" + toDate + ", " : "") + (employee != null ? "employee=" + employee : "")
				+ "]";
	}

}