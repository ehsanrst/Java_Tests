package bus_station;

import javax.swing.JOptionPane;

public class Station {

	public static void main(String[] args) {
		int pcode;
		int bpcode;
		int dcode;
		int endWork;
		boolean loop = true;

		Bus_Line_Info config = new Bus_Line_Info();
		config.write(1, "Azadi", "Taleghani", 7500, 2215, 36);

		Day_Summary dsummary = new Day_Summary();
		dsummary.read();
		if (dsummary.isEsc()) {
			System.out.println("working day is already ended!!!");
		} else {
			while (loop) {
				int ans = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1.Passenger\t2.Driver"));

				if (ans == 1) {
					dsummary.getPass().ask();
					pcode = dsummary.getPass().getPassenger_Code();
					Buffer buff = new Buffer();
					bpcode = (int) buff.read();

					if (pcode == bpcode) {
						System.out
								.println("!!!you can't use your passcode consecutive!!!");
					} else {
						dsummary.write();
						buff.write(pcode);
					}
				} else if (ans == 2) {
					dcode = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Enter your Driver Code:"));
					if (dcode == config.getDriver_Code()) {
						endWork = Integer.parseInt(JOptionPane.showInputDialog(
								null, "End Day Work? (1.yes/2.no)"));
						if (endWork == 1) {
							dsummary.setEndDailyWorkTime(true);
							dsummary.read();
							dsummary.write();
							System.out.println("The work day is over !!!");
							break;
						} else {
							System.out.println("Working Day Continue...");
						}
					} else {
						System.out.println("Access Denied!!!");
					}
				} else {
					System.out.println("Enter Correct Number!!!");
				}
			}
		}
	}
}
