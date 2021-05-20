package ru.job4j.dagger.application;

import android.app.Application;
import ru.job4j.dagger.component.DaggerStoreComponent;
import ru.job4j.dagger.component.StoreComponent;

public class App extends Application {
    private static StoreComponent stores;
    @Override
    public void onCreate() {
        super.onCreate();
        stores = DaggerStoreComponent.create();
    }
    public static StoreComponent getStore() {
        return stores;
    }
}
