package com.mobiquity.support.geckoboard.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeckoMeter {
	
	private String item;
	private GeckoMeterValue min;
	private GeckoMeterValue max;
	
	public GeckoMeter(){
		
	}

	public GeckoMeter(String item, GeckoMeterValue min, GeckoMeterValue max) {
		super();
		this.item = item;
		this.min = min;
		this.max = max;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public GeckoMeterValue getMin() {
		return min;
	}

	public void setMin(GeckoMeterValue min) {
		this.min = min;
	}

	public GeckoMeterValue getMax() {
		return max;
	}

	public void setMax(GeckoMeterValue max) {
		this.max = max;
	}

}
