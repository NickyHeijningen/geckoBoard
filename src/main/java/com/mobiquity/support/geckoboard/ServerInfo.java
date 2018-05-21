package com.mobiquity.support.geckoboard;


public class ServerInfo {
    
    private String serverIp;
    private String applicationName;
    private String className;
    private String functionCallsPerMinute;
    private String functionAverageResponseTime;
    private String functionHealthStatus;
    private String CallsPerMinuteAsLineChart;
    private String ResponseTimeAsLineChart;
    private String ErrorsPerMinuteAsLineChart;
    private String HealthStatusAsLineChart;
    
   

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFunctionCallsPerMinute() {
        return functionCallsPerMinute;
    }

    public void setFunctionCallsPerMinute(String functionCallsPerMinute) {
        this.functionCallsPerMinute = functionCallsPerMinute;
    }

    public String getFunctionAverageResponseTime() {
        return functionAverageResponseTime;
    }

    public void setFunctionAverageResponseTime(String functionAverageResponseTime) {
        this.functionAverageResponseTime = functionAverageResponseTime;
    }

    public String getFunctionHealthStatus() {
        return functionHealthStatus;
    }

    public void setFunctionHealthStatus(String functionHealthStatus) {
        this.functionHealthStatus = functionHealthStatus;
    }

    public String getCallsPerMinuteAsLineChart() {
        return CallsPerMinuteAsLineChart;
    }

    public void setCallsPerMinuteAsLineChart(String CallsPerMinuteAsLineChart) {
        this.CallsPerMinuteAsLineChart = CallsPerMinuteAsLineChart;
    }

    public String getResponseTimeAsLineChart() {
        return ResponseTimeAsLineChart;
    }

    public void setResponseTimeAsLineChart(String ResponseTimeAsLineChart) {
        this.ResponseTimeAsLineChart = ResponseTimeAsLineChart;
    }

    public String getErrorsPerMinuteAsLineChart() {
        return ErrorsPerMinuteAsLineChart;
    }

    public void setErrorsPerMinuteAsLineChart(String ErrorsPerMinuteAsLineChart) {
        this.ErrorsPerMinuteAsLineChart = ErrorsPerMinuteAsLineChart;
    }

    public String getHealthStatusAsLineChart() {
        return HealthStatusAsLineChart;
    }

    public void setHealthStatusAsLineChart(String HealthStatusAsLineChart) {
        this.HealthStatusAsLineChart = HealthStatusAsLineChart;
    }
}
