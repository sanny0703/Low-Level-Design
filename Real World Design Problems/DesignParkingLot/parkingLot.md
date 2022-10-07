# Designing Parking Lot

### first, let's see the flow of a parking lot system

#### => first we need a Vehicle,ParkingSpot and Ticket

#### => then comes the Entry Gate, where a ticket is assigned t the vehicle based on its priority and type

##### here we will assign a parking spot to the vehicle and update the spot, so that it can't be assigned to another vehicle until it becomes vacant again

#### => then comes our exit, where we will calculate the cost of parking and take tha payment and update that particular parking  spot, so it can be assigned to some other vehicle

### Now, let's see the requirements gathering part

#### => how many entry and exit gates?

#### => types of spots available(two-wheeler, four-wheeler etc.)?

#### => number of floors available for parking?

#### => hour based price or minute based price?
