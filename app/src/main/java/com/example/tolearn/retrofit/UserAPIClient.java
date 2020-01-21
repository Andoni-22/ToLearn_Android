package com.example.tolearn.retrofit;
import com.example.tolearn.interfaces.UserInterface;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

import static retrofit2.converter.simplexml.SimpleXmlConverterFactory.create;

public class UserAPIClient {
    private static String API_BASE_URL = "http://192.168.21.32:50148/grupo5_reto2/webresources/user/";
    public static UserInterface getClient(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(
                        create()
                );
        Retrofit retrofit = builder.client(httpClient.build()).build();

        UserInterface userInterface = retrofit.create(UserInterface.class);
        return userInterface;
    }

}
