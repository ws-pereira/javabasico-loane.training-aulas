package br.com.wspereira.javabasico.Aula52.lab;

public class Contato {

    private static int count = 0;
    private int id;
    private String name;
    private String phone;
    private String email;

    public Contato(){
        count++;
        this.id = count;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato (" +
                "id - " + id +
                ", name - '" + name + '\'' +
                ", phone - '" + phone + '\'' +
                ", email - '" + email + '\'' +
                ')';
    }
}
