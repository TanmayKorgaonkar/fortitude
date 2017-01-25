package com.fortitude.vo;

import java.util.List;
import java.util.Map;

public class ChartVo {
	String legend;
	List<Long> values;
	
	public String getLegend() {
		return legend;
	}
	public void setLegend(String legend) {
		this.legend = legend;
	}
	public List<Long> getValues() {
		return values;
	}
	public void setValues(List<Long> values) {
		this.values = values;
	}
	public ChartVo(String legend, List<Long> values) {
		super();
		this.legend = legend;
		this.values = values;
	}
	public ChartVo() {
		super();
	}
	
	
}
