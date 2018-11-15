/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTL_mathquiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class Question {
    List<String> ch = new ArrayList<String>();
    String[] ch2 = {
        "1+1=x","6-5+x*4=4",
        "10*15-4+x*3 = 28","13+4 = x - 13",
        "12 + 24 < x - 13 < 88 - 50","x - 7 - 1 > 10",
        "87 - 7 - x = 40","meo",
        "16+3*2-9/x = 5 + y","minhlagicuanhau",
        "emmoilanguoianhyeu","hihi",
        "huhu","kiki",
        "kaka","kuku"
    };

    public String[] getCh2() {
        return ch2;
    }

    public void setCh2(String[] ch2) {
        this.ch2 = ch2;
    }

    public Question() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\My PC\\Desktop\\exam-ltm-haimanhhonganh\\src\\question.txt"));
            String textsout = br.readLine();
            while(textsout!= null){
                ch.add(textsout);
                textsout = br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
