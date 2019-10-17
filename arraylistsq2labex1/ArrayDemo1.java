package arraylistsq2labex1;
import java.util.*;

class Student {
    String Name;
    int Score;
    
    public void displayArray(ArrayList<Student> AS) {
        AS.stream().map((s) -> {
            System.out.println(" ");
            System.out.print(s.Name + ": ");
            return s;
        }).forEachOrdered((s) -> {
            System.out.println(s.Score);
        });
    }
    
     public void searchHighestScore(ArrayList<Student> AS) {
        int highest = 0;
        for (int i = 0; i < AS.size(); i++) 
        {
            
        for (int j = i + 1; j < AS.size(); j++) 
            {
               if(AS.get(i).Score < AS.get(j).Score){
                    int temp;
                    String temp2;
                    temp = AS.get(i).Score;
                    temp2 = AS.get(i).Name;
                    AS.get(i).Score = AS.get(j).Score;
                    AS.get(i).Name = AS.get(j).Name;
                    AS.get(j).Score = temp;
                    AS.get(j).Name = temp2;
                }
            }
        }   
        
        System.out.println("");
        System.out.println(AS.get(highest).Name + " got the highest score of " + AS.get(highest).Score + "!");
        }
        

 public void sortScores(ArrayList<Student> AS) {
        int highest = 0;
        for (int i = 0; i < AS.size(); i++) 
        {
            
        for (int j = i + 1; j < AS.size(); j++) 
            {
               if(AS.get(i).Score < AS.get(j).Score){
                    int temp;
                    String temp2;
                    temp = AS.get(i).Score;
                    temp2 = AS.get(i).Name;
                    AS.get(i).Score = AS.get(j).Score;
                    AS.get(i).Name = AS.get(j).Name;
                    AS.get(j).Score = temp;
                    AS.get(j).Name = temp2;
                }
            }
      
        }
        for(int count = 0; count < AS.size(); count++){
            System.out.println((count + 1) + "." + " " + AS.get(count).Name + ": " + AS.get(count).Score);
            
        }
    }
    
    public void sortNames(ArrayList<Student> AS) {
         for (int i = 0; i < AS.size(); i++) 
        {
            for (int j = i + 1; j < AS.size(); j++) 
            {
                if ((AS.get(i).Name).compareTo(AS.get(j).Name)>0)
                {
                    String temp;
                    int temp2;
                    temp = AS.get(i).Name;
                    temp2 = AS.get(i).Score;
                    AS.get(i).Name = AS.get(j).Name;
                    AS.get(i).Score = AS.get(j).Score;
                    AS.get(j).Name = temp;
                    AS.get(j).Score = temp2;
                }
            }
        }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < AS.size() - 1; i++) 
            {
            System.out.println(AS.get(i).Name);
            }
        System.out.println(AS.get(AS.size()-1).Name);
    }
}

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};
        
        ArrayList<Student> StudentArrayList = new ArrayList<Student>();
        for (int i = 0; i <= 4; i++) {
            StudentArrayList.add(new Student());
            StudentArrayList.get(i).Name = NameI[i];
            StudentArrayList.get(i).Score = ScoreI[i];
        }
        
       
        Student method = new Student();

        method.displayArray(StudentArrayList);

        method.searchHighestScore(StudentArrayList);

        method.sortScores(StudentArrayList);
        
        method.displayArray(StudentArrayList);

        method.sortNames(StudentArrayList);
        
        method.displayArray(StudentArrayList);        
        
   
    }
}

