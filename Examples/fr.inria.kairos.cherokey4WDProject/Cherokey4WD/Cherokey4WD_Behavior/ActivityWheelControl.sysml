package ActivityDiagramWheelControl{
	
	item def StopCommand;
	item def ForwardCommand;
	item def TurnLeftCommand;
	item def TurnRightCommand;
	item def BackCommand;
	
	item def WheelPower;
	attribute def SpeedWheel;
	
	action def HandleForward{
		in speedWheel : SpeedWheel;
	    out leftWheelPower : WheelPower;
	    out rightWheelPower : WheelPower;
	}
	
	action def HandleStop{
		in speedWheel : SpeedWheel;
	    out leftWheelPower : WheelPower;
	    out rightWheelPower : WheelPower;
	}
	
	action def HandleTurnLeft{
		in speedWheel : SpeedWheel;
	    out leftWheelPower : WheelPower;
	    out rightWheelPower : WheelPower;
	}
	action def HandleTurnRight{
		in speedWheel : SpeedWheel;	
	    out leftWheelPower : WheelPower;
	    out rightWheelPower : WheelPower;
	}
	
	action def ActivityWheelControl{	
	}
	
	action activityWheelControl : ActivityWheelControl{	
		attribute  speedWheel: ScalarValues::Real = 0.3;
	    first start;
	    	then handleForward;  	
		accept ForwardCommand;
			then handleForward;
			
			
//	    then decide;
//	    	if moveCommand.command == "stop" then handleStop;
//	    	if moveCommand.command == "forward" then handleForward;
//			if moveCommand.command == "left" then handleTurnLeft;
//			if moveCommand.command == "right" then handleTurnRight;
	
		accept StopCommand;
			then handleStop;
			
	    action handleStop {
	        in cmd : StopCommand;
	        in speedWheel ;
	        out leftWheelPower : ScalarValues::Real;
	        out rightWheelPower : ScalarValues::Real;
	    }
	
	    action handleForward {
	        in speedWheel;
	        out leftWheelPower : ScalarValues::Real;
	        out rightWheelPower : ScalarValues::Real;
	    }
	    
	    accept BackCommand;
			then handleBack;
			
	    action handleBack {
	        in speedWheel;
	        out leftWheelPower : ScalarValues::Real;
	        out rightWheelPower : ScalarValues::Real;
	    }
	    
		accept TurnLeftCommand;
			then handleTurnLeft;
			
	    action handleTurnLeft {
	    	in speedWheel;
	        out leftWheelPower : ScalarValues::Real;
	        out rightWheelPower : ScalarValues::Real;
	    }
	    
	    accept TurnRightCommand;
			then handleTurnRight;
			
	    action handleTurnRight {
	    	in speedWheel;
	        out leftWheelPower : ScalarValues::Real;
	        out rightWheelPower : ScalarValues::Real;
	    }
	    
	    then done;
	
	}
}
