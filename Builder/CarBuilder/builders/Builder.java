package CarBuilder.builders;

import CarBuilder.cars.CarType;
import CarBuilder.components.Engine;
import CarBuilder.components.GPSNavigator;
import CarBuilder.components.Transmission;
import CarBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    
}
