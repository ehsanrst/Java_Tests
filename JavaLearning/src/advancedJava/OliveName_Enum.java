package advancedJava;

//use Enum when we have many names or variables to remember
public enum OliveName_Enum {
	// variables must be all upper case
	// KALAMATA, LIGORIO, PICHOLINE, PARVARDEH, GOLDEN;

	/* Optional */
	// IF we want to type name as we want:
	KALAMATA("Kalamata"), LIGORIO("Ligorio"), PICHOLINE("Picholine"), PARVARDEH(
			"Parvardeh"), GOLDEN("Golden");

	// Nothing in Enum can't be Public
	private String nameAsString;

	// Constructor
	private OliveName_Enum(String nameAsString) {
		this.nameAsString = nameAsString;
	}

	// toString method
	@Override
	public String toString() {
		return this.nameAsString;
	}
	/* end */
}
