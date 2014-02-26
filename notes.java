Notes~
##current time!
System.out.println(System.currentTimeMillis());
##printf
system.out.println("\nThe first value is %3.2f and the second is %15_3f", val1,val2)

#Conditionals
int a=30, b=40,c=20
int d = (b>c) ?((a>b>?c:a):((b>a)?a:b)
boolean ? expression : expression
if boolean true do expression 1

if (b>c)
	if (a>b)
	d=c;
		else
		d=a
else
	if(b>a)
	d=a;
	else
	d=b;


#ASCII
48 hex is 72 decimal
4 * 16 + 8 = 72

in unicode they are 16 bit
0048

look up how many bites make up an int

Strings are really objects
S3 = S1 + S2; == S3=S1.concat(S2); //this is a instance method

Poor beta becomes and orphan, and there is a garbage colector running in the background that gobbles up all the orphans

Example:
        System.out.println(The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
public static in hexToDecimal(String hex)
        {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++)
        {
        char hexChar = hex.charAt(i);
        decimalValue = decimalValue * 16 + hexToDecimal(hexChar);
        }
        return decimalValue;
        }
public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch -'0';
			}
	