package com.example.matas.easyaccessemail.network;

import java.util.List;
import com.example.matas.easyaccessemail.Model.Message;
//import info.androidhive.gmail.model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ravi Tamada on 21/02/17.
 * www.androidhive.info
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
