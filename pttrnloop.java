public class pttrnloop {
    public static void main(String[] args) {
    //    for(int j=0;j<10;j++)
    //     {
    //     for (int i=0;i<10;i++)
    //     {
    //         System.out.print("* ");
    //     }
    //     System.out.println("*");
    // }
    //    int n=10;

    //    for(int i=0;i<n;i++)
    //     {
    //     for (int j=0;j<n;j++)
    //     {
    //         if(i==0 || j==0 || i==n-1 ||j==n-1)
    //         {
    //             System.out.print("*");
    //         }
        
    //         else
    //         {
    //             System.out.print(" ");

    //         }
        
            
    //     }
    //     System.out.println();
    // }
    // int n=10;

    //    for(int i=0;i<n;i++)
    //     {
    //     for (int j=0;j<n;j++)
    //     {
    //         if(i==0 || j==0 || i==(n)/2 ||j==n-1)
    //         {
    //             System.out.print("*");
    //         }
        
    //         else
    //         {
    //             System.out.print(" ");

    //         }
        
            
    //     }
    //     System.out.println();
    // }
    // int n=10;

    //    for(int i=0;i<n;i++)
    //     {
    //     for (int j=0;j<n;j++)
    //     {
    //         if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0 )
    //         {
    //             System.out.print("*");
    //         }
        
    //         else
    //         {
    //             System.out.print(" ");

    //         }
        
    //         // alphabet A
    //     }
    //     System.out.println();
    // }
    //  int n=10;

    //    for(int i=0;i<n;i++)
    //     {
    //     for (int j=0;j<n;j++)
    //     {
    //         if(i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1 )
    //         {
    //             System.out.print("*");
    //         }
        
    //         else
    //         {
    //             System.out.print(" ");

    //         }
    //     //alphabet D
           
    //     }
    //     System.out.println();
    //}



    int n=19;

       for(int i=0;i<n;i++)
        {
        for (int j=0;j<n;j++)
        {
            if(i==j || i+j==n-1 || i==0 ||j==0 || i==n-1 || j==n-1)
            {
                System.out.print("*");
            }
        
            else
            {
                System.out.print(" ");

            }
        //alphabet D
           
        }
        System.out.println();
    }
}
}
