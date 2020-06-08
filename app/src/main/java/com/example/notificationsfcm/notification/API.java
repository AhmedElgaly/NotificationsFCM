package com.example.notificationsfcm.notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAP6A7J_c:APA91bFeU14v88CpWbT_ao7Hrp-JXrRG0gyMvfe4Vk7c_TeEQ_opVjaq67o-mg0gbGy6HUqW_Bppf4YThQ-K7JNqwKGJyZnF9TwRvhRzeSaqR-4-zts9wXHFQRVUQCSiEKppjkt9PZz8"
    })
    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
