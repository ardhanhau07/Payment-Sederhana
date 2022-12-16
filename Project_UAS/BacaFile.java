package Project_UAS;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        String namaFile = "dataNasabah.txt";
        try{
            //Membaca File
            File fileSaya = new File(namaFile);
            Scanner fileReader = new Scanner(fileSaya);
            
            //Mencetak isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
