package com.example.jc321013.weatherapp;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Typeface weatherFont;

    TextView cityField;
    TextView updatedField;
    TextView detailsField;
    TextView currentTemperatureField;
    TextView weatherIcon;

    Handler handler;

    public MainActivityFragment() {
        handler = new Handler();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        cityField = (TextView)rootView.findViewById(R.id.place);
        updatedField = (TextView)rootView.findViewById(R.id.WeatherUpdate);
        detailsField = (TextView)rootView.findViewById(R.id.info);
        currentTemperatureField = (TextView)rootView.findViewById(R.id.temperature);
        weatherIcon = (TextView)rootView.findViewById(R.id.icon);

        weatherIcon.setTypeface(weatherFont);
        return rootView;

//        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weatherFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/weather.ttf");
        updateWeatherData(new CityPreference(getActivity()).getCity());
    }

    private void updateWeatherData(Object city) {
        
    }

}
