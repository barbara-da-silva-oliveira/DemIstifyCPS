package ActivityDiagramStaticDetection{
	item def ServoPosition;
	item def StopCommand;
	item def CurrentPosition;
	item def NextServoPosition;
	item def TriggerMeasurement;
	item def Position;
	item def DistanceObstacle;
	item def TriggerReset;
	
	attribute def SweepDelay;
	attribute def DelayStartStaticDetection;
	attribute def DetectionThreshold;

	action def StopRobot{
		in delayStartStaticDetection : DelayStartStaticDetection;
		out stopCommand : StopCommand;	
	}
	
	action def ServoPositionReset{
		in triggerReset : TriggerReset;
		out servoPosition: ServoPosition;
	}

	action def ComputeNextPosition{
		in servoPosition : ServoPosition;
		out nextServoPosition : NextServoPosition;
	}
	
	action def StartMeasurement{
		in servoPosition : ServoPosition;
		in sweepDelay : SweepDelay;
	    out triggerMeasurement : TriggerMeasurement;
	    out nextServoPosition : NextServoPosition;
	}
	
	action def ComputeDistance{
		in triggerMeasurement : TriggerMeasurement;
	    in servoPosition : ServoPosition;
		out distanceObstacle : DistanceObstacle ;
	}
	
	action def TargetStaticDetectionDone;


	action def ActivityStaticDetection {
		in  sweepDelay              : SweepDelay;
		in  delayStartStaticDetection : DelayStartStaticDetection;
 		in  detectionThreshold      : DetectionThreshold;
   		inout distanceObstacle        : DistanceObstacle;
  	}
	 
	action  activityStaticDetection : ActivityStaticDetection {
		
		attribute sweepDelay : ScalarValues::Real = 0.8 ;
		attribute delayStartStaticDetection : ScalarValues::Real = 1.0 ;
		attribute detectionThreshold : DetectionThreshold : ScalarValues::Real = 0.08;
		
	    first start; 
	    
	    then action stopRobot : StopRobot {
	    	in delayStartStaticDetection;
	        
	    }
		
		
	    then action servoPositionReset : ServoPositionReset {
	      	in triggerReset;
	        out servoPosition;
	    }
	
		flow servoPositionReset.servoPosition to computeNextPosition.servoPosition;
	
	    then action computeNextPosition : ComputeNextPosition{
	        in servoPosition;
	        out nextServoPosition;
	    }
	    
		flow computeNextPosition.nextServoPosition to startMeasurement.servoPosition;

	    action startMeasurement : StartMeasurement{
	        in servoPosition;
	        in sweepDelay;
	        out triggerMeasurement;
	        out nextServoPosition;
	    }
	    
		flow startMeasurement.triggerMeasurement to computeDistance.triggerMeasurement;
		flow startMeasurement.nextServoPosition to computeDistance.servoPosition;
	
	    then action computeDistance : ComputeDistance {
	    	in triggerMeasurement;
	        in servoPosition;
	        out distanceObstacle;
	    }
	    
	    then decide;
	    	if computeDistance.distanceObstacle <= activityStaticDetection.detectionThreshold then targetStaticDetectionDone;
	    	if computeDistance.servoPosition >= 180.0 then continue;
 
      	action continue {
      		flow activityStaticDetection.computeDistance.distanceObstacle to activityStaticDetection.distanceObstacle;
      		out triggerReset;
      	}
      		
      	flow continue.triggerReset to servoPositionReset.triggerReset;
      		
      	action targetStaticDetectionDone : TargetStaticDetectionDone{
       		flow activityStaticDetection.computeDistance.distanceObstacle to activityStaticDetection.distanceObstacle;
      	}
      	
      	then done;  
  
	 //then continue;
		//then merge continue;	  
	}
	
}
