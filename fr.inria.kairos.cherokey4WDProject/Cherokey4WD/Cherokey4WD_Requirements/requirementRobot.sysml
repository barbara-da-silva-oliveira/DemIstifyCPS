package req {
    private import RequirementDerivation::*;

    requirement <'STK_REQ_CPD_01'> 'Unattended Child Detection' {
        doc /*The system shall detect when a child is left unattended in a locked and parked vehicle.*/
    }

    requirement <'STK_REQ_CPD_02'> 'At-Risk Child Coverage' {
        doc /*The system shall detect children who may be at risk due to age or size.*/
    }

    #derivation connection {
        end #original ::> 'Unattended Child Detection';
        end #derive ::> 'At-Risk Child Coverage';
    }

    requirement <'STK_REQ_CPD_03'> 'Interior Range Coverage' {
        doc /*The system shall monitor areas within the vehicle where children may be present.*/
    }

    #derivation connection {
        end #original ::> 'Unattended Child Detection';
        end #derive ::> 'Interior Range Coverage';
    }

    requirement <'STK_REQ_CPD_04'> 'Child Presence Alert' {
        doc /*The system shall provide timely and clear alerts to the user if a child is detected inside the vehicle.*/
    }

    requirement <'STK_REQ_CPD_05'> 'Alert Distinctiveness' {
        doc /*The system shall ensure child presence alerts are easily distinguishable from other notifications.*/
    }

    #derivation connection {
        end #original ::> 'Child Presence Alert';
        end #derive ::> 'Alert Distinctiveness';
    }

    requirement <'STK_REQ_CPD_06'> 'Cabin Safety Maintenance' {
        doc /*The system shall maintain a safe and comfortable cabin environment for a child left unattended in a locked vehicle.*/
    }

    #derivation connection {
        end #original ::> 'Unattended Child Detection';
        end #derive ::> 'Cabin Safety Maintenance';
    }

    requirement <'STK_REQ_CPD_07'> 'Remote Notification' {
        doc /*The system shall send alerts to the user's mobile device in case of child detection.*/
    }

    #derivation connection {
        end #original ::> 'Child Presence Alert';
        end #derive ::> 'Remote Notification';
    }

    requirement <'STK_REQ_CPD_08'> 'Cloud Connectivity' {
        doc /*The system shall support cloud-based notifications for CPDSystems.*/
    }

    #derivation connection {
        end #original ::> 'Remote Notification';
        end #derive ::> 'Cloud Connectivity';
    }

    requirement <'STK_REQ_CPD_09'> 'Manual Override' {
        doc /*The system shall allow the user to manually disable or acknowledge alerts.*/
    }

    #derivation connection {
        end #original ::> 'Child Presence Alert';
        end #derive ::> 'Manual Override';
    }

    requirement <'STK_REQ_CPD_10'> 'System Availability' {
        doc /*The system shall remain active when the vehicle is parked and locked.*/
    }

    #derivation connection {
        end #original ::> 'Unattended Child Detection';
        end #derive ::> 'System Availability';
    }

    requirement <'STK_REQ_CPD_11'> 'False Alarm Reduction' {
        doc /*The system shall minimize false detections caused by objects or pets.*/
    }

    #derivation connection {
        end #original ::> 'Unattended Child Detection';
        end #derive ::> 'False Alarm Reduction';
    }

    requirement <'STK_REQ_CPD_12'> 'Emergency Alert Integration' {
        doc /*The system shall integrate with vehicle horn/flasher to provide emergency warnings.*/
    }

    #derivation connection {
        end #original ::> 'Child Presence Alert';
        end #derive ::> 'Emergency Alert Integration';
    }
}