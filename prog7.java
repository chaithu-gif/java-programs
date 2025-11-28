import java.util.*;
class WrongException extends Exception {
    public WrongException(String message) {
        super(message);
    }
}

class Father {
    int father_age;

    Father(int father_age) throws WrongException {
        if (father_age < 0) {  
            throw new WrongException("Age can't be negative");
        }
        this.father_age = father_age; 
    }
}

class son extends Father{
    int son_age;
    int father_age;
    son(int son_age,int father_age)throws WrongException{
        super(father_age);
        if(son_age>=father_age){
            throw new WrongException("son's age must be less than father's age");
        }
        if(son_age<0){
            throw new WrongException("age must be positive");
        }
        this.son_age=son_age;
    }
}
public class prog7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try {
            int son_age=sc.nextInt();
            int father_age=sc.nextInt();
            son s=new son(son_age,father_age);
        } catch (WrongException e) {
            System.out.println(e.getMessage());
        }
    }
}