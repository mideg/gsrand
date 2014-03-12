package gsrand;


public class gsrand {

	private static AppWindow window;

	public static void main(String[] args) {
		// Window laden
		window = new AppWindow();
		window.setBounds(10, 10, 420, 180);
		window.setVisible(true);
	}

	protected static void calcSet() {
		int[] set = {0,0,0,0,0};
		int max = 0;
		
		try {
			max = Integer.parseInt(window.textfield_max.getText());
		} catch (NumberFormatException e) {
			max = -1;
		}

		if (max < 0)
		{
			window.textfield_max.setText("!!!");
		} else {
			for(int i = 0; i < max; i++) {
				set[myRandom(0,5)]++;
			}
			window.textfield_set1.setText(String.valueOf(set[0]));
			window.textfield_set2.setText(String.valueOf(set[1]));
			window.textfield_set3.setText(String.valueOf(set[2]));
			window.textfield_set4.setText(String.valueOf(set[3]));
			window.textfield_set5.setText(String.valueOf(set[4]));
		}


	}


	public static int myRandom(int low, int high) {
		return (int) (Math.random() * (high - low) + low);
	}

}
