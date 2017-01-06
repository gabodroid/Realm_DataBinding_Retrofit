package com.example.gabriel.realm_databinding_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gabriel on 06/01/2017.
 */

public interface MyApiEndpointInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("posts")
    Call<List<Post>> getPosts();
}
