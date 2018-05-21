package com.mobiquity.support.geckoboard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobiquity.support.geckoboard.model.LineChart;
import com.mobiquity.support.geckoboard.model.Series;
import com.mobiquity.support.geckoboard.model.X_Axis;
import java.sql.*;
import java.util.*;
import java.util.Date;

	public class CompanyDB {
			
            private Connection conn = null;
            private Statement statement = null;
            private ResultSet rs = null;
            private PreparedStatement pst = null;
            
            
         // Function to call the linechart for Calls Per Minute
            
            public LineChart getaverageCallsPerMinuteAsLineChart(String naam) throws SQLException, JsonProcessingException {
            
            String query = "SELECT DATE(date), ROUND(AVG(averageCallsPerMinute))\n" +
                            "     \n" +
                            "FROM information, company\n" +
                            "\n" +
                            "where date between now() - INTERVAL 1 month and now() and company.companyID = information.companyID and company.companyName = '"+naam+"'\n" +
                            "\n" +
                            "GROUP BY DATE(date)";
             
            LineChart linechart = new LineChart();
            X_Axis x_axis = new X_Axis("datetime");
            linechart.setX_axis(x_axis);
            ArrayList<Series> seriesArray = new ArrayList<>();
            Series series = new Series();
            series.setName("Calls per minute");
 
            List<List<Object>> data = new ArrayList<>();

            try {
                conn = DBConnection.setDBConnection();
                statement = conn.createStatement();
                rs = statement.executeQuery(query); 
                
                while(rs.next()){
  
                    Date date = rs.getDate(1);
                    int calls = rs.getInt(2);
                    
//                    String newstring = new SimpleDateFormat("yyyy-MM").format(date);

                    List<Object> dataitem = new ArrayList<>();
                    dataitem.add( date );
                    dataitem.add( calls );
                    data.add( dataitem );
                }
            }catch(Exception e){
                    System.out.println(e);
            }finally{
                    rs.close();
                    conn.close();
            } 
            
            series.setData(data);
          
            seriesArray.add(series);
            linechart.setSeries(seriesArray);
            
            return linechart;
        }
             // Function to call the linechart for Errors Per Minute
            
            public LineChart getaverageErrorsPerMinuteAsLineChart(String naam) throws SQLException, JsonProcessingException {
            
            String query = "SELECT DATE(date), ROUND(AVG(averageErrorsPerMinute))\n" +
                            "     \n" +
                            "FROM information, company\n" +
                            "\n" +
                            "where date between now() - INTERVAL 1 month and now() and company.companyID = information.companyID and company.companyName = '"+naam+"'\n" +
                            "\n" +
                            "GROUP BY DATE(date)";
             
            LineChart linechart = new LineChart();
            X_Axis x_axis = new X_Axis("datetime");
            linechart.setX_axis(x_axis);
            ArrayList<Series> seriesArray = new ArrayList<>();
            Series series = new Series();
            series.setName("Errors Per Minute");
 
            List<List<Object>> data = new ArrayList<>();

            try {
                conn = DBConnection.setDBConnection();
                statement = conn.createStatement();
                rs = statement.executeQuery(query); 
                
                while(rs.next()){
  
                    Date date = rs.getDate(1);
                    int errors = rs.getInt(2);
                    
//                    String newstring = new SimpleDateFormat("yyyy-MM").format(date);

                    List<Object> dataitem = new ArrayList<>();
                    dataitem.add( date );
                    dataitem.add( errors );
                    data.add( dataitem );
                }
            }catch(Exception e){
                    System.out.println(e);
            }finally{
                    rs.close();
                    conn.close();
            } 
            
            series.setData(data);
          
            seriesArray.add(series);
            linechart.setSeries(seriesArray);
            
            return linechart;
        }
            // Function to call the linechart for Average Response Time
            
            public LineChart getaverageResponseTimeAsLineChart(String naam) throws SQLException, JsonProcessingException {
            
            String query = "SELECT DATE(date), ROUND(AVG(averageResponseTime))\n" +
                            "     \n" +
                            "FROM information, company\n" +
                            "\n" +
                            "where date between now() - INTERVAL 1 month and now() and company.companyID = information.companyID and company.companyName = '"+naam+"'\n" +
                            "\n" +
                            "GROUP BY DATE(date)";
             
            LineChart linechart = new LineChart();
            X_Axis x_axis = new X_Axis("datetime");
            linechart.setX_axis(x_axis);
            ArrayList<Series> seriesArray = new ArrayList<>();
            Series series = new Series();
            series.setName("Response Time");
 
            List<List<Object>> data = new ArrayList<>();

            try {
                conn = DBConnection.setDBConnection();
                statement = conn.createStatement();
                rs = statement.executeQuery(query); 
                
                while(rs.next()){
  
                    Date date = rs.getDate(1);
                    int calls = rs.getInt(2);
                    
                    //String newstring = new SimpleDateFormat("yyyy-MM").format(date);

                    List<Object> dataitem = new ArrayList<>();
                    dataitem.add( date );
                    dataitem.add( calls );
                    data.add( dataitem );
                }
            }catch(Exception e){
                    System.out.println(e);
            }finally{
                    rs.close();
                    conn.close();
            } 
            
            series.setData(data);
          
            seriesArray.add(series);
            linechart.setSeries(seriesArray);
            
            return linechart;
        }
            // Function to call the linechart for HealthStatus
            
            public LineChart getaverageHealthStatusLineChart(String naam) throws SQLException, JsonProcessingException {
            
            String query = "SELECT DATE(date), Round(AVG(healthStatus))\n" +
                            "     \n" +
                            "FROM information, company\n" +
                            "\n" +
                            "where date between now() - INTERVAL 1 month and now() and company.companyID = information.companyID and company.companyName = '"+naam+"'\n" +
                            "\n" +
                            "GROUP BY DATE(date)";
             
            LineChart linechart = new LineChart();
            X_Axis x_axis = new X_Axis("datetime");
            linechart.setX_axis(x_axis);
            ArrayList<Series> seriesArray = new ArrayList<>();
            Series series = new Series();
            series.setName("HealthStatus");
 
            List<List<Object>> data = new ArrayList<>();

            try {
                conn = DBConnection.setDBConnection();
                statement = conn.createStatement();
                rs = statement.executeQuery(query); 
                
                while(rs.next()){
  
                    Date date = rs.getDate(1);
                    int calls = rs.getInt(2);
                    
                    //String newstring = new SimpleDateFormat("yyyy-MM").format(date);

                    List<Object> dataitem = new ArrayList<>();
                    dataitem.add( date );
                    dataitem.add( calls );
                    data.add( dataitem );
                }
            }catch(Exception e){
                    System.out.println(e);
            }finally{
                    rs.close();
                    conn.close();
            } 
            
            series.setData(data);
          
            seriesArray.add(series);
            linechart.setSeries(seriesArray);
            
            return linechart;
        }
            
            
	// Function to get all records out of database and return it as a object
            
        public Company getCompany(String naam) throws SQLException{
       
                String query = "select * from company, appdynamics where company.companyID = appdynamics.companyID and company.companyName = '"+naam+"'";

                Company company = new Company();

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query); 

                        while(rs.next()){
                                company.setCompanyId(rs.getInt(1));
                                company.setCompanyNaam(rs.getString(2));
                                company.setCompanyAdress(rs.getString(3));
                                company.setCompanyLocation(rs.getString(4));
                                company.setCompanyPhoneNumber(rs.getString(5));
                                company.setCompanyEmail(rs.getString(6));
                                company.setCompanyLogin(rs.getString(8));
                                company.setCompanyPassword(rs.getString(9));
                                company.setMaxCallsPerMinute(rs.getString(10));
                                company.setMaxAverageResponseTime(rs.getString(11));
                                company.setCompanyUrl(rs.getString(12));
                                company.setCompanyAverageResponseTime(rs.getString(13));
                                company.setCompanyCallsPerMinute(rs.getString(14));
                                company.setCompanyErrorsPerMinute(rs.getString(15));
                                company.setMaxErrorsPerMinute(rs.getString(16));
                        }
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }
                return company;
        }
        // Function to get all records from all company`s in database
        
        public ArrayList<Company> getCompanies() throws SQLException{

                String query = "select * from company, appdynamics where company.companyID = appdynamics.companyID";

                ArrayList<Company> companies = new ArrayList<>();

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);

                        while(rs.next()){
                                Company company = new Company();
                                company.setCompanyId(rs.getInt(1));
                                company.setCompanyNaam(rs.getString(2));
                                company.setCompanyAdress(rs.getString(3));
                                company.setCompanyLocation(rs.getString(4));
                                company.setCompanyPhoneNumber(rs.getString(5));
                                company.setCompanyEmail(rs.getString(6));
                                company.setCompanyLogin(rs.getString(8));
                                company.setCompanyPassword(rs.getString(9));
                                company.setMaxCallsPerMinute(rs.getString(10));
                                company.setMaxAverageResponseTime(rs.getString(11));
                                company.setCompanyUrl(rs.getString(12));
                                company.setCompanyAverageResponseTime(rs.getString(13));
                                company.setCompanyCallsPerMinute(rs.getString(14));
                                company.setCompanyErrorsPerMinute(rs.getString(15));
                                company.setMaxErrorsPerMinute(rs.getString(16));
                                companies.add(company);
                        }
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }
                return companies;

        }
        
        // Function to get all information out of the database and return it as a object
        
        public ArrayList<Company> getInformation() throws SQLException{

                String query = "String query = \"select company.companyID, companyName, date, averageResponseTime, averageCallsPerMinute, averageErrorsPerMinute, ROUND((averageErrorsPerMinute / averageCallsPerMinute) * 100,2)  as num1 from information inner join company on company.companyID = information.companyID order by date asc";
                
                ArrayList<Company> companies = new ArrayList<>();

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query); 

                        while(rs.next()){
                               Company company = new Company();
                                 company.setCompanyID(rs.getString(1));
                                 company.setCompanyNaam(rs.getString(2));
                                 company.setDate(rs.getTimestamp(3));
                                 company.setCompanyCallsPerMinute(rs.getString(5));
                                 company.setCompanyAverageResponseTime(rs.getString(4));
                                 company.setCompanyErrorsPerMinute(rs.getString(6));
                                 company.setHealthStatus(rs.getString(7));
                        }
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }
                return companies;

        }
        
        // Function to get the serverInfo out of the database and return it
        
        public ArrayList<ServerInfo> getServerInfo() throws SQLException{

                String query = "select * from Server";
                
                ArrayList<ServerInfo> serverInfoList = new ArrayList<>();

                

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query); 

                        while(rs.next()){
                                ServerInfo serverInfo = new ServerInfo();
                                serverInfo.setServerIp(rs.getString(2));
                                serverInfo.setApplicationName(rs.getString(3));
                                serverInfo.setClassName(rs.getString(4));
                                serverInfo.setFunctionCallsPerMinute(rs.getString(5));
                                serverInfo.setFunctionAverageResponseTime(rs.getString(6)); 
                                serverInfo.setFunctionHealthStatus(rs.getString(7));
                                serverInfo.setCallsPerMinuteAsLineChart(rs.getString(8));
                                serverInfo.setResponseTimeAsLineChart(rs.getString(9));
                                serverInfo.setErrorsPerMinuteAsLineChart(rs.getString(10));
                                serverInfo.setHealthStatusAsLineChart(rs.getString(11));
                                
                                serverInfoList.add(serverInfo);
                        }
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }
                return serverInfoList;

        }
        
        // Function to add the information in database
        
        public void addInformation(int companyID, String averageCallsPerMinute, String averageResponseTime, String errorPerMinute, String healthStatus) throws SQLException {
            try {
                    conn = DBConnection.setDBConnection();

                    String query = "insert into information(companyID,date,averageCallsPerMinute,averageResponseTime,averageErrorsPerMinute, healthStatus) values('"+companyID+"',NOW(),'"+averageCallsPerMinute+"','"+averageResponseTime+"','"+errorPerMinute+"','"+healthStatus+"')";
                    
                    pst = conn.prepareStatement(query);
                    pst.execute();
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }

        }
        
        // This function gets the HealthStatus
        
        public String getHealthStatus(String companyName) throws SQLException{
            String strI = null;
            int number = 0;
            try {           
                    CompanyDB comp = new CompanyDB();

                    Company company2 = comp.getCompany(companyName);
                    AppDynamics appdynamics = new AppDynamics(company2);

                    float calls = Float.parseFloat(appdynamics.getCallsPerMinute());
                    float errors = Float.parseFloat(appdynamics.getErrorsPerMinute());
                    

                    float total1 = (errors / calls) * 100;
                    float total2 = 100 - total1 * 10;
                    
                    number = Math.round(total2);
                    strI = Integer.toString(number);
                    

                    if("0".equals(strI)){
                        strI = "100";
                    }else{
                        strI = Integer.toString(number);
                    }
                
            } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                }

           return strI;

        }
        
        // Function to add all values in the database 
        
        public void insertValuesDatabase(Company company) throws SQLException{
                int lastInsertedId = 0;
            try {    
                conn = DBConnection.setDBConnection();
                               
                String query = "insert into appdynamics(loginName,loginPassword,maxCalls,maxResponse,companyUrl,averageResponseTime,callsPerMinute, ErrorsPerMinute, maxErrors) values(?,?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(query, pst.RETURN_GENERATED_KEYS); 
                pst.setString(1, company.getCompanyLogin());
                pst.setString(2, company.getCompanyPassword());
                pst.setString(3, company.getMaxCallsPerMinute());
                pst.setString(4, company.getMaxAverageResponseTime());
                pst.setString(5, company.getCompanyUrl());
                pst.setString(6, company.getCompanyAverageResponseTime());
                pst.setString(7, company.getCompanyCallsPerMinute());
                pst.setString(8, company.getCompanyErrorsPerMinute());
                pst.setString(9, company.getMaxErrorsPerMinute());
                
                pst.executeUpdate();
                
                rs = pst.getGeneratedKeys();
                if (rs.next()){
                   lastInsertedId = rs.getInt(1);
                }
                
                String query2 = "insert into company(companyID, companyName, adress, location, phoneNumber, email) values(?,?,?,?,?,?)";
                pst = conn.prepareStatement(query2); 
                pst.setInt(1, lastInsertedId);
                pst.setString(2, company.getCompanyNaam());
                pst.setString(3, company.getCompanyAdress());
                pst.setString(4, company.getCompanyLocation());
                pst.setString(5, company.getCompanyPhoneNumber());
                pst.setString(6, company.getCompanyEmail());
               
                pst.executeUpdate();
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        conn.close();
                }
                   
            
        }
        
        // Function who deletes the values out of database
        
         public void deleteValuesDatabase(Company company) throws SQLException{
            try {    
                conn = DBConnection.setDBConnection();

                String query2 = "delete from company where companyID = '"+company.getCompanyID()+"'";

                pst = conn.prepareStatement(query2); 
                pst.execute();
                
                String query3 = "delete from appdynamics where companyID = '"+company.getCompanyID()+"'";
                
                pst = conn.prepareStatement(query3);
                pst.execute();
            
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        conn.close();
                }
                   
            
        }
         
         // Function to updatabase values in database
  
         public void updateValuesDatabase(Company company) throws SQLException{

            try {    
                conn = DBConnection.setDBConnection();
                
                String query = "update company SET companyID = '"+company.getCompanyID()+"',companyName = '"+company.getCompanyNaam()+"',"
                        + " adress = '"+company.getCompanyAdress()+"',"
                        + " location = '"+company.getCompanyLocation()+"',"
                        + " phoneNumber = '"+company.getCompanyPhoneNumber()+"',"
                        + " email = '"+company.getCompanyEmail()+"'  where companyID = '"+company.getCompanyID()+"'";

                pst = conn.prepareStatement(query); 
                pst.executeUpdate();
                
                 String query2 = "update appdynamics SET companyID = '"+company.getCompanyID()+"',loginName = '"+company.getCompanyLogin()+"', loginPassword = '"+company.getCompanyPassword()+"',"
                        + " maxCalls = '"+company.getMaxCallsPerMinute()+"',"
                        + " maxResponse = '"+company.getMaxAverageResponseTime()+"',"
                        + " companyUrl = '"+company.getCompanyUrl()+"',"
                        + " averageResponseTime = '"+company.getCompanyAverageResponseTime()+"',"
                        + " callsPerMinute = '"+company.getCompanyCallsPerMinute()+"',"
                        + " errorsPerMinute = '"+company.getCompanyErrorsPerMinute()+"',"
                        + " maxErrors = '"+company.getMaxErrorsPerMinute()+"' where companyID = '"+company.getCompanyID()+"'";

                pst = conn.prepareStatement(query2); 
                pst.executeUpdate();
                
                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        conn.close();
                }
                   
            
        }
     
         // Function that gets the average of 1 month from Calls Per Minute
          
         public String getAveragesMonthCallsPerMinute(String companyName) throws SQLException{
                String companyID = null;              
                String strI = null;
                int average = 0; 
                
                String query = "select companyID from company where companyName = '"+companyName+"'";

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);

                    while(rs.next()){
                       companyID = rs.getString(1);			
                    }

                String query2 = "SELECT AVG(averageCallsPerMinute) AS Gemiddelde FROM information where companyID = '"+companyID+"' and date BETWEEN now() - INTERVAL 31 DAY and now()";

                    rs = statement.executeQuery(query2);

                    while(rs.next()){
                        average = rs.getInt(1);
                    }
                    
                    strI = Integer.toString(average);

                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }

                return strI;

        }  
         
         // Function that gets the average of 1 month from Response Time
         
         public String getAveragesMonthResponseTime(String companyName) throws SQLException{
                String companyID = null;              
                String strI = null;
                int average = 0; 
                
                String query = "select companyID from company where companyName = '"+companyName+"'";

                try {
                    conn = DBConnection.setDBConnection();
                    statement = conn.createStatement();
                    rs = statement.executeQuery(query);

                    while(rs.next()){
                       companyID = rs.getString(1);			
                    }

                String query2 = "SELECT AVG(averageResponseTime) AS Gemiddelde FROM information where companyID = '"+companyID+"' and date BETWEEN now() - INTERVAL 31 DAY and now()";

                    rs = statement.executeQuery(query2);

                    while(rs.next()){
                        average = rs.getInt(1);
                    }
                    
                    strI = Integer.toString(average);

                }catch(Exception e){
                        System.out.println(e);
                }finally{
                        rs.close();
                        conn.close();
                }

                return strI;

        }      
}
	
