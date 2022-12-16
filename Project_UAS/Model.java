/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_UAS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author frzar
 */
public class Model {

    File dataUser = new File("dataNasabah.txt");

    public void isiData() throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile(dataUser, "rw");
        while (raf.getFilePointer() < raf.length()) {
            String data = raf.readLine();
            String[] split = data.split("#");
            if (split[0].equals(bantuan.getUserName())) {
                bantuan.setPw(split[1]);
                bantuan.setNoReq(split[2]);
                bantuan.setSaldo(split[3]);
                break;
            }
        }
    }

    public void perubahanDana(String userName, int nominal) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(dataUser);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine() + System.lineSeparator());
        }
        String data = buffer.toString();
        sc.close();
        String oldLine = MessageFormat.format("{0}#{1}#{2}#{3}",
                getArr(userName)[0], getArr(userName)[1], getArr(userName)[2], getArr(userName)[3]);
        int temp = Integer.parseInt(getArr(userName)[3])+nominal;
        String newLine = MessageFormat.format("{0}#{1}#{2}#{3}",
                getArr(userName)[0], getArr(userName)[1], getArr(userName)[2], String.valueOf(temp));
        data = data.replaceAll(oldLine, newLine);
        FileWriter writer = new FileWriter(dataUser);
        writer.append(data);
        writer.flush();
    }

    private String[] getArr(String userName) throws FileNotFoundException, IOException {
        String[] split = new String[2];
        RandomAccessFile raf = new RandomAccessFile(dataUser, "rw");
        while (raf.getFilePointer() < raf.length()) {
            String dataString = raf.readLine();
            split = dataString.split("#");
            if (split[2].equals(userName)) {
                break;
            }
        }
        return split;
    }

}
