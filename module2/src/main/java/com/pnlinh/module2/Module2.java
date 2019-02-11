package com.pnlinh.module2;

import com.pnlinh.module1.Main;
import retrofit2.Retrofit;

public class Module2 {
    public static void main(String[] args) {
        Main main = new Main();
        Retrofit retrofit = new Retrofit.Builder().build();
    }
}
