import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in); 
            System.out.print("Write your message >> ");
            String message = inp.nextLine();
            System.out.print("Enter the key >> ");
            int shift = inp.nextInt();
            System.out.println("Converted message >> " + decrypt(message, shift));
            System.out.println(decoder(decrypt(message, shift), shift));
        

        // 32 değişmicek, 89 to 65 90 to 66, 121 to 97 122 to 98;
    }
    public static String decoder(String message, int shift) {
        if(shift>26){
            shift = shift%26;
        } if(shift>13)
        shift= shift-26;
        char[] array = message.toCharArray();
        for(int i=0; i<array.length; i++) {
            int change = array[i]-shift;
            if((int)array[i]==32){
                change=32;
            }else if(Character.isLowerCase(array[i])) {
                if(change>'z'){
                    change=change - 26;
                }else  if(change<'a'){
                    change=change + 26;
                }
            }else if(Character.isUpperCase(array[i])) {
                if(change>'Z'){
                    change=change - 26;
                }else  if(change<'A'){
                    change=change + 26;
                }
            }
            char ch = (char) change;
            array[i] = ch;
    
        }
        message = String.valueOf(array);

        return message;
        
    }

    public static String decrypt(String message, int shift) {
        if(shift>26){
            shift = shift%26;
        } if(shift>13)
        shift= shift-26;
        char[] array = message.toCharArray();
        for(int i=0; i<array.length; i++) {
            int change = array[i]+shift;
            if((int)array[i]==32){
                change=32;
            }else if(Character.isLowerCase(array[i])) {
                if(change>'z'){
                    change=change - 26;
                }else  if(change<'a'){
                    change=change + 26;
                }
            }else if(Character.isUpperCase(array[i])) {
                if(change>'Z'){
                    change=change - 26;
                }else  if(change<'A'){
                    change=change + 26;
                }
            }
            char ch = (char) change;
            array[i] = ch;
    
        }
        message = String.valueOf(array);

        return message;
    }
}
