package javasessions;

public class StringConcat {

	public static void main(String[] args) {
		
				String s = "Hello World";
				System.out.println(s);
				//Op: Hello World
				
				System.out.println(10);//10
				System.out.println("hello selenium");//hello selenium
				
				int a = 100;
				int b = 200;
				
				String x = "Hello";
				String y = "Selenium";
				
				System.out.println(a+b);//300
				System.out.println(x+y);//HelloSelenium
				System.out.println(a+x);//100Hello
				System.out.println(a+b+x+y);//300HelloSelenium
				System.out.println(x+y+a+b);//HelloSelenium100200
				System.out.println(x+y+(a+b));//HelloSelenium300

				System.out.println("the value of a : " + a);//the value of a : 100
				System.out.println("the value of b : " + b);//the value of b : 200
				System.out.println("the sum is : " + (a+b));//the sum is : 300

				char c1 = 'a';//ASCII Value of a = 97
				char c2 = 'b';//ASCII Value of b = 98
				char c3 = '9';//ASCII Value of 9 = 57
				System.out.println(c1);//a
				System.out.println(c1+c2);///97+98 = 195
				
				//a-z : 97 to 122
				//A-Z : 65 to 90
				//0-9: 48 to 57
				
				System.out.println((int)c3);//57
				System.out.println(c3-c2);//-41
				
				System.out.println(c1+""+c2);//ab
				System.out.println(c1+"");//a
				
				System.out.println(x+c1+c2);//Helloab
				System.out.println(c1+c2+x+y);//195HelloSelenium
				
				System.out.println((int)c1 + (int)c2 + "");//195

			}

		}

