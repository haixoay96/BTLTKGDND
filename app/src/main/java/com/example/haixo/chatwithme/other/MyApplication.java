package com.example.haixo.chatwithme.other;

import android.app.Application;
import android.util.Log;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

/**
 * Created by haixo on 10/11/2016.
 */

public class MyApplication extends Application {
    public static String url = "http://192.168.0.107:3000";
    public static Socket socket;

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            socket = IO.socket("http://192.168.0.107:3000");
            socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {

                }
            });
            socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
                @Override
                public void call(Object... args) {

                }
            });
            socket.connect();
            Log.d("socket", "thanh cong");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
