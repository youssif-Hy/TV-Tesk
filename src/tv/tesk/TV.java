package tv.tesk;

import java.util.Scanner;

public class TV {

    int channel;
    int volumelevel;
    boolean power;
    TV() {
        channel = 1;
        volumelevel = 1;
        power = false;
    }
    void display() {
    System.out.println(UI.Cyan+"+----------------------+");
    System.out.println(UI.Cyan+"|     TV INFORMATION   |");
    System.out.println(UI.Cyan+"+----------------------+");
    System.out.printf("| %-12s : %-5d ", "Channel"+UI.Reset, channel);
    System.out.println(UI.Cyan+"    |");
    System.out.printf("| %-12s : %-5d ", "Volume"+UI.Reset, volumelevel);
    System.out.println(UI.Cyan+"    |");
    System.out.printf(UI.Cyan+"| %-12s : %-5s ", "Power"+UI.Reset, (power ? "ON" : "OFF"));
    System.out.println(UI.Cyan+"    |");
    System.out.println(UI.Cyan+"+----------------------+"+UI.Reset);
}
    void Turnon() {
        if (!power) {
            power = true;
        }
        else {
            System.out.println("The TV is already on.");
        }
    }
    void Turnoff() {
        if (power) {
            power = false;
        }
        else {
            System.out.println("The TV is already off.");
        }
    }
    void SetChannel(int newChannel){
              channel = newChannel;
    }
    void SetVolume(int newVolumeLevel){
            volumelevel =newVolumeLevel;
    }
    void ChannelUp(){
        if(channel<120)
            channel++;
        else
            System.out.println("The channel is at its highest level you can't raise it.");
    }
    void ChannelDown(){
        if(channel>1)
            channel--;
        else
            System.out.println("The channel is at its lowest level you can't lower it.");
        
    }
    void volumeUp(){
        if(volumelevel<7)
            channel++;
        else
            System.out.println("The volume is at its highest level you can't raise.");
    }
    void volumeDown(){
        if(volumelevel>1)
            channel--;
        else
            System.out.println("The volume is at its Lowest level you can't lower it.");
    }

}
