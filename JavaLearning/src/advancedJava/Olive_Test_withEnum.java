package advancedJava;

//Local Class

public class Olive_Test_withEnum {
	public static void main(String[] args) throws Exception {

		OliveJar_withEnum jar = new OliveJar_withEnum();

		jar.addOlive(OliveName_Enum.KALAMATA, 0x000000);
		jar.addOlive(OliveName_Enum.LIGORIO, 0x000000);
		jar.addOlive(OliveName_Enum.PARVARDEH, 0x000000);
		jar.reportOlives();
	}
}
