package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;

@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity{
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "numberofbasement")
	private Integer numberOfBasement;
	
	@Column (name = "buildingarea")
	private Integer buildingArea;
	
	@Column (name = "street")
	private String street;
	
	@Column (name = "structure")
	private String structure;

	@Column (name = "ward")
	private String ward;
	
	@Column (name = "district")
	private String district;
	
	@Column (name = "costrent")
	private Integer costRent;
	
	@Column (name = "costdescription")
	private String costDescription;
	
	@Column (name = "servicecost")
	private String serviceCost;
	
	@Column (name = "carcost")
	private String carCost;
	
	@Column (name = "motorbikecost")
	private String motorbikeCost;
	
	@Column (name = "overtimecost")
	private String overtimeCost;
	
	@Column (name = "electricitycost")
	private String electricityCost;
	
	@Column (name = "deposit")
	private String deposit;
	
	@Column (name = "payment")
	private String payment;
	
	@Column (name = "timerent")
	private String timerent;
	
	@Column (name = "timedecorator")
	private String timeDecorator;
	
	@Column (name = "managername")
	private String managerName;
	
	@Column (name = "managerphone")
	private String managerPhone;
	
	@Column (name = "type")
	private String type;
	
	
	public Integer getCostRent() {
		return costRent;
	}

	public void setCostRent(Integer costRent) {
		this.costRent = costRent;
	}

	public String getCostDescription() {
		return costDescription;
	}

	public void setCostDescription(String costDescription) {
		this.costDescription = costDescription;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public Integer getBuildingArea() {
		return buildingArea;
	}

	public void setBuildingArea(Integer buildingArea) {
		this.buildingArea = buildingArea;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}

	public String getCarCost() {
		return carCost;
	}

	public void setCarCost(String carCost) {
		this.carCost = carCost;
	}

	public String getMotorbikeCost() {
		return motorbikeCost;
	}

	public void setMotorbikeCost(String motorbikeCost) {
		this.motorbikeCost = motorbikeCost;
	}

	public String getOvertimeCost() {
		return overtimeCost;
	}

	public void setOvertimeCost(String overtimeCost) {
		this.overtimeCost = overtimeCost;
	}

	public String getElectricityCost() {
		return electricityCost;
	}

	public void setElectricityCost(String electricityCost) {
		this.electricityCost = electricityCost;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getTimerent() {
		return timerent;
	}

	public void setTimerent(String timerent) {
		this.timerent = timerent;
	}

	public String getTimeDecorator() {
		return timeDecorator;
	}

	public void setTimeDecorator(String timeDecorator) {
		this.timeDecorator = timeDecorator;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}
	
	
	
}
