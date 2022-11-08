/* Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields. This class 
also has a method “volume()” to calculate the volume of this room. Create another class “RoomDemo” which will 
use the earlier class, create instances of rooms, and display the volume of room. */
class Room
{
	double height, width, breadth, cal;
	Room()
	{
	}
	Room(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	double volume()
	{
		cal = height*width*breadth;
		return cal;
	}
	
}
public class RoomDemo04
{
	public static void main(String []args)
	{
		Room rm1 = new Room(15,10,13);
		System.out.println("Volume of room : "+rm1.volume());
		Room rm2 = new Room(5.6,8.7,9.4);
		System.out.println("Volume of room : "+rm2.volume());
		
	}
}

/*Output:

Volume of room : 1950.0
Volume of room : 457.96799999999996

*/