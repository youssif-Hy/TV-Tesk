package tv.tesk;

import java.util.Scanner;

public class TVTesk {
    public static  TV myTV = new TV();

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(UI.Green+ "Welcome to TV Tesk!" + UI.Reset);
        while(true){
           int option = mune.mainmune();
           switchMainMenu(option);
        }
    }
    public static void switchMainMenu(int option){
        switch (option) {
                case 1:
                    myTV.Turnon();
                    break;
                case 2:
                if(myTV.power)
                    myTV.Turnoff();
                else
                    System.out.println(UI.Red+"Please turn on the TV first to turn it off."+UI.Reset);
                    break;
                case 3:
                    if(myTV.power)
                        switchChannel();
                    else
                        System.out.println(UI.Red+"Please turn on the TV first to change the channel."+UI.Reset);
                    break;
                case 4:
                    if(myTV.power)
                        switchvolume();
                    else
                        System.out.println(UI.Red+"Please turn on the TV first to change the volume."+UI.Reset);
                    break;
                case 5:
                if(myTV.power)
                    myTV.display();
                else
                    System.out.println(UI.Red+"Please turn on the TV first to display the TV status."+UI.Reset);
                    break;
                    case 0:
                    default:
                    System.out.println(UI.Green+"Thank you for using TV Tesk. Goodbye!"+UI.Reset);
                    System.exit(0);
                    break;
            }
    }
    public static void switchvolume() {

       int volumeOption = mune.volumechangemune();
                switch (volumeOption) {
                    case 1:
                        System.out.print("Enter the volume level (1-7): ");
                        int newVolume = Validetion.ValidOption(new Scanner(System.in).nextLine(), 1, 7);
                        myTV.SetVolume(newVolume);
                        break;
                    case 2:
                        myTV.volumeUp();
                        break;
                    case 3:
                        myTV.volumeDown();
                        break;
                    case 0:
                    switchMainMenu(mune.mainmune());
                        break;
                }
    }
    public static void switchChannel() {
        int channelOption = mune.channelchangemune();
                switch (channelOption) {
                    case 1:
                        System.out.print("Enter the channel number (1-120): ");
                        int newChannel = Validetion.ValidOption(new Scanner(System.in).nextLine(), 1, 120);
                        myTV.SetChannel(newChannel);
                        break;
                    case 2:
                        myTV.ChannelUp();
                        break;
                    case 3:
                        myTV.ChannelDown();
                        break;
                    case 0:
                    switchMainMenu(mune.mainmune());
                        break;
                }
    }
}
