package com.redhat.summit;

// {"sensorid":"ti_cc2650", "temp":17.1, "time":1445023872175} 
public class TempPojo {
  private String sensorid;
  private float temp;
  private String time;

  public String getSensorid() {
	return sensorid;
  }	
  public void setSensorid(String sensorid) {
	this.sensorid = sensorid;
  }
  public float getTemp() {
	return temp;
  }
  public void setTemp(float temp) {
	this.temp = temp;
  }
  public String getTime() {
	return time;
  }
  public void setTime(String time) {
	this.time = time;
  }
	
}