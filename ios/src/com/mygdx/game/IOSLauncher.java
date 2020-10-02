package com.mygdx.game;

import java.lang.Thread.UncaughtExceptionHandler;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class IOSLauncher extends IOSApplication.Delegate {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        
//        Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
//			@Override
//			public void uncaughtException(Thread t, Throwable e) {
//				
//				Gdx.app.error("DEFAULT", "Default handler", e);
//				System.exit(-1);
//				
//			}
//		});
        
        return new IOSApplication(new MyGdxGame(), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }
}