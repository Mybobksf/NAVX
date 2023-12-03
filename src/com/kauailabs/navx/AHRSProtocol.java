package com.kauailabs.navx;


public class AHRSProtocol extends IMUProtocol {
  //variable initalization
	public static final byte NAVX_CAL_STATUS_IMU_CAL_STATE_MASK = 0x03;
	public static final byte NAVX_CAL_STATUS_IMU_CAL_INPROGRESS = 0x00;
	public static final byte NAVX_CAL_STATUS_IMU_CAL_ACCUMULATE = 0x01;
	public static final byte NAVX_CAL_STATUS_IMU_CAL_COMPLETE = 0x02;
	public static final byte NAVX_CAL_STATUS_MAG_CAL_COMPLETE = 0x04;
	public static final byte NAVX_CAL_STATUS_BARO_CAL_COMPLETE = 0x08;
}
