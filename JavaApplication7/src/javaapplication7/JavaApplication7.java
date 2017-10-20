/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Estudiantes
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        XYSeries operaciones = new XYSeries("Operaciones");
	int c = 0;
        //for(int h = 1; h<=10;h++){
        lista o = new lista();
        int[] a = new int[1000];
        int z=0,i,j;
        c=c+4;
            for(j = 0; j < a.length; j++){
                int x= (int)(Math.random()*1000);
                a[j]=x;
                c=c+6;
                for(int k=1; k<=3;k++){
                    int xp= (int)(Math.pow(10,k-1));
                    z=(x/xp)%10;
                    c=c+8;
                }
                o.insertar(a[j], z);
                c=c+10;
            }
            o.agrupar(a);
            c=c+11;
        for(i = 0; i < a.length; i++ ){
            c=c+2;
            System.out.println(a[i]);
        }
        System.out.println(c);
                operaciones.add(500.0, 21015.0);
		operaciones.add(1000.0, 42015.0);
		operaciones.add(1500.0, 63015.0);
                operaciones.add(2000.0, 84015.0);
                operaciones.add(2500.0, 105015.0);
		operaciones.add(3000.0, 126015.0);
                operaciones.add(3500.0, 147015.0);
		operaciones.add(4000.0, 168015.0);
		operaciones.add(4500.0, 189015.0);
                operaciones.add(5000.0, 210015.0);
                //operaciones.add(a.length,c);}
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(operaciones);
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
				"", 
				"Numero Datos", 
				"Operaciones", 
				dataset,
				PlotOrientation.VERTICAL, true, true, false);
		XYPlot plot = xylineChart.getXYPlot();
		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		renderer.setSeriesPaint(0, Color.RED);
		renderer.setSeriesStroke(0, new BasicStroke(4.0f));
		plot.setRenderer(renderer);
		ChartPanel panel = new ChartPanel(xylineChart);
		// Creamos la ventana
		JFrame ventana = new JFrame("Grafica");
		ventana.setVisible(true);
		ventana.setSize(800, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(panel);	
    }

}
        

