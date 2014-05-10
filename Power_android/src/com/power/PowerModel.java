package com.power;

/**
 * Created by wallace on 14-5-10.
 */
public class PowerModel {
	private static PowerModel mInstance;
	
	private PowerModel(){}
	
	public PowerModel getInstance() {
		if (mInstance == null) {
			return new PowerModel();
		}
		return mInstance;
	}
	
    public void start() {

    }

    public void stop() {

    }

    public double getCurPowerCost() {
        return 0.0;
    }

    public long getRunningTime() {
        return 0L;
    }
    
    
}
