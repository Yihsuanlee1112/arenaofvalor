package com.github.arenaofvalor.data;import com.github.arenaofvalor.presentation.model.ArenaOfValorResponse;import retrofit2.Call;import retrofit2.http.GET;public interface ArenaOfValorAPI {    @GET("ArenaOfValor.json")    Call<ArenaOfValorResponse> getHeroResponse();}