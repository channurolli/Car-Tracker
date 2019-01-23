package rolli.Car_Tracker.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	String vin;
	String make;
	String model;
	int year;
//	int redlineRpm;
//	int maxFuelVolume;
	// Date lastServiceDate;

	public Car() {
	};

	public Car(String vin) {
		this.vin = UUID.randomUUID().toString();
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//	public int getRedlineRpm() {
//		return redlineRpm;
//	}
//
//	public void setRedlineRpm(int redLineRpm) {
//		this.redlineRpm = redLineRpm;
//	}

//	public int getMaxFuelVolume() {
//		return maxFuelVolume;
//	}
//
//	public void setMaxFuelVolume(int maxFuelVolume) {
//		this.maxFuelVolume = maxFuelVolume;
//	}

//	public Date getLastServiceDate() {
//		return lastServiceDate;
//	}
//
//	public void setLastServiceDate(Date lastServiceDate) {
//		this.lastServiceDate = lastServiceDate;
//	}

	@Override
	public String toString() {
//		return "Vehicle{" + "vin='" + vin + '\'' + ", make='" + make + '\'' + ", model='" + model + '\'' + ", year="
//				+ year + ", redLineRpm=" + redlineRpm + ", maxFuelVolume=" + "" + ", lastServiceDate='"
//				+  + '\'' + '}';
		return "Vehicle{" + "vin='" + vin + '\'' + ", make='" + make + '\'' + ", model='" + model + '\'' + ", year="
				+ year + ", redLineRpm=" + +'\'' + '}';
	}
}
