/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTL_mathquiz;

/**
 *
 * @author My PC
 */
public class Quiz {
    int id;
    int dokho;
    String quiz;
    String x;
    String y;
    String z;
    int time;
    int diemCong;
    int diemTru;
    
    public Quiz() {
        
    }

    public Quiz(int id, int dokho, String quiz, String x, String y, String z) {
        super();
        this.id = id;
        this.dokho = dokho;
        this.quiz = quiz;
        this.x = x;
        this.y = y;
        this.z = z;
        if(dokho == 1){
            this.time = 10;
            diemCong = 10;
            diemTru = 5;
        }
        else if(dokho == 2){
            this.time = 20;
            diemCong = 20;
            diemTru = 10;            
        }
        else if(dokho == 3){
            this.time = 30;
            diemCong = 30;
            diemTru = 10;            
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDokho() {
        return dokho;
    }

    public void setDokho(int dokho) {
        this.dokho = dokho;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDiemCong() {
        return diemCong;
    }

    public void setDiemCong(int diemCong) {
        this.diemCong = diemCong;
    }

    public int getDiemTru() {
        return diemTru;
    }

    public void setDiemTru(int diemTru) {
        this.diemTru = diemTru;
    }
    
    
    
    
}
