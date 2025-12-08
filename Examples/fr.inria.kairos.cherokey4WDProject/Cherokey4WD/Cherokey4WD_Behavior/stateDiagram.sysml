package 'CPD_System_States' {

  attribute def UnattendedChildDetected;
  attribute def AtRiskChildDetected;
  attribute def SystemActive;
  attribute def ManualOverride;
  attribute def ChildPresenceAlert;
  attribute def EmergencyAlertTriggered;

  part def ChildSafetyMonitoringSystem;

  action performDetectionCheck { in system : ChildSafetyMonitoringSystem; }
  action sendAlert { /* Action body for sending alerts */ }
  action performSystemCheck { /* Action body for system checks */ }
  action triggerEmergencyAlert { /* Action body for emergency alerts */ }

  state def CPDSystemStates { in operatingSystem : ChildSafetyMonitoringSystem; }

  state cpdSystemStates : CPDSystemStates {
    in operatingSystem : ChildSafetyMonitoringSystem;

    entry; then inactive;
	
	state inactive;
    accept SystemActive
      then active;

    state active {
      entry performSystemCheck { in system = operatingSystem; }
      do action performDetectionCheck { /* ... */ }
    }
    accept UnattendedChildDetected
      then alerting;

    state alerting {
      entry sendAlert { in system = operatingSystem; }
      do action sendAlert { /* ... */ }
    }
    accept ManualOverride
      then inactive;
    accept ChildPresenceAlert
      then alertAcknowledged;

    state alertAcknowledged;
    accept EmergencyAlertTriggered
      then emergencyResponse;

    state emergencyResponse {
      entry triggerEmergencyAlert { in system = operatingSystem; }
      do action triggerEmergencyAlert { /* ... */ }
    }
    accept ManualOverride
      then inactive;
  }
}