package com.hariofspades.dagger2advanced.module;

import com.hariofspades.dagger2advanced.MainActivity;
import com.hariofspades.dagger2advanced.adapter.RandomUserAdapter;
import com.hariofspades.dagger2advanced.scope.MainActivityScope;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    private final MainActivity mMainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        mMainActivity = mainActivity;
    }

    @MainActivityScope
    @Provides
    public RandomUserAdapter provideRandomUserAdapter(Picasso picasso) {
        return new RandomUserAdapter(picasso);
    }
}
