package com.xworkz.task.college;

public class Collegedto {
    private String name;
    private String email;
    private String course;
    private String message;

    public void setName(String name){
        this.name=name;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setMessage(String course){
        this.message=message;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return "Collegedto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
