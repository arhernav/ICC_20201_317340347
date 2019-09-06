public class HeyJude{
    public static String HEY = "Hey Jude ";
    public static String DON = "don't ";
    public static String MAK = "make it bad.";
    public static String BEA = "be afraid.";
    public static String LET = "let me down.";
    public static String TAK = "Take a sad song and make it better.";
    public static String YOW = "You were made to go out and get her.";
    public static String YOH = "You have found her, now go and get her.";
    public static String REM = "Remember to ";
    public static String LEH = "let her into you heart.";
    public static String LES = "let her into your skin.";
    public static String THE = "Then you ";
    public static String CAN = "can start ";
    public static String BEG = "begin ";
    public static String TOM = "to make it better ";
    public static String BET = "better ";
    public static String NA  = "na ";

    public static String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

    public static String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main(String[] args){
	int p = 1;//Numero de parrafos
	while(p<=9){
	    if(p==1||p==2||p==4||p==6){
		switch(p){
		    case 1:
		System.out.println(HEY+DON+MAK);
		System.out.println(TAK);
		System.out.println(REM+LEH);
		System.out.println(THE+CAN+TOM);
		System.out.println("\n");
		p++;
		break;
		    case 2:
		System.out.println(HEY+DON+BEA);
		System.out.println(YOW);
		System.out.println(REM+LES);
		System.out.println(THE+BEG+TOM);
		System.out.println("\n");
		p++;
		break;    
	            case 4:
		System.out.println(HEY+DON+LET);
		System.out.println(YOH);
		System.out.println(REM+LEH);
		System.out.println(THE+CAN+TOM);
		System.out.println("\n");
		p++;
		break;
		    default:
		System.out.println(HEY+DON+MAK);
		System.out.println(TAK);
		System.out.println(REM+LES);
		System.out.println(THE+CAN+TOM);
		System.out.println("\n");
		p++;
		break;
		}
	    }else{
		switch(p){
		case 3:
		System.out.println(AND);
		System.out.println(NA+NA+NA+NA+NA);
		System.out.println(NA+NA+NA+NA);
		System.out.println("\n");
		p++;
		break;
		case 5:
		System.out.println(SOL);
		System.out.println("\n");
		p++;
		break;
		default:
		    for(int n=1; n<=3; n++){
		System.out.println(NA+NA+NA);
		System.out.println(NA+NA+NA+NA);
		System.out.println(NA+NA+NA+NA);
		System.out.println(HEY);
		System.out.println("\n");
		p++;
		    }
		break;		

		}
	    }
        
	}   
    }
}
	/*
1
Hey Jude, don't make it bad
Take a sad song and make it better
Remember to let her into your heart
Then you can start to make it better

2
Hey Jude, don't be afraid
You were made to go out and get her
The minute you let her under your skin
Then you begin to make it better

3
And anytime you feel the pain
Hey Jude, refrain
Don't carry the world upon your shoulders
For well you know that it's a fool
Who plays it cool
By making his world a little colder
Na-na-na, na, na
Na-na-na, na

4
Hey Jude, don't let me down
You have found her, now go and get her (let it out and let it in)
Remember to let her into your heart (hey Jude)
Then you can start to make it better

5
So let it out and let it in
Hey Jude, begin
You're waiting for someone to perform with
And don't you know that it's just you

6
Hey Jude, you'll do
The movement you need is on your shoulder
Na-na-na, na, na
Na-na-na, na, yeah

7
Hey Jude, don't make it bad
Take a sad song and make it better
Remember to let her under your skin
Then you'll begin to make it better

8
Better better better better better, ah!
Na, na, na, na-na-na na (yeah! Yeah, yeah, yeah, yeah, yeah, yeah)
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude (Jude Jude, Judy Judy Judy Judy, ow wow!)
Na, na, na, na-na-na na (my, my, my)
Na-na-na na, hey Jude (Jude, Jude, Jude, Jude, Jude)
Na, na, na, na-na-na na (yeah, yeah, yeah)
Na-na-na na, hey Jude (yeah, you know you can make it, Jude, Jude, you're not gonna break it)
Na, na, na, na-na-na na (don't make it bad, Jude, take a sad song and make it better)
Na-na-na na, hey Jude (oh Jude, Jude, hey Jude, wa!)
Na, na, na, na-na-na na (oh Jude)
Na-na-na na, hey Jude (hey, hey, hey, hey)
Na, na, na, na-na-na na (hey, hey)
Na-na-na na, hey Jude (now, Jude, Jude, Jude, Jude, Jude)
Na, na, na, na-na-na na (Jude, yeah, yeah, yeah, yeah)
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude (na-na-na-na-na-na-na-na-na)
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na (yeah, make it, Jude)
Na-na-na na, hey Jude (yeah yeah yeah yeah yeah! Yeah! Yeah! Yeah! Yeah!)
Na, na, na, na-na-na na (yeah, yeah yeah, yeah! Yeah! Yeah!)
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude
Na, na, na, na-na-na na
Na-na-na na, hey Jude */
