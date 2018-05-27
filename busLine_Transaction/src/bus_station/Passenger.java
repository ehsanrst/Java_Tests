package bus_station;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

//to Calculate Fare_Coefficient of Different Passengers
public class Passenger {
	private int passenger_Code;
	private double fare_coefficient;
	private Date date;

	// constructor
	public Passenger() {
	}

	// method
	protected void ask() {
		this.passenger_Code = Integer.parseInt(JOptionPane.showInputDialog(
				null, "Enter your P-Code: "));
		System.out.println("P-code: " + passenger_Code);
		coefficient(passenger_Code);
		date = new Date();
		System.out.println(new SimpleDateFormat("hhmma").format(date));
	}

	protected double coefficient(int pCode) {

		while (pCode >= 10) {
			pCode /= 10;
		}
		switch (pCode) {
		case 9:
			fare_coefficient = 1.0;
			break;
		case 8:
			fare_coefficient = 0.9;
			break;
		case 7:
			fare_coefficient = 0.3;
			break;
		case 6:
			fare_coefficient = 0.5;
			break;
		case 5:
			fare_coefficient = 1.9;
			break;
		default:
			fare_coefficient = 1.0;
			System.out.println("Unknown Code!!!");
			break;
		}
		System.out.println("P-coefficient: " + fare_coefficient);
		return fare_coefficient;
	}

	// setter and getter
	public int getPassenger_Code() {
		return passenger_Code;
	}

	public void setPassenger_Code(int passenger_Code) {
		this.passenger_Code = passenger_Code;
	}

	public double getFare_coefficient() {
		return fare_coefficient;
	}

	public Date getDate() {
		return date;
	}

}
