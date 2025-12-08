package 'systemParts'{
	private import ScalarValues::*;
	
	part def DynamicDetection{
		attribute def servoPosition : Real; 
        attribute def distance : Real; 
        action servoPositionReset();
        action computeNextServoPosition();
        action startMeasurement();
        action computeDistance();
        action obstacleDetected();
	}
	part def StaticDetection{
		attribute def servoPosition : Real;
        attribute def obstacle : Boolean;
        action stopRobot();
        action servoPositionReset();
        action computeNextServoPosition();
        action startMeasurement();
        action computeDistance();
        action staticDetectionDone();
	}
	part def AvoidanceStrategy{
		action extractClosestObstacle();
        action computeAvoidanceMoves();
        action startAvoidance();
        action cancelAvoidance();
	}
	part def AvoidanceMove{
        action decomposeMoves();
        action sendCommand();
        action avoidanceFinished();
	}
	part def WheelController{
		attribute def leftWheelPower : Real;
        attribute def rightWheelPower : Real;
        action newCommand();
        action handleStop();
        action handleForward();
        action handleTurn();
	}
}