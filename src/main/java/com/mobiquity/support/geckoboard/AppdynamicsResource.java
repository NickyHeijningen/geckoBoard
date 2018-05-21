package com.mobiquity.support.geckoboard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
import com.mobiquity.support.geckoboard.model.GeckoMeter;
import com.mobiquity.support.geckoboard.model.GeckoMeterValue;
import javax.ws.rs.core.Response;




@XmlRootElement
@Produces(MediaType.APPLICATION_JSON)
@Path("/AppDynamics")
public class AppdynamicsResource {
      
    @GET 
    @Path("/CallsPerMinuteAsLineChart/{companyName}")
    public Response CallsPerMinuteLineChart(@PathParam("companyName") String companyName) throws SQLException, JsonProcessingException {

                CompanyDB comp = new CompanyDB();
                
                ObjectMapper mapper = new ObjectMapper();
                String jackson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString( comp.getaverageCallsPerMinuteAsLineChart( companyName ));


          return Response.ok( jackson ).build();
    }
    
    @GET 
    @Path("/ErrorsPerMinuteAsLineChart/{companyName}")
    public Response ErrorsPerMinuteLineChart(@PathParam("companyName") String companyName) throws SQLException, JsonProcessingException {

                CompanyDB comp = new CompanyDB();
                
                ObjectMapper mapper = new ObjectMapper();
                String jackson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString( comp.getaverageErrorsPerMinuteAsLineChart(companyName));


          return Response.ok( jackson ).build();
    }
    
    @GET 
    @Path("/ResponseTimeAsLineChart/{companyName}")
    public Response ResponseTimeLineChart(@PathParam("companyName") String companyName) throws SQLException, JsonProcessingException {

                CompanyDB comp = new CompanyDB();
                
                ObjectMapper mapper = new ObjectMapper();
                String jackson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString( comp.getaverageResponseTimeAsLineChart(companyName));


          return Response.ok( jackson ).build();
    }
    
    @GET 
    @Path("/HealthStatusAsLineChart/{companyName}")
    public Response HealthStatusLineChart(@PathParam("companyName") String companyName) throws SQLException, JsonProcessingException {

                CompanyDB comp = new CompanyDB();
                
                ObjectMapper mapper = new ObjectMapper();
                String jackson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString( comp.getaverageHealthStatusLineChart(companyName));


          return Response.ok( jackson ).build();
    }
      
    @GET 
    @Path("/CallsPerMinute/{companyName}")
    public GeckoMeter setCallsPerMinute(@PathParam("companyName") String companyName) throws SQLException {
    	 CompanyDB comp = new CompanyDB();
    
    	 Company company = comp.getCompany(companyName);
    	 AppDynamics appdynamics = new AppDynamics(company);

    	 GeckoMeter geckometer = new GeckoMeter();
    	 geckometer.setItem(appdynamics.getCallsPerMinute());   
    	 
         GeckoMeterValue min = new GeckoMeterValue("0");
         geckometer.setMin(min);

         GeckoMeterValue max = new GeckoMeterValue(company.getMaxCallsPerMinute());
         geckometer.setMax(max);
         
       

         return geckometer;
    }
    
    @GET 
    @Path("/ErrorsPerMinute/{companyName}")
    public GeckoMeter setErrorsPerMinute(@PathParam("companyName") String companyName) throws SQLException {
    	 CompanyDB comp = new CompanyDB();
    
    	 Company company = comp.getCompany(companyName);
    	 AppDynamics appdynamics = new AppDynamics(company);

    	 GeckoMeter geckometer = new GeckoMeter();
    	 geckometer.setItem(appdynamics.getErrorsPerMinute());   
    	 
         GeckoMeterValue min = new GeckoMeterValue("0");
         geckometer.setMin(min);

         GeckoMeterValue max = new GeckoMeterValue(company.getMaxErrorsPerMinute());
         geckometer.setMax(max);
         
       

         return geckometer;
    }
    
    @GET 
    @Path("/AverageResponseTime/{companyName}")
    public GeckoMeter setAverageResponseTime(@PathParam("companyName") String companyName) throws SQLException{
    	 CompanyDB comp = new CompanyDB();
    	    
    	 Company company = comp.getCompany(companyName);
    	 AppDynamics appdynamics = new AppDynamics(company);

    	 GeckoMeter geckometer = new GeckoMeter();
    	 geckometer.setItem(appdynamics.getAverageResponseTime());
          	 
    	 GeckoMeterValue min = new GeckoMeterValue("0");
    	 geckometer.setMin(min);

    	 GeckoMeterValue max = new GeckoMeterValue(company.getMaxAverageResponseTime());
    	 geckometer.setMax(max);

    	 return geckometer;
    }

    @GET 
    @Path("/AverageHealthStatus/{companyName}")
    public GeckoMeter setAverageHealthStatus(@PathParam("companyName") String companyName) throws SQLException{
    	CompanyDB comp = new CompanyDB();
   
	GeckoMeter geckometer = new GeckoMeter();
	geckometer.setItem(comp.getHealthStatus(companyName));
                       
        GeckoMeterValue min = new GeckoMeterValue("0");
	geckometer.setMin(min);
	
	GeckoMeterValue max = new GeckoMeterValue("100");
	geckometer.setMax(max);
	
	return geckometer;
    }

    @GET 
    @Path("/MonthAverageCallsPerMinute/{companyName}")
    public GeckoMeter MonthAverageCallsPerMinute(@PathParam("companyName") String companyName) throws SQLException{
    	 CompanyDB company = new CompanyDB();
    	      	
    	 GeckoMeter geckometer = new GeckoMeter();
    	 geckometer.setItem(company.getAveragesMonthCallsPerMinute(companyName));             
    	 
    	 GeckoMeterValue min = new GeckoMeterValue("0");
    	 geckometer.setMin(min);

    	 GeckoMeterValue max = new GeckoMeterValue("1000");
    	 geckometer.setMax(max);

    	 return geckometer;
    }
    @GET 
    @Path("/MonthAverageResponseTime/{companyName}")
    public GeckoMeter MonthAverageResponseTime(@PathParam("companyName") String companyName) throws SQLException{
    	 CompanyDB company = new CompanyDB();
    	      	
    	 GeckoMeter geckometer = new GeckoMeter();
    	 geckometer.setItem(company.getAveragesMonthResponseTime(companyName));             
    	 
    	 GeckoMeterValue min = new GeckoMeterValue("0");
    	 geckometer.setMin(min);

    	 GeckoMeterValue max = new GeckoMeterValue("1000");
    	 geckometer.setMax(max);

    	 return geckometer;   
    }
    
    @GET 
    @Path("/information")
    public ArrayList<Company> getInformation() throws SQLException{
    	CompanyDB information = new CompanyDB();
        
  	
    	ArrayList<Company> companyInformation = information.getInformation();
        return companyInformation;
    }
    
    @GET 
    @Path("/serverSettings")
    public ArrayList<ServerInfo> getServerInfo() throws SQLException{
    	CompanyDB company = new CompanyDB();
        
  	
    	ArrayList<ServerInfo> server = company.getServerInfo();
        return server;
    }

    
} 