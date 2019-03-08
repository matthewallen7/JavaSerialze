/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.Serializable;
/**
 *
 * @author j378491
 */
public class Course implements Serializable{
    public String name;
    public String type;
    public String code;
    public int score;
    
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
   public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
   public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
