package com.bhaskar.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;


@Component
public class ReportUtilImpl implements ReportUtil {

	@Override
	public void createPieChart(String path, List<Object[]> data) {
		
		DefaultPieDataset dataset = new DefaultPieDataset( );
		for(Object[] objects: data) {
			
		
	      dataset.setValue(objects[0].toString(), new Double( objects[1].toString() ) );  
	      
		}
		JFreeChart freeChart= ChartFactory.createPieChart3D("location free chart", dataset, true, true, false);

	try {
		ChartUtilities.saveChartAsJPEG(new File(path+"/pieChart.jpeg"), freeChart, 30, 30);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
	   

}