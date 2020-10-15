package com.example.mychatapp.Fragment;

import com.example.mychatapp.Notification.MyResponse;
import com.example.mychatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService  {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAXR4pUNo:APA91bGWP-dlcTtFC9swdDuY-6KIwzM2XU697pOldYAVq_BWyCJxtwMaHxstEbuWqRrOp-J7To7XfBG3UwcKAPVsLt4GBl5XlBJ-lJtX7OTqUj9ZuGUV23rMsj0uxNR8td0L4T5t3a1P"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
