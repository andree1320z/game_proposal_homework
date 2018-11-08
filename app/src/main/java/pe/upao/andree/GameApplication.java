package pe.upao.andree;

import android.app.Application;

import pe.upao.andree.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
