package CarBuilder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "경기도 의정부 기능 444";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
