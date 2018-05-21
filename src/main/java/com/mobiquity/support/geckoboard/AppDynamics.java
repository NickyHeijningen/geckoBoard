package com.mobiquity.support.geckoboard;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.xml.sax.*;



public class AppDynamics {
	
	private String xml;
	private Company company;
        
        public AppDynamics (){}
	
	public AppDynamics (Company company) {
		this.company = company; 
	}
	
        // Take out the calls per minute out of appdynamics
        
	public String getCallsPerMinute() {
		String Calls_Per_Minute_Value = "0";
		
		xml = getUrl(company.getCompanyUrl() + company.getCompanyCallsPerMinute(), company.getCompanyLogin(), company.getCompanyPassword());
		
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();				
				DocumentBuilder builder = factory.newDocumentBuilder();				
				Document document = builder.parse(new InputSource(new StringReader(xml)));				
				XPathFactory xPathfactory = XPathFactory.newInstance();				
				XPath xpath = xPathfactory.newXPath();				
				XPathExpression expr_value = xpath.compile("/metric-datas/metric-data/metricValues/metric-value/value");
				Calls_Per_Minute_Value = expr_value.evaluate(document, XPathConstants.STRING).toString();
				
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return Calls_Per_Minute_Value;
		}
        // Take out the Average Response Time out of appdynamics
        
	public String getAverageResponseTime(){	
		String response_time_value = "0";

		xml = getUrl(company.getCompanyUrl() + company.getCompanyAverageResponseTime(), company.getCompanyLogin(), company.getCompanyPassword());
		
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document document = builder.parse(new InputSource(new StringReader(xml)));
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath1 = xPathfactory.newXPath();
				XPathExpression expr_value = xpath1.compile("/metric-datas/metric-data/metricValues/metric-value/value");
				response_time_value = expr_value.evaluate(document, XPathConstants.STRING).toString();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return response_time_value;
		}
        // Take out the Errors Per Minute out of appdynamics
	public String getErrorsPerMinute(){	
		String error_per_value = "0";
		
		xml = getUrl(company.getCompanyUrl() + company.getCompanyErrorsPerMinute(), company.getCompanyLogin(), company.getCompanyPassword());
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document document = builder.parse(new InputSource(new StringReader(xml)));
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression expr_value = xpath.compile("/metric-datas/metric-data/metricValues/metric-value/value");
				error_per_value = expr_value.evaluate(document, XPathConstants.STRING).toString();
			} catch (XPathExpressionException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return error_per_value;
		}

	public static String getUrl(String myURL, String login, String password) {
			URLConnection urlConn = null;
			InputStreamReader in = null;
			
			String loginPassword = login + ":" + password;
			String encoded = java.util.Base64.getEncoder().encodeToString( loginPassword.getBytes() );
			StringBuilder sb = new StringBuilder();
			
			try {
				URL url = new URL(myURL);
				urlConn = url.openConnection();
				urlConn.setRequestProperty("Authorization", "Basic " + encoded);
				if (urlConn != null)
					urlConn.setReadTimeout(60 * 1000);
				if (urlConn != null && urlConn.getInputStream() != null) {
					in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
					BufferedReader bufferedReader = new BufferedReader(in);
					if (bufferedReader != null) {
						int cp;
						while ((cp = bufferedReader.read()) != -1) {
							sb.append((char) cp);
						}
						bufferedReader.close();
					}
				}
				in.close();
			} catch (Exception e) {
				throw new RuntimeException("Exception while calling URL:" + myURL, e);
			}
			return sb.toString();
		}
	}
