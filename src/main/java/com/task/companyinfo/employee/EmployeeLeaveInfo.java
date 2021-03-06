package com.task.companyinfo.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeLeaveInfo {
	@Id
	@GeneratedValue
	private int sNO;
	private int employeeID;
	private String leaveDate;
	private String leaveStatus;
	public EmployeeLeaveInfo(int employeeID, String leaveDate, String leaveStatus) {
		super();
		this.employeeID = employeeID;
		this.leaveDate = leaveDate;
		this.leaveStatus = leaveStatus;
	}

}
