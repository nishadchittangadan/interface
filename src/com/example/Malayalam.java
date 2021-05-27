package com.example;

class Main {

    public static void main(String[] args) {

       AudioCalls a=new AudioCalls();
       VideoCall v = new VideoCall();


       a.calls();
       a.mute();
       a.disconnect();
       v.calls();
       v.mute();
       v.disconnect();

        }



    }



