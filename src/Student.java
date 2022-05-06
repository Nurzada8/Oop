public class Student {
    private String name;
    private String email;
    private int age;

    void setName(String a){
        name = a;
    }
    void setEmail(String a){
        email = a;
    }
    void setAge(int a){
       if( a < 18) {
           System.out.println("jash 18 don chon bolush kerek");
       }else
           this.age= age;
    }
       String getName(){
           return name;
        }

        int getAge(){
        return age;
        }
       String getEmail(){
           return email;
        }


    }

