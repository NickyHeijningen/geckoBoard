package com.mobiquity.support.geckoboard;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Produces(MediaType.APPLICATION_JSON)
@Path("/Settings")
public class SettingsResource {
    
    @GET 
    @Path("/")
    public ArrayList<Company> getCompanies() throws SQLException{
    	CompanyDB settings = new CompanyDB();
        
  	
    	ArrayList<Company> company = settings.getCompanies();

        return company;
    }
    
    @DELETE
    @Path("/company/{companyID}")
    public Company DeleteCompanie(@PathParam("companyID")Company company) throws SQLException{
        CompanyDB comp = new CompanyDB();
            
        comp.deleteValuesDatabase(company);
        
        return company;
    }
    
    @PUT
    @Path("/company/{companyID}")
    public Company UpdateCompanie(Company company, @PathParam("companyID") String companyID) throws SQLException{
        CompanyDB comp = new CompanyDB();          

        comp.updateValuesDatabase(company);
        
        return company;
    }

    @POST 
    @Path("/company")
    public Company AddCompanie(Company company) throws SQLException{
    	CompanyDB comp = new CompanyDB();

        comp.insertValuesDatabase(company);
        
        return company;
    }
    
    @GET 
    @Path("/company/{companyName}")
    public Company getCompany(@PathParam("companyName") String companyName) throws SQLException{
    	CompanyDB comp = new CompanyDB();
  	
    	Company company = comp.getCompany(companyName);

        return company;
    }
}
