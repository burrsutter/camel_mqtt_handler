package com.redhat.summit;

// {"sensorid":"ti_cc2650", "temp":17.1, "time":1445023872175} 
public class TempPojo {
  private String sensorid;
  private String temp;
  private String time;

  public String getSensorid() {
	return sensorid;
  }	
  public void setSensorid(String sensorid) {
	System.out.println(sensorid);
	this.sensorid = sensorid;
  }
  public String getTemp() {
	return temp;
  }
  public void setTemp(String temp) {
	System.out.println(temp);
	this.temp = temp;
  }
  public String getTime() {
	return time;
  }
  public void setTime(String time) {
	System.out.println(time);
	this.time = time;
  }
	
}