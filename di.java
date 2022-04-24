import java.util.*;
import java.net.URI;
import  java.awt.Desktop;

public class disease
{
    int i =0;
    public void tr() throws java.net.URISyntaxException {
        Scanner sc= new Scanner(System.in);
        if(i==8)
        {
            System.out.println("YOU HAVE TYPHOID!!!!");
            System.out.println("Do you want to know some hospitals related to disease\n(a)yes\n(b)no");
            String stg=sc.nextLine();
            if(stg.equalsIgnoreCase("yes")){
            Desktop d= Desktop.getDesktop();
            try
            {
                d.browse(new URI("https://www.apollohospitals.com/locations/india/lucknow/"));
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }}}
        else if((i<=7)&&(i>=5)){
            System.out.println("You are in mid stage!\n Dont need to worry just call these numbers and check\n +918035009025 ");
        }
        else{
            System.out.println("WOWWW...You are totally fine and away from typoid");
        }
            }
    
    public void typhoid()
   {
    String str;
    String s ="yes";
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you feel weakness or fatigue often?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))    {
      i++;
    }
    System.out.println("Do you feel muscle aches?\n(a)yes/n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    {
      i++;
    }
    System.out.println("Is there loss of apetite or weight loss?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    }
    System.out.println("Is there a lot of sweating?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    }
    System.out.println("Do you have dry coughs?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    }
    System.out.println("Do you have stomach pain?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    } 
    System.out.println("Do you have headache?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    }
    System.out.println("Is there a fever that increases upto 104.5 degrees?\n(a)yes\n(b)no");
    str=sc.nextLine();
    if(str.equals(s))
    { 
      i++;
    }
 }
 public void dengue(){
     int i=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you have high fever?\n"+"(a)YES      (b)NO");
        String st =sc.next();
         if(st.equalsIgnoreCase("yes"))
          i++;

        System.out.println("Do you have a headache?\n"+"(a)YES      (b)NO");
        
         st=sc.next();
         if(st.equalsIgnoreCase("yes"))
         i++;

         System.out.println("Do you have rashes or red spots over all your bodyor part of your body?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        
        System.out.println("do you have joint and muscle pain\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you have abdominal pain?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you have pain in the backside of your eyes?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you feel like nausea and vomiting?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        }
 
    public void dr() throws java.net.URISyntaxException {
        Scanner sc= new Scanner(System.in);
        if(i==7)
        {
            System.out.println("YOU HAVE DENGUE!!!!");
            System.out.println("Do you want to know some hospitals related to disease\n(a)yes\n(b)no");
            String stg=sc.nextLine();
            if(stg.equalsIgnoreCase("yes")){
            Desktop d= Desktop.getDesktop();
            try
            {
                d.browse(new URI("https://www.apollohospitals.com/locations/india/lucknow/"));
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }}}
        else if((i<=6)&&(i>=4)){
            System.out.println("You are in mid stage!\n Dont need to worry just call these numbers and check\n +918035009025 ");
        }
        else if(i<4){
            System.out.println("WOWWW...You are totally fine and away from Dengue");
        }
            
        }
        public void daibetes(){
             int i=0;int d=0;
        Scanner  sc =new Scanner(System.in);

        System.out.println("Do you feel that your thirst is increased?\n"+"(a)YES      (b)NO");
        String st =sc.next();
         if(st.equalsIgnoreCase("yes"))
         { i++;
            d++;}

        System.out.println("Do you have freaquent urination?\n"+"(a)YES      (b)NO");
        
         st=sc.next();
         if(st.equalsIgnoreCase("yes"))
         {i++;
            d++;}

         System.out.println("Do you feel hungery frequently?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
       {i++;
        d++;}
        
        System.out.println("do you have joint and muscle pain\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Are you having a blurred vision?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
       { i++;
        d++;}
        System.out.println("Do you have general feeling of discomfort?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Are you experiencing a weight gain or weight loss?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        
        System.out.println("Are you experiencing a poor wound healing?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Does your symptoms include frequent sweating?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you feel like nausea and vomiting ?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you feel fatigue most of the time?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
       { i++;
        i++;}
        System.out.println("Do you have fast heart rate?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
       { i++;
        i++;}
       System.out.println("Are you getting infected frequently?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        d++; 
        System.out.println("Do you have headache?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++; 
        System.out.println("Do you feel sleepy most of the time ?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++; 
        System.out.println("Are you experiencing any weight loss ?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++; 
        }
        public void dbr() throws java.net.URISyntaxException {
            Scanner sc= new Scanner(System.in);
        if(i==12)
        {
            System.out.println("YOU HAVE Daibetes!!!!");
            System.out.println("Do you want to know some hospitals related to disease\n(a)yes\n(b)no");
            String stg=sc.nextLine();
            if(stg.equalsIgnoreCase("yes")){
            Desktop d= Desktop.getDesktop();
            try
            {
                d.browse(new URI("https://www.apollohospitals.com/locations/india/lucknow/"));
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }}}
        else if((i<=11)&&(i>=7)){
            System.out.println("You are in mid stage!\n Dont need to worry just call these numbers and check\n +918035009025 ");
        }
        else{
            System.out.println("WOWWW...You are totally fine and away from Daibetes");
        }}
        public void malaria(){
            
        }
 public static void main(String args[])
 {
    
    disease obj=new disease();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the disease you want to check\ndaibetes\ntyphoid\ndengue");
    String d=sc.nextLine();
    if(d.equalsIgnoreCase("typhoid")){

    obj.typhoid();
    try
    {
        obj.tr();
    }
    catch (java.net.URISyntaxException urise)
    {
        urise.printStackTrace();
    }
   }
   else if(d.equalsIgnoreCase("daibetes")){
       obj.daibetes();
       try
       {
           obj.dbr();
       }
       catch (java.net.URISyntaxException urise)
       {
           urise.printStackTrace();
       }
       
   }
   else if(d.equalsIgnoreCase("dengue")){
       obj.dengue();
       try
       {
           obj.dr();
       }
       catch (java.net.URISyntaxException urise)
       {
           urise.printStackTrace();
       }
   }
}
}
