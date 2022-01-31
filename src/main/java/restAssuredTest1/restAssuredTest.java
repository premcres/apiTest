package restAssuredTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAssuredTest {
	
	@Test
	public void getResposeData_1()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	
	@Test
	public void getResposeData_2()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	@Test
	public void getResposeData_3()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	
	@Test
	public void getResposeData_4()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	
	@Test
	public void getResposeData_5()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	
	@Test
	public void getResposeData_6()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	@Test
	public void getResposeData_7()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}
	
	
	@Test
	public void getResposeData_8()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}

	@Test
	public void getResposeData_9()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}

	
	@Test(invocationCount = 300)
	public void getResposeData_10()
	{
	Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	int code = resp.getStatusCode();
	String data = resp.asString();
	System.out.println("The status code is :"+code);
	Assert.assertEquals(code, 200);
	System.out.println("The data is "+data);
	System.out.println("The response time is :"+resp.getTime());
	}

	
	
}
