package com.example.gabriel.realm_databinding_retrofit;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gabriel on 06/01/2017.
 */

public class MyApplication extends Application {

    public static final String BASE_URL = "https://demo3100027.mockable.io/";

    private Retrofit retrofit;
    private MyApiEndpointInterface apiService;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(MyApiEndpointInterface.class);
    }

    public MyApiEndpointInterface getApiService() {
        return apiService;
    }
}
