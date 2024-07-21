import java.util.Scanner;

public class SUPPLY {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    void GetType(){
        switch (Sticker) {
            case "Green":
                FoodType = "Vegetable";
                break;

            case "Yellow":
                FoodType = "Contian Egg";
                break;
            
            case "Red":
                FoodType = "Non-Vegetable";
                break;

            default:
                break;
        }
    }

     public void FoodIn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Food Name: ");
        FoodName = sc.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = sc.nextLine();

        GetType();

        sc.close();
    }

    public void FoodOut() {
        System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
    }

    public static void main(String[] args) {
        SUPPLY obj = new SUPPLY();
        obj.FoodIn();
        obj.FoodOut();
    }
}
