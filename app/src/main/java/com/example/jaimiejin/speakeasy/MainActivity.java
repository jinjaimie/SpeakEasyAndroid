package com.example.jaimiejin.speakeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        int[] ints = {1, 2, 3, 4, 5, 6};
        String[] strings = {"cat", "bat", "dog", "hog", "bow","boat"};
        for (int i = 0; i < strings.length; i++){
            Text text = gson.fromJson("{\"text\": \""+ strings[i] + "\", \"id\": \"" + ints[i] + "\"}", Text.class);
            System.out.println(gson.toJson(text));
        }
        Scanner console = new Scanner(System.in);



    }

}


