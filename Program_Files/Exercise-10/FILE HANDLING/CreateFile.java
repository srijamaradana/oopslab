import java.io.File;  
import java.io.IOException;  
 class CreateFile {  
               public static void main(String args[]) {  
               try {  
                       File f0 = new File("RAAHI.txt");  
                       if (f0.createNewFile()) {  
                                  System.out.println("File " + f0.getName() + " is created suc-cessfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       }  
                     } catch (IOException exception) {  
                              System.out.println("An unexpected error is occurred.");  
                              exception.printStackTrace();  
                  }  
        }  
}
