package Praktikum13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LaptopTest {
    // Anda boleh menambahkan atribut yang diperlukan
    private Class c;

    public LaptopTest(String className) throws ClassNotFoundException {
        /**
         * Memeriksa apakah ada kelas dengan nama className.
         * Jika tidak, tuliskan "Tidak ada kelas dengan nama yang diberikan" (tanpa petik) ke layar
         */
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Tidak ada kelas dengan nama yang diberikan");
        }
    }

    public boolean testMethods() {
        boolean result = true;
        Method[] m = c.getDeclaredMethods();
        if (m.length == 1) {
            // Jika nama method bukan getRamSize, tuliskan "Nama method harus getRamSize" (tanpa petik) ke layar
            if (!m[0].getName().equals("getRamSize")){
                System.out.println("Nama method harus getRamSize");
                result = false;
            }
            // Jika tipe return bukan Integer, tuliskan "Tipe return method harus Integer" (tanpa petik) ke layar
            if (!m[0].getReturnType().getName().equals("java.lang.Integer")){
                System.out.println("Tipe return method harus Integer");
                result = false;
            }
        } else {
            // Menuliskan "Banyaknya method hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya method hanya boleh 1");
            result = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return result;
    }

    public boolean testFields() {
        Field[] f = c.getDeclaredFields();
        boolean result = true;
        if (f.length == 1) {
            // Jika nama field bukan serialNumber, tuliskan "Nama field harus serialNumber" (tanpa petik) ke layar
            if (!f[0].getName().equals("serialNumber")){
                System.out.println("Nama field harus serialNumber");
                result = false;
            }
            // Jika tipe return bukan String, tuliskan "Tipe field harus String" (tanpa petik) ke layar
            if (!f[0].getType().getName().equals("java.lang.String")){
                System.out.println("Tipe field harus String");
                result = false;
            }
        } else {
            // Menuliskan "Banyaknya field hanya boleh 1" (tanpa petik) ke layar
            System.out.println("Banyaknya field hanya boleh 1");
            result = false;
        }
        // Return true jika semua tes berhasil
        // Jika ada 1 yang salah, return false
        return result;
    }
}
