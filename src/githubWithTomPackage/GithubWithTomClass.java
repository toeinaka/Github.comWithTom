package githubWithTomPackage;

public class GithubWithTomClass {

	public static void main(String[] args) {
		
		System.out.println("Toei's repository");
		
		System.out.println("Hello P'Toei!!!");
		
		// One of Interview question
				String str = "Testing OnE Two THree";

				char x = 'z'; // A-65 Z-90 a-97 z-122
				int z = x;

				String upperCase = "";
				int countUpperC = 0;

				String lowerCase = "";
				int countLowerCase = 0;

				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (c >= 65 && c <= 90) {
						upperCase += c;
						countUpperC++;
					}
					if (c >= 97 && c <= 122) {
						lowerCase += c;
						countLowerCase++;
					}
				}
				System.out.println("Upper case : " + upperCase + " and count : " + countUpperC);
				System.out.println("Lower case : " + lowerCase + " and count : " + countLowerCase);


	}

}
