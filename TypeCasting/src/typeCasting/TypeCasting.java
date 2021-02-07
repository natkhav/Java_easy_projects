/* Type Casting Example
* By Natalia Khavlina
* Jan 30th, 2021
*/
package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		//Example of Implicit Casting
		
				System.out.println("Example of Implicit Casting:"+ "\n");
				
				int i = 53;
				
				//automatic conversion
				
				long l = i;
				float f = l;
				double d = f;
				
				System.out.println("Int value " + i);
				System.out.println("Long value " + l);
				System.out.println("Float value " + f);
				System.out.println("Double value " + d + "\n");
				
				//Example of Explicit Casting
				
				System.out.println("Example of Explicit Casting:"+ "\n");
						
				double d1 = 130.75;
						
				//automatic conversion
						
				long l1 = (long)d1;
				float f1 = (float)l1;
				int i1 = (int)f1;
				short s1 = (short)i1;
				byte b1 = (byte)s1;
						
				System.out.println("Double value " + d1);
				System.out.println("Float value " + f1);
				System.out.println("Long value " + l1);
				System.out.println("Int value " + i1);
				System.out.println("Short value " + s1);
				System.out.println("Byte value " + b1);
				
				
				// String to Primitive Data
				
				System.out.println("Example of String to Primitive data conversion:"+ "\n");
				
				
				String s2 = "567";
				
				int i2 = Integer.parseInt(s2);
				float f2 = Float.parseFloat(s2);
				
				System.out.print("i2 = " + i2 + " and f2 = " + f2);

	}

}
