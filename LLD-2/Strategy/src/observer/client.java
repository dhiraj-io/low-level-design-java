package observer;

public class client {

    static void main(String[] args) {
        WeatherService weatherService = new WeatherService(30);

        IPhoneUI iPhoneUI = new IPhoneUI(weatherService);
        MacUI macUI = new MacUI(weatherService);

        weatherService.unSubscribe(iPhoneUI);
        weatherService.updateTemp();

    }
}
