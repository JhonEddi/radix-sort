
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
public class Graficar
{

	public static void main(String[] args) {
		//Informacion
		XYSeries operaciones = new XYSeries("Operaciones");
		operaciones.add(500.0, 16505.0);
		operaciones.add(1000.0, 33005.0);
		operaciones.add(1500.0, 49505.0);
                operaciones.add(2000.0, 66005.0);
                operaciones.add(2500.0, 82505.0);
		operaciones.add(3000.0, 99005.0);
                operaciones.add(3500.0, 115505.0);
		operaciones.add(4000.0, 132005.0);
		operaciones.add(4500.0, 148505.0);
                operaciones.add(5000.0, 165005.0);
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