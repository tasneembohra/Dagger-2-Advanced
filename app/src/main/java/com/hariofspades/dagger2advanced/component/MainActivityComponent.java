package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.MainActivity;
import com.hariofspades.dagger2advanced.RandomUserComponent;
import com.hariofspades.dagger2advanced.module.MainActivityModule;
import com.hariofspades.dagger2advanced.scope.MainActivityScope;

import dagger.Component;

@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {
    void injectMainActivity(MainActivity mainActivity);
}
