package tv.tesk;

public class mune {

    public static int volumechangemune() {
        System.out.println("Volume Menu:");
        System.out.println("1. Set Volume Level");
        System.out.println("2. Volume Up");
        System.out.println("3. Volume Down");
        System.out.println("0. Back to Main Menu");
        System.out.print("Please select an option: ");
        int option = Validetion.ValidOption(new java.util.Scanner(System.in).nextLine(), 0, 3);
        return option;
    }

    public static int channelchangemune() {
        System.out.println("Channel Menu:");
        System.out.println("1. Set Channel");
        System.out.println("2. Channel Up");
        System.out.println("3. Channel Down");
        System.out.println("0. Back to Main Menu");
        System.out.print("Please select an option: ");
        int option = Validetion.ValidOption(new java.util.Scanner(System.in).nextLine(), 0, 3);
        return option;
    }

    public static int mainmune() {
        System.out.println("TV Menu:");
        System.out.println("1. Turn On TV");
        System.out.println("2. Turn Off TV");
        System.out.println("3. Change Channel");
        System.out.println("4. Change Volume");
        System.out.println("5. Display TV Status");
        System.out.println("0. Exit");
        System.out.print("Please select an option: ");
        int option = Validetion.ValidOption(new java.util.Scanner(System.in).nextLine(), 0, 5);
        return option;
    }
}
