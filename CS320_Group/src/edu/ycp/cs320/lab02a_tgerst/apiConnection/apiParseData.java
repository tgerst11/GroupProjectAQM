package edu.ycp.cs320.lab02a_tgerst.apiConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;
import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class apiParseData {
	private Module mod;
	
	public void setModel(Module model) {
		this.mod = model;
	}
	
	public void call() throws Exception{
		//AirVisual API key: 7e0e33b0-3788-49d8-bdd4-692e0397a293

		//input = URLEncoder.encode(input, "UTF-8").replaceAll("\\+", "%20");
		String url = "http://api.airvisual.com/v2/city?city=Los%20Angeles&state=California&country=USA&key=7e0e33b0-3788-49d8-bdd4-692e0397a293";
		
		URL api = new URL(url);
		
		HttpURLConnection conn = (HttpURLConnection) api.openConnection();
		
		conn.setRequestMethod("GET");
		
		//investigate this line further... is it needed?
		//conn.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		//int responseNumber = conn.getResponseCode();
		
		//for testing purposes
		//System.out.println("Sending GET request to "+ url + "..... Response Code: "+ responseNumber);
		
		//Read the file returned
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine = reader.readLine()) != null){
			response.append((inputLine));
			
		}
		
		reader.close();
				
		//print out original format... testing
		//System.out.println(response.toString());
		
		
		//parse JSON Object
		JSONObject object = new JSONObject(response.toString());
		JSONObject data = object.getJSONObject("data");
		JSONObject current = data.getJSONObject("current");
		JSONObject weather = current.getJSONObject("weather");
		JSONObject pollution = current.getJSONObject("pollution");
		
		Object city = data.get("city");
		Object state = data.get("state");
		Object country = data.get("country");
		JSONObject location = data.getJSONObject("location");
		Object coordinates = location.get("coordinates");
		Object timestamp = weather.get("ts");		
		Object temp = weather.get("tp");
		Object pressure = weather.get("pr");
		Object humidity = weather.get("hu");
		Object windSpeed = weather.get("ws");
		Object windDirection = weather.get("wd");
		Object aqi = pollution.get("aqius");
		Object mainPol = pollution.get("mainus");
	 
		mod.setCity(city);
		mod.setState(state);
		mod.setCountry(country);
		mod.setCoordinates(coordinates);
		mod.setTime((String) timestamp);
		mod.setTemperature(temp);
		mod.setAQI(aqi);
		mod.setPressure(pressure);
		mod.setHumidity(humidity);
		mod.setWindSpeed(windSpeed);
		mod.setWindDir(windDirection);
		mod.setMainPol(mainPol);
		/*
		System.out.println("city- "+ city);
		System.out.println("state- "+ state);
		System.out.println("country- "+ country);
		System.out.println("coordinates-"+ coordinates);
		System.out.println("timestamp-"+ timestamp);
		System.out.println("temperature (Celsius)-"+ temp);
		System.out.println("AQI-"+ aqi);
		System.out.println("Atmospheric Pressure (hPa)-"+ pressure);
		System.out.println("humidity (%)-"+ humidity);
		System.out.println("wind speed (m/s)-" + windSpeed);
		System.out.println("wind direction-" + windDirection);
		System.out.println("main pollutant-"+ mainPol);
		*/
		
		
	}
}
