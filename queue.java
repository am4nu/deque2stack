import java.util.*;
class queue{
 static  Stack s1=new Stack();
 static  Stack s2=new Stack();
static boolean empty()
 {
     return s1.isEmpty() && s2.isEmpty();

 }
 static int size()
 {
     return s1.size()+s2.size();
 }
static void enqueuebehind(int e){
 s1.push(e);
}
static void enqueuefront(int e){
    s2.push(e);
}
static int dequeuefront(){
    if(s2.isEmpty())
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
    }
return (int)s2.pop();

}

static int dequeueback(){
    if(s1.isEmpty())
    {
        while(!s2.isEmptimport java.util.*;
class queue{
 static  Stack s1=new Stack();
 static  Stack s2=new Stack();
static boolean empty()
 {
     return s1.isEmpty() && s2.isEmpty();

 }
 static int size()
 {
     return s1.size()+s2.size();
 }
static void enqueuebehind(int e){
 s1.push(e);
}
static void enqueuefront(int e){
    s2.push(e);
}
static int dequeuefront(){
    if(s2.isEmpty())
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
    }
return (int)s2.pop();

}

static int dequeueback(){
    if(s1.isEmpty())
    {
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
    }

return (int)s1.pop();

}

public static void main(String[] args){

   enqueuefront(new Integer(1));
   enqueuefront(new Integer(2));
   System.out.println(dequeuefront());
   enqueuebehind(new Integer(3));
   enqueuebehind(new Integer(4));
   System.out.println(dequeuefront());
   enqueuebehind(new Integer(5));
   System.out.println(dequeuefront());

   
    
}
}y())
        {
            s1.push(s2.pop());
        }
        
    }

return (int)s1.pop();

}

public static void main(String[] args){

   enqueuefront(new Integer(1));
   enqueuefront(new Integer(2));
   System.out.println(dequeuefront());
   enqueuebehind(new Integer(3));
   enqueuebehind(new Integer(4));
   System.out.println(dequeuefront());
   enqueuebehind(new Integer(5));
   System.out.println(dequeuefront());

   
    
}
}
