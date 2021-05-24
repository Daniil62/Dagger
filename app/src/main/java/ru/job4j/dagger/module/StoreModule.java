package ru.job4j.dagger.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.job4j.dagger.store.MemStore;
import ru.job4j.dagger.store.Store;

@Module
public class StoreModule {
    @Singleton
    @Provides
    public Store provideStore() {
        return new MemStore();
    }
}
