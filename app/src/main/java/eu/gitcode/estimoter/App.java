package eu.gitcode.estimoter;

import android.app.Application;
import android.content.Context;

import com.karumi.dexter.Dexter;

import net.hockeyapp.android.CrashManager;

import eu.gitcode.estimoter.dagger.components.AppComponent;
import eu.gitcode.estimoter.dagger.components.DaggerAppComponent;
import eu.gitcode.estimoter.dagger.modules.AppModule;
import timber.log.Timber;

public class App extends Application {

    private static Context appContext;

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static Context getAppContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Dexter.initialize(this);
        appContext = this;
        setupDaggerGraph();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    private void setupDaggerGraph() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}