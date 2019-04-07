package controller;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MobilePayAPI {
    private final OkHttpClient client = new OkHttpClient();

    private void createBinding() throws IOException {


        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("receiverAlias", "")
                .addFormDataPart("merchantId", "574dbbdd-1ed4-46cf-a804-eb405180d504")
                .addFormDataPart("merchantBinding", "080890-2056")
                .addFormDataPart("merchantServiceName", "FridayBar")
                .build();

        Request request = new Request.Builder().url("https://api.sandbox.mobilepay.dk/bindings-restapi/api/v1/bindings").
                post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                System.out.println(headers.name(i) + " :" + headers.value(i));
            }
            System.out.println(response.body().string());
        }
    }
}

