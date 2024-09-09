package Day5;

public class WhileLoopDemo 
{
    public static void main(String[] args) 
    {
        int numb=1;
        int size=10;  
        
        while(numb<=size)
        {
            
            System.out.println(numb);
                     
            numb++;
        }
                                
        int numb1=1;
        int size1=10;  
        
        while(numb1<=size1)
        {
            
            System.out.println("Hello ");
                     
            numb1++;
        }
        int numb2=2;
        int size2=10;  
        
        while(numb2<=size2)
        {
            
            System.out.println(numb2);
                     
            numb2+=2;
        }
        int numb3=1;
        int size3=10;  
        
        while(numb3<=size3)
        {
            if(numb3%2==0)
            {
                System.out.println(numb3);
            }                               
            numb3++;
        }
        int numb4=1;
        int size4=10;  
        
        while(numb4<=size4)
        {
            if(numb4%2!=0)
            {
                System.out.println(numb4);
            }                               
            numb4++;
        }
        int numb5=10;
        int size5=1;  
        
        while(numb5>=size5)
        {
            System.out.println(numb5);
                                        
            numb5--;
        }

    }
}
