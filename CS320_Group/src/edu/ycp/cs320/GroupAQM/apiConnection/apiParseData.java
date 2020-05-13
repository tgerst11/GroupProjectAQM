package edu.ycp.cs320.GroupAQM.apiConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

import edu.ycp.cs320.GroupAQM.model.Module;

public class apiParseData {
	private Module mod;
	
	public void setModel(Module module) {
		this.mod= module;
	}
	
public void call(String input) throws Exception{
		//AirVisual API key: 7e0e33b0-3788-49d8-bdd4-692e0397a293. Use this at end of URL to access the API.
		input = URLEncoder.encode(input, "UTF-8").replaceAll("\\+", "%20");//replaces any spaces
		
		String url = "http://api.airvisual.com/v2/city?city=" +input+ "&state=Pennsylvania&country=USA&key=7e0e33b0-3788-49d8-bdd4-692e0397a293";
		
		URL api = new URL(url);
		
		HttpURLConnection conn = (HttpURLConnection) api.openConnection();
		
		conn.setRequestMethod("GET");
		
		//int responseNumber = conn.getResponseCode();
		//for testing purposes
		//System.out.println("Sending GET request to "+ url + "..... Response Code: "+ responseNumber);
		
		//Read the JSON file returned
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine = reader.readLine()) != null){
			//makes one long string
			response.append((inputLine));
			
		}
		
		reader.close();
				
		//print out original format... for testing
		//System.out.println(response.toString());
		
		
		//parse JSON Object to get individual items
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
		Object aqi= pollution.get("aqius");
		Object mainPol = pollution.get("mainus");
		
		//adds each object to module model
		mod.setCity(city.toString());
		mod.setState(state.toString());
		mod.setCountry(country.toString());
		mod.setCoordinates(coordinates.toString());
		mod.setTimeStamp(timestamp.toString());
		mod.setTemperature(temp.toString());
		mod.setAQI(aqi.toString());
		mod.setPressure(pressure.toString());
		mod.setHumidity(humidity.toString());
		mod.setWindSpeed(windSpeed.toString());
		mod.setWindDir(windDirection.toString());
		mod.setMainPol(mainPol.toString());
		
		/* For Testing:
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
