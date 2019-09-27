
public class TileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile[] testArray = new Tile[5];
		
		
		testArray[0] = new Tile("z", 10);
		testArray[0].printTile(testArray[0]);

		testArray[1] = new Tile("e", 10); 

		testArray[2] = new Tile("b", 10);

		testArray[3] = new Tile("r", 10); 

		testArray[4] = new Tile("a", 10);

		for (int i=0; i <= testArray.length; i++) {
		System.out.print(testArray[i].getLetter() + " ");
		}
}
}
