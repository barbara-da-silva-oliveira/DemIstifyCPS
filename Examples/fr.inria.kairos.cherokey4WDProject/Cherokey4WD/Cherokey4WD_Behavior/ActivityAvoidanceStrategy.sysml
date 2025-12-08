package ActivityDiagramAvoidanceStrategy {

    item def Command;
    item def AvoidanceCommand {
        attribute maneuver; 
    }

    item def ObstacleData {
        attribute position : ScalarValues::String;
        attribute distance : ScalarValues::Real;
    }

    port def StrategyOutput {
 //       out command : AvoidanceCommand;
    }

    action def ActivityAvoidanceStrategy {
        in obstacle : ObstacleData;
        out strategyOutput : StrategyOutput;
    }

    action activityAvoidanceStrategy : ActivityAvoidanceStrategy {
        port strategyOutput : StrategyOutput;
        first computeAvoidance;

        action computeAvoidance {
            in obstacle : ObstacleData;
            out command : AvoidanceCommand;
        }

        flow computeAvoidance.command to sendCommand.command;
            
        action sendCommand {
            in command: Command;
            send command via strategyOutput;
        }

        then done;
    }
}