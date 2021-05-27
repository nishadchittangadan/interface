package com.example;

public interface  man {

    void calls();
    void mute();
    void disconnect();

}
class AudioCalls implements man{
    public void calls(){
        System.out.println("whatsapp audio calls ...");

    }
    public void mute(){
        System.out.println("whatsapp audio mute..");
    }
    public void disconnect(){
        System.out.println("whatsapp audio disconnect");
    }
}
class VideoCall implements man{
    public void calls(){
        System.out.println("whatsapp video calls ...");

    }
    public void mute(){
        System.out.println("whatsapp video mute..");
    }
    public void disconnect(){
        System.out.println("whatsapp video disconnect");
    }
}

}


