import java.io.IOException;

public class ATM {
	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("****************************************Welcome to the ATM Project!******************************************************");
		System.out.println("                                                                                          ");
		System.out.println("                                                   BY                                            ");
		System.out.println("                                                                                          ");
		System.out.println("*************************************************Srikanth******************************************************");

	}

}
