package ActivityDiagramDynamicDetection{
	
	attribute def DetectionThreshold ;
	attribute def SweepDelay;
	attribute def DelayStartStaticDetection;
	
	item def StopCommand;
	item def ServoPosition;
	item def DistanceObstacle;
	item def CurrentPosition;
	item def NextServoPosition;
	item def TriggerMeasurement;
	item def Position;



	action def ServoPositionReset{
		out servoPosition: ServoPosition;
	}

	action def ComputeNextPosition{
		in servoPosition : ServoPosition;
		out nextServoPosition : NextServoPosition;
	}
	
	action def StartMeasurement{
		in servoPosition : ServoPosition;
		in sweepDelay : SweepDelay;
	    out triggerMeasuremen : TriggerMeasurement;
	    out nextServoPosition : NextServoPosition;
	}
	
	action def SendSignalObstacle{
    	in  distanceIn : DistanceObstacle;
    	out distanceOut: DistanceObstacle;
    	out stopCommand : StopCommand;
	}
	
	action def ComputeDistance {
	      in  triggerMeasurement : TriggerMeasurement;
	      out distance : DistanceObstacle;
	    }
	
	action def ActivityDynamicDetection{
		in  detectionThreshold : DetectionThreshold;
   		in  sweepDelay : SweepDelay;
    	out obstacleDistance : DistanceObstacle;
	}
	
	action activityDynamicDetection : ActivityDynamicDetection {
		
		attribute detectionThreshold : ScalarValues::Real = 0.06;
		attribute sweepDelay : ScalarValues::Real = 0.8 ;
		
	    first start;
	    then servoPositionReset;
	        
	    action servoPositionReset : ServoPositionReset {
	        out servoPosition;
	    }
	    then startMeasurement;
	    flow servoPositionReset.servoPosition to startMeasurement.servoPosition;
	    
	    action startMeasurement : StartMeasurement{
//	        in servoPosition = servoPositionReset.servoPosition;
			in servoPosition;
//	        in sweepDelay = activityDynamicDetection.sweepDelay;
			in sweepDelay;
	        out triggerMeasurement;
	        out nextServoPosition ;
	    }
	    
		then computeDistance;
		flow startMeasurement.triggerMeasurement to computeDistance.triggerMeasurement;
		
	    then action computeDistance : ComputeDistance {
	      in  triggerMeasurement;
	      out distance;
	    }
	    
	    then decide;
	    	if computeDistance.distance <= detectionThreshold then sendSignalObstacle;
	    	if computeDistance.distance > detectionThreshold then done;
	    
	    flow computeDistance.distance to sendSignalObstacle.distanceIn;
	    
		action sendSignalObstacle : SendSignalObstacle {
        	in  distanceIn;
        	out distanceOut;
        	out stopCommand;
        	flow activityDynamicDetection.sendSignalObstacle.distanceOut to activityDynamicDetection.obstacleDistance;
        	flow activityDynamicDetection.sendSignalObstacle.stopCommand to ActivityWheelControl.activityWheelControl.stopCommand;
        }	
	   
	}
}