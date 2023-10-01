public class ifelse {
    public static void main(String args[])
    {
        // int age=10;

        // if (age >=18)  
        // {
        // System.out.println(" legal adult");
        // }
        // else 
        // {
        //     System.out.println("kid");
        // }

        // int age= 65;

        // if(age>=18 && age<60)
        // {
        //     System.out.println("Legal Adult");
        // }
        // else if(age>60)
        // {
        //     System.out.println("No country for old man");
        // }
        // else 
        // {
        //     System.out.println("kiddo");
        // }

        int age= 62;
        if(age>=18 && age<=60)
        {
            if(age>20 && age<30)
            {
                System.out.println("you are in 20's");

            }
             else if(age>30 && age<40)
            {
                System.out.println("you are in 30's");

            }
            else
            {
                System.out.println("legal adult");
            }

            
        }
        else if(age>60)
        {
            System.out.println("old man");
        }
        else if(age>16 && age<18)
        {
            System.out.println("teen");
        }
        else
        {
            System.out.println("kiddo");

        }







    }

    
}
