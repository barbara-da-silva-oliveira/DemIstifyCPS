package SystemStates {

    attribute def ObstacleDetected;
    attribute def StaticDetectionDone;
	attribute def StartAvoidance;
    attribute def AvoidanceFinished;
    attribute def CancelAvoidance;
    attribute def SystemActive;

    part def Cherokey4WD;

    action performDynamicDetection { in system : Cherokey4WD; }
    action performStaticDetection { in system : Cherokey4WD; }
    action performAvoidanceStrategy { in system : Cherokey4WD; }
    action performAvoidanceMove { in system : Cherokey4WD; }
    action performNormalMove { in system : Cherokey4WD; }

    
	state def InitialState parallel {
		state NormalMove;
		state DynamicDetection;
	}
    
    state def CherokeyStates { in operatingSystem : Cherokey4WD; }

	state cherokeyStates : CherokeyStates {
    in operatingSystem : Cherokey4WD;

    entry; then initialState;
        
    state initialState parallel {
        state normalMove {
            entry performNormalMove { in system = operatingSystem; }
            do action performNormalMove { /* continuous forward movement */ }
        }
        
        state dynamicDetection {
            entry performDynamicDetection { in system = operatingSystem; }
            do action performDynamicDetection { /* sweep sensors */ }
	    }
   	}
    
	accept ObstacleDetected
           then staticDetection;
        
    state staticDetection {
      entry performStaticDetection { in system = operatingSystem; }
      do action performStaticDetection { /* precise measurement */ }
      
    }
    
    accept StaticDetectionDone
      then avoidanceStrategy;

    state avoidanceStrategy {
		entry performAvoidanceStrategy { in system = operatingSystem; }
		do action performAvoidanceStrategy { /* compute path */ }
    }
    
    accept StartAvoidance
      then avoidanceMove;

    state avoidanceMove {
      entry performAvoidanceMove { in system = operatingSystem; }
      do action performAvoidanceMove { /* execute maneuver */ }
    }
    
    accept AvoidanceFinished
      then initialState;
  }
}
