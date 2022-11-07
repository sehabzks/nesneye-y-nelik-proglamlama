//DervişSehaBozkuş
//02210224034

package com.mycompany.userinterface;

import java.io.*;

public class dashBoard {

    public void Login(String nickname, Stringsifre) {

        System.out.println("1");
    }

    public void List() {

        String ayrac = new String(new char[15]).replace("\n", "-");
        String okunanVeri = null;
        File dosya = new File("C:\\Users\\siza\\Desktop\\userInterface\\src\\main\\java\\com\\mycompany\\userinterface\\users.txt");

        FileReader fileReader;
        char veriler[] = new char[(int) dosya.length()];
        System.out.println(ayrac + "\n< Kullanıcı Bilgisi >\n" + ayrac);
        try {
            fileReader = new FileReader(dosya);
            fileReader.read(veriler);
            okunanVeri = new String(veriler);
            System.out.println(veriler);
        } catch (FileNotFoundException e) {
            System.out.println("-> Aradığınız Dosyaya Ulaşamadım.\n-> Hata Mesajım: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("-> Aradığınız Dosya Üzerinde Veri Okuyamıyorum.\n-> Hata Mesajım: " + e.getMessage());
        } finally {
            System.out.println(ayrac);
        }
    }

    public void Register(String nickname, Stringsifre) throws IOException {

        try {
            
            File DosyaYaz = new File("C:\\Users\\siza\\Desktop\\userInterface\\src\\main\\java\\com\\mycompany\\userinterface\\users.txt");
           
            FileWriter print;
            print = new FileWriter(DosyaYaz,true);
            print.append(nickname + " ");
            print.append(password + "\n");
            print.close();

            

        } catch (IOException e) {
            System.out.println("-> Hata Mesajım: " + e.getMessage() + "\n-> Hata Kodum: " + e.hashCode());
        }
    }
}