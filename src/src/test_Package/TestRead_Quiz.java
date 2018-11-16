/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_Package;

import BTL_mathquiz.Quiz;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
/**
 *
 * @author My PC
 */
public class TestRead_Quiz {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Quiz> listQuiz = new ArrayList<>();
        InputStream inputStream = new FileInputStream("C:\\Users\\My PC\\Desktop\\exam-ltm-haimanhhonganh\\src\\quiz.json");
        JsonReader jsonReader = Json.createReader(inputStream);
        JsonArray arrJSON = jsonReader.readArray();      
        
        for (int i = 0; i < arrJSON.size(); i++) {
            JsonObject rootJSON = arrJSON.getJsonObject(i);
            Quiz quiz = new Quiz(rootJSON.getInt("id"), rootJSON.getInt("Dokho"),rootJSON.getString("Quiz"),rootJSON.getString("x"),rootJSON.getString("y"),rootJSON.getString("z"));

            listQuiz.add(quiz);
        }        
        
        for(Quiz quiz: listQuiz){
            System.out.println(quiz.getId() + "  " + quiz.getQuiz());
        }        
        
        jsonReader.close();
        inputStream.close();
    }
}
