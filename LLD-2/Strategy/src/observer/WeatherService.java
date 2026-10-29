package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

    int temp;

    private List<WeatherSubscriber> subscriberList;



    public WeatherService(int temp) {
        this.temp = temp;
        this.subscriberList = new ArrayList<>();
    }

    public WeatherService(int temp, List<WeatherSubscriber> subscriberList) {
        this.temp = temp;
        this.subscriberList = subscriberList;
    }

    public void subscribe(WeatherSubscriber subscriber)
    {
        subscriberList.add(subscriber);
    }

    public void unSubscribe(WeatherSubscriber subscriber)
    {
        subscriberList.remove(subscriber);
    }
    public void updateTemp()
    {
        temp += 5;
        notifyAllSubs(temp);
    }

    private void notifyAllSubs(int temp) {
        for(WeatherSubscriber weatherSubscriber : subscriberList)
        {
            weatherSubscriber.onUpdateWeather(temp);
        }
    }


}
