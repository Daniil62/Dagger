package ru.job4j.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import ru.job4j.dagger.activity.MainActivity;
import ru.job4j.dagger.module.StoreModule;

@Singleton
@Component(modules = StoreModule.class)
public interface StoreComponent {
    void injectTo(MainActivity activity);
}
