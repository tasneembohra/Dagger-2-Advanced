package com.hariofspades.dagger2advanced;

import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.module.PicassoModule;
import com.hariofspades.dagger2advanced.module.RandomUserModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@Component(modules = {RandomUserModule.class, PicassoModule.class})
public interface RandomUserComponent {
    RandomUsersApi getRandomUsersApi();
    Picasso getPicasso();

}
