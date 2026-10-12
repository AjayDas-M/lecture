import java.io.*;
import java.util.Scanner;
class file_handling
{
    void create()
    {
        try
        {
            File f = new File("./myfile.txt");
            if(f.createNewFile())
            {
                System.out.println("File created");
            }    
            else
            {
                System.out.println("The file is already created :");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


    void read()
    {
        try
        {
            FileInputStream fin = new FileInputStream("./myfile.txt");
            int ch = fin.read();
            while(ch!=-1)
            {
                char s = (char)ch;
                System.out.print(s);
                ch = fin.read();
            } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        file_handling obj = new file_handling();
        do
        {
            System.out.println("\n1. CREATE \n");
            System.out.println("Choose your options");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj.create();
                    break;
                case 2:
                    obj.read();
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Choose a valid option");
                    break;
            }


        }while(ch!=3);
    }   
      

}