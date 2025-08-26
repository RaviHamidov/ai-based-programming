import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String desktopPath = "C:/Users/ZenBook/Documents/GitHub/ai-based-programming/001_advanced-java-concepts/003_input-output-operations-file-handling/001_notepad-app";
        File noteDir = new File(desktopPath, "notepad");

        // file yaratmazdan once onu ichine yerlesdirmek uchun folder yaradiriq
        if(!noteDir.exists()) {
            noteDir.mkdir();
            System.out.println("Directory created: " + noteDir.getAbsolutePath());
        } else {
            System.out.print("Directory already exists: " + noteDir.getAbsolutePath());
        }

        // file name vererken file ne zaman yazildiqi belli olsun deye LocalDate'den istifade edirik
        LocalDate now = LocalDate.now();
        String fileName = "note_" + now + ".txt";
        File noteFile = new File(noteDir, fileName);

        // sonra folder yaratdiqdan ve file'a ad teyin etdikden sonra file olub/olmadiqini yoxlayb create edirik
        if(!noteFile.exists()) {
            try{
                noteFile.createNewFile();
                System.out.print("File created:" + noteFile.getAbsolutePath());

            } catch (IOException e) {
                System.out.print("Error creating file: " + e.getMessage());
            }
        }

        // file'a scanner vasitesi ile yazi yazdiririq
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Qeydlerinizi etdikden sonra 'exit' yazmaqiniz kifayetdir.");
            while (scanner.hasNextLine()) {
                if(scanner.exists("exit")){
                    System.out.print(scanner.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}