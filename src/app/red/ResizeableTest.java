package app.red;
class ColorableTest {
	public static void main(String[] args) {
		Colorable colorable = new Colorable(){
			@Override
			public void howToColor() {
				System.out.println("Test Colorable:");
			}
		};

		colorable.howToColor();
	}
}
