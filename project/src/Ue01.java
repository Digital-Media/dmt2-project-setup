import org.math.plot.PlotPanel;
import plotting.StickPlot;
import plotting.Plotting;

/**
 * MTD129 Digitale Medientechnik 2
 * Übung 1
 * @author Vorname Nachname
 */
public class Ue01 {

	public static void main(String[] args) {

		// Aufgabe 1.1
		{
			double[] A = makeSin(30);
			PlotPanel panel = Plotting.create("Aufgabe 1.1");
			panel.setAxisLabels("i", "g(i)");
			panel.addPlot(new StickPlot("Sinus n=30", A));
			Plotting.show(panel, -1, 1);
		}

		// Aufgabe 1.2
		{
			double[] A = makeSin(30);
			PlotPanel panel = Plotting.create("Aufgabe 1.2");
			panel.setAxisLabels("i", "g(i)");
			panel.addPlot(new StickPlot("Sinus n=30", A));
			Plotting.show(panel, -1, 1);
		}

	}

	static double[] makeSin(int n) {
		double[] A = new double[n];
		// TODO: fill A .......

		return A;
	}
	
	static double[] makeCos(int n) {
		double[] A = new double[n];
	

		return A;
	}
}
