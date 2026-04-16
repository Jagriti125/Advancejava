//practice , make a string of char and perform  operation +,-,*,/ using switch  
package sem2advancejava;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=20,b=7;
          char ch='+';
          int result=switch(ch) {
          case '+'->a+b;
          case '-'->a-b;
          case '*'->a*b;
          case '/'->a/b;
          default->-1;
          };
          System.out.println(result);
          
          String day="monday";
          int d=switch(day) {
          case "monday","friday","sunday"->6;
          case"tuesday"->7;
          case "wednesday"->9;
          case "thursday","saturday"->8;
          default->-1;
          };
          System.out.println(d);
          
        String day1="monday";
        String d1=switch(day1) {
        case"monday","tuesday","wednesday","thursday","friday"->"Weekday";
        case "saturday","sunday"->"Weekend";
        default->"invalid day";
        };
        System.out.println(d1);
        
        int month=4;
        String s=switch(month) {
        case 12,1,2,11->"Winter";
        case 3,4,5->"Spring";
        case 6,7,8->"summer";
        case 9,10->"autumn";
        default->"invalid month";
	};
   System.out.println(s);
   
   String signal="red";
   String s1=switch(signal) {
   case  "red"->{
	   System.out.println("signal is red");
	   yield"Stop";
	  // yield signal+" is stop"; 
   }
   case "yellow"->{
	   System.out.println("signal is yellow");
	   yield" wait";
   }
   case "green"->{
	   System.out.println("signal is green");
	   yield "go";
   }
   default->{
	   yield"invalid signal";
   }
   };
   System.out.println(s1);
   
   int number=2;
   String output=switch(number) {
   case 1:{
	   yield "one";
   }
   case 2:{
	   yield "two";
   }
   default:{
	   yield "invalid";
   }
   };
   System.out.println(output);
    }
}
