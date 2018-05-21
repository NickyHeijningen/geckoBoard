package com.mobiquity.support.geckoboard.Quartz;

import com.mobiquity.support.geckoboard.AppDynamics;
import com.mobiquity.support.geckoboard.Company;
import com.mobiquity.support.geckoboard.CompanyDB;
import java.sql.SQLException;
import java.util.ArrayList;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class AppdynamicsInserter implements Job
{
      
            @Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

                try {
                    CompanyDB comp = new CompanyDB();
                    AppDynamics appdynamics;

                    ArrayList<Company> companies = comp.getCompanies();

                     for (Company company : companies) {

                            appdynamics = new AppDynamics(company);
                            int companyID = company.getCompanyId();

                            //String gemiddelde = comp.getAveragesValueWeek(companyID);

                            comp.addInformation(companyID, appdynamics.getCallsPerMinute(), appdynamics.getAverageResponseTime(), appdynamics.getErrorsPerMinute(), comp.getHealthStatus(company.getCompanyNaam()));
                        }
                } catch (SQLException ex) {
                     System.out.println(ex.getMessage());
                  }
	}
	
}
