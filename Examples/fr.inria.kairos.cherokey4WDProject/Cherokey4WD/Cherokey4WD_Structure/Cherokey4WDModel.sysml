package Cherokey4WDModel {
	doc
	/*
	 * Robot parts
	 */
	private import ScalarValues::*;
	private import SI::*;
	

	package PartDefinitions {
		part def Cherokey4WD {
			attribute mass : ScalarValues::Real = 0.045;
			attribute frontalArea : ScalarValues::Real=0.019488;
		}
		part def Controller {
			attribute voltage : Voltage = 5.0 ;
		}
		
		part def UltrasonicSensor {
			attribute rangeMin : ScalarValues::Real = 0.04;
			attribute rangeMax : ScalarValues::Real = 3.0;
			attribute angleRange : Angle = 180.0;
		}	
	
		part def Servo {
			attribute torque : ScalarValues::Real = 5.0; // kg*cm
			attribute angleRange : Angle = 180.0;
		}
		part def Chassis;
		part def Motor;
		part def Wheel;
		part def Battery;
		attribute def Voltage;
		attribute def Load;
		attribute def Angle;
		attribute def Dimension;
	}




}
