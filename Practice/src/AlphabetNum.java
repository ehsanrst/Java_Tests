public class AlphabetNum {

	private int eNum;

	// private String aNum;

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public String alphabet(int num) {
		String aNum = "";
		switch (num) {

		case 11:
			aNum = "yazdah";
			break;
		case 12:
			aNum = "davazdah";
			break;
		case 13:
			aNum = "sizdah";
			break;
		case 14:
			aNum = "chahardah";
			break;
		case 15:
			aNum = "panzdah";
			break;
		case 16:
			aNum = "shanzdah";
			break;
		case 17:
			aNum = "hefdah";
			break;
		case 18:
			aNum = "hejdah";
			break;
		case 19:
			aNum = "noozdah";
			break;
		}
		return aNum;
	}

	public String alphabet(int num, int place) {
		String aNum = "";
		if (place == 1) {
			switch (num) {
			case 1:
				aNum = "yek";
				break;
			case 2:
				aNum = "do";
				break;
			case 3:
				aNum = "se";
				break;
			case 4:
				aNum = "chahar";
				break;
			case 5:
				aNum = "panj";
				break;
			case 6:
				aNum = "shesh";
				break;
			case 7:
				aNum = "haft";
				break;
			case 8:
				aNum = "hasht";
				break;
			case 9:
				aNum = "noh";
				break;
			}
		} else if (place == 2) {
			switch (num) {
			case 1:
				aNum = "dah";
				break;
			case 2:
				aNum = "bist";
				break;
			case 3:
				aNum = "si";
				break;
			case 4:
				aNum = "chehel";
				break;
			case 5:
				aNum = "panjah";
				break;
			case 6:
				aNum = "shast";
				break;
			case 7:
				aNum = "Haftad";
				break;
			case 8:
				aNum = "hashtad";
				break;
			case 9:
				aNum = "navad";
				break;
			}
		} else if (place == 3) {
			switch (num) {
			case 1:
				aNum = "sad";
				break;
			case 2:
				aNum = "devist";
				break;
			case 3:
				aNum = "sisad";
				break;
			case 4:
				aNum = "chaharsad";
				break;
			case 5:
				aNum = "pansad";
				break;
			case 6:
				aNum = "sheshsad";
				break;
			case 7:
				aNum = "hadtsad";
				break;
			case 8:
				aNum = "hashtsad";
				break;
			case 9:
				aNum = "nohsad";
				break;
			}
		}

		return aNum;
	}

	public String alphabet() {
		String aNum = "";
		switch (eNum) {
		case 1:
			aNum = "yek";
			break;
		case 2:
			aNum = "do";
			break;
		case 3:
			aNum = "se";
			break;
		case 4:
			aNum = "chahar";
			break;
		case 5:
			aNum = "panj";
			break;
		case 6:
			aNum = "shesh";
			break;
		case 7:
			aNum = "haft";
			break;
		case 8:
			aNum = "hasht";
			break;
		case 9:
			aNum = "noh";
			break;
		case 10:
			aNum = "dah";
			break;
		case 11:
			aNum = "yazdah";
			break;
		case 12:
			aNum = "davazdah";
			break;
		case 13:
			aNum = "sizdah";
			break;
		case 14:
			aNum = "chahardah";
			break;
		case 15:
			aNum = "panzdah";
			break;
		case 16:
			aNum = "shanzdah";
			break;
		case 17:
			aNum = "hefdah";
			break;
		case 18:
			aNum = "hejdah";
			break;
		case 19:
			aNum = "noozdah";
			break;
		case 20:
			aNum = "bist";
			break;
		case 30:
			aNum = "si";
			break;
		case 40:
			aNum = "chehel";
			break;
		case 50:
			aNum = "panjah";
			break;
		case 60:
			aNum = "shast";
			break;
		case 70:
			aNum = "Haftad";
			break;
		case 80:
			aNum = "hashtad";
			break;
		case 90:
			aNum = "navad";
			break;
		case 100:
			aNum = "sad";
			break;
		case 200:
			aNum = "devist";
			break;
		case 300:
			aNum = "sisad";
			break;
		case 400:
			aNum = "chaharsad";
			break;
		case 500:
			aNum = "pansad";
			break;
		case 600:
			aNum = "sheshsad";
			break;
		case 700:
			aNum = "hadtsad";
			break;
		case 800:
			aNum = "hashtsad";
			break;
		case 900:
			aNum = "nohsad";
			break;
		case 1000:
			aNum = "hezar";
			break;
		case 1000000:
			aNum = "milion";
			break;
		default:
			aNum = "Unknown";

		}
		return aNum;
	}
}
