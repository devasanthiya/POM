package org_pom;

public class Fbmain extends Fbbase {
	public static void main(String[] args) {
		launch();	
		passing("https://www.facebook.com/");
		Fbpojo fb = new Fbpojo();
		filling(fb.getTxtpass(),"8870598421");
		filling(fb.getTxtpass(),"9994715321");
		clicking(fb.getLogin());

	}

}
