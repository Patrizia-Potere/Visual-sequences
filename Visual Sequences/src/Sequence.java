public class Sequence {
	
	String text;     		//Display empty space
	String asterisk;		//Display asterisk
	String number;			//Display number
	String mirror;			//for last method to mirror the number
	
// First Method	
	public void One(int value) {
		for (int i=0; i<value; i++) {
			asterisk = "";
			for (int j=0; j<10; j++) {
				asterisk += "*";
			}
			System.out.println(asterisk);
		}
	}
	
// Second Method	
	public void Two(int value) {
		for (int i=0; i<value; i++) {
			asterisk = "";
			for (int j=0; j<i+1; j++) {
				asterisk += "*";
			}
			System.out.println(asterisk);
		}
	}
	
//	Third Method
	public void Three(int value) {
		for (int i=0; i<value; i++) {
			text = "";
			asterisk = "";
			for (int j=0; j<value-i-1; j++) {
				text +=" ";
			}
			for (int k=0; k<i+1; k++) {
				asterisk += "*";
			}	
			System.out.println(text+asterisk);
		}
	}
	
// Forth Method
	public void Four(int value) {
		for (int i=0; i<value; i++) {
			text = "";
			asterisk = "";
			for (int j=0; j<value-i-1; j++) {
				text += " ";
			}
			for (int k=0; k<(i*2)+1; k++) {
				asterisk += "*";
			}
			System.out.println(text+asterisk);
		}
	}
	
// Fifth Method
	public void Five(int value) {
		for (int i=0; i<value; i++) {
			text = "";
			asterisk = "";
			for (int j=0; j<value-i-1; j++) {
				text += " ";
			}
			for (int k=0; k<(i*2)+1; k++) {
				asterisk += ""+(i+1);
			}
			System.out.println(text+asterisk);
		}
	}
	
// Sixth Method
	public void Six(int value) {
		for (int i=0; i<value; i++) {
			text = "";
			asterisk = "";
			mirror = "";
			for (int j=0; j<value-i-1; j++) {
				text += " ";
			}
			for (int k=0; k<i+1; k++) {
				asterisk += ""+(i+1-k);
			}
			for (int y=0; y<i; y++) {
				mirror += ""+(y+2);
			}
			System.out.println(text+asterisk+mirror);
		}
	}
	
}
