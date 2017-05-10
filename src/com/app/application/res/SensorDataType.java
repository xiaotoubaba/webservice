package com.app.application.res;

import java.util.EnumSet;

public enum SensorDataType {
	TEMP("temp", "温度"), 
	HUMIDITY("humidity", "湿度"), 
	AIR_SPEED("airSpeed", "风速"), 
	AIR_PRESSURE("airPressure", "气压"),
	WIND_DIRECTION("windDirection", "风速"), 
	PRECIPITATION("precipitation", "降水量"), 
	KLUX("klux", "光照强度"), SOIL_TEMP("soilTemp", "土壤温度"), 
	SOIL_HUMIDITY("soilHumidity", "土壤湿度");

	private String name;
	private String desc;

	private SensorDataType(final String name, final String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}

	public String getDesc() {
		return this.desc;
	}

	public static SensorDataType get(final String name) {
		final EnumSet<SensorDataType> set = EnumSet.allOf(SensorDataType.class);
		for (final SensorDataType st : set) {
			if (st.getName().equals(name))
				return st;
		}
		return null;
	}
}
