/* Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable 
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area. 
*/

class BoxDemo06
{   
    int height, width, breadth;

    public BoxDemo06(int x, int y, int z) {
        height = x;
        width = y;
        breadth = z;
    }
   
    public BoxDemo06()
    {
        height = width = breadth = 0;
    }

    public void display() {

        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth" + breadth);
    }
    
    public int getArea()
    {
        return width * breadth;
    }

    public int getVolume()
    {
        return height * width * breadth;
    }

    public static void main(String args[]) {
        
        BoxDemo06 b1 = new BoxDemo06(5, 2, 3);
        BoxDemo06 b2 = new BoxDemo06(3, 4, 5);

        
        System.out.println("Volume of Box 1 : " + b1.getVolume());
        System.out.println("Volume of Box 2 : " + b2.getVolume());
        
        System.out.println("Area of Box 1 :"+ b1.getArea());
        System.out.println("Area of Box 2 :"+ b2.getArea());
    }
}

/*OUTPUT:

Volume of Box 1 : 30
Volume of Box 2 : 60
Area of Box 1 :6
Area of Box 2 :20

*/