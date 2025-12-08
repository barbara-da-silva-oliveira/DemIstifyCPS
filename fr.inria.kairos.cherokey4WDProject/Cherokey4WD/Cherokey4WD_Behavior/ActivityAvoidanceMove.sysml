package ActivityDiagramAvoidanceMove {
    item def TurnLeftCommand;
    item def TurnRightCommand;
    item def BackCommand;
    item def ForwardCommand;
    item def StopCommand;
    
    item def MoveLeftCommand;
    item def MoveRightCommand;
    item def MoveBackCommand;
    item def MoveForwardCommand;
    
    port def MoveInput { 
        in turnLeftCmd : TurnLeftCommand; 
        in turnRightCmd : TurnRightCommand; 
        in backCmd : BackCommand; 
        in forwardCmd : ForwardCommand; 
    }
    
    port def MoveOutput {
        out moveLeft : MoveLeftCommand; 
        out moveRight : MoveRightCommand; 
        out moveBack : MoveBackCommand; 
        out moveForward : MoveForwardCommand; 
    }
    
    action def ActivityAvoidanceMove { 
        in moveInput : MoveInput; 
        out moveOutput : MoveOutput; 
    }
    
    action activityAvoidanceMove : ActivityAvoidanceMove {
        port moveOutput : MoveOutput;
        port moveInput : MoveInput;
        
        first start;
            then sendMoveForward;

        accept turnLeftCmd : TurnLeftCommand via moveInput;
            then sendMoveLeft;

        action sendMoveLeft {
            send new MoveLeftCommand() via moveOutput;
        }

        accept turnRightCmd : TurnRightCommand via moveInput;
            then sendMoveRight;

        action sendMoveRight {
            send new MoveRightCommand() via moveOutput;
        }

        accept backCmd : BackCommand via moveInput;
            then sendMoveBack;

        action sendMoveBack {
            send new MoveBackCommand() via moveOutput;
        }

        accept forwardCmd : ForwardCommand via moveInput;
            then sendMoveForward;

        action sendMoveForward {
            send new MoveForwardCommand() via moveOutput;
        }

        then done;
    }

}
