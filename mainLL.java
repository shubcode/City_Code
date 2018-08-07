import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

// Steve Hubrich
// Data Structures 
// Linked List Complete File

public class mainLL 
{
	public static void main(String args[]) throws IOException// beginning of program
	{
		long startTime = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
	
		
		
		// creating Linked List
		LinkedList<String> linesLL = new LinkedList<String>();
	
		int i;
		String line;
		String fileName = "cities.csv";
		File file = new File(fileName);
		int console = 0; // initialize console to zero
		int count = 0;
		try 
		{
			Scanner inputStream = new Scanner(file);
			inputStream.useDelimiter(",|\\s\\s+");
			
			
			
			while (inputStream.hasNext())
			{
			
				//Here is where the array needs to store the value
				line = inputStream.next();
				
			
				linesLL.add(line);
		
			}
			inputStream.close(); 

		}catch(FileNotFoundException noFile)
		{
			noFile.printStackTrace();
		} // end of try
		
		if (linesLL.isEmpty())
		{
			System.out.print("The List is not empty");
		}
		else
		{
			System.out.print("The List is Empty\n");
		}
		
		
		
		System.out.println("1. Insert\n2. Delete by name\n3. Delete by coords\n4. Search by name"
				+ "\n5. Search by coords\n6. Print within given dist"
				+ "\n7. Print all\n8. Exit"); // set up the initial menu
		
		
		

	
		while (console != 8) 
		{ // beginning of while
			
			System.out.println("Please enter 1-8\n");
			console = Integer.parseInt(scan.nextLine());
			switch (console) 
			{ // beginning of switch statement
			
			case 1:
				// Insert City Name, X Coordinate, Y Coordinate
				System.out.println("Insert Function");
				System.out.print("\nEnter the City Name , x(without decimal) coordinate, y(without decimal) coordinate:  ");
				String cityName = scan.nextLine();
		
				
				System.out.print("\nEnter the x coordinate: ");
				int x = Integer.parseInt(scan.nextLine());
				String addX = Integer.toString(x);
				
				System.out.print("Enter the y coordinate");
				int y = Integer.parseInt(scan.nextLine());
				String addY = Integer.toString(y);
				
				
				
				// adding the variables to the Array List
				
				linesLL.add(cityName);
				linesLL.add(addX);
				linesLL.add(addY);
				
				
				break;
				
				
			case 2:
				// Delete by searching City Name Function
				
				System.out.println("Delete by Name function");
				System.out.print("Please enter the city name that you wish to delete: ");
				cityName =scan.nextLine();
				//lines.remove(0);
				
				
				
					System.out.println("This is true");
					System.out.print("Removing  \n" + cityName);
					System.out.print("\nThis is the index " + linesLL.indexOf(cityName) + "\n");
					int indexOfCity = linesLL.indexOf(cityName);
					
					String deleteCity = cityName;
					//System.out.print("Removing... : " + lines.remove(deleteCity ));
					
					
						//System.out.print("Index of " + lines.indexOf(indexOfCity));
						while (count != 3)
						{
			
							
								linesLL.remove(indexOfCity);
								count++;
						
							
						}
					
					
					
					
					// this is the delete
					// lines.remove(cityName)
				
					
				break;
				
			case 3:
				// this function works
				// Delete by typing in Coords function
				System.out.println("Delete by coords function");
				System.out.print("Please enter the x(without decimal) coordinate of the city");
				x = Integer.parseInt(scan.nextLine());
				String deleteCoordsX = Integer.toString(x);
			
				
				System.out.print("Please enter the y(without decimal) coordinate of the city:  ");
				y = Integer.parseInt(scan.nextLine());
				String deleteCoordsY = Integer.toString(y);
				
				
				if (linesLL.contains(deleteCoordsX)&& linesLL.contains(deleteCoordsY));
				{
					
					
					// this is the code to get the previous element
					System.out.println("x coordinate entered: " + deleteCoordsX);
					int findCoordX = linesLL.indexOf(deleteCoordsX);
					linesLL.remove(findCoordX);
					linesLL.indexOf("index of x is: " + findCoordX);
					System.out.println("y coordinate entered: " + deleteCoordsY);
					int findCoordY = linesLL.indexOf(deleteCoordsY);
					linesLL.remove(findCoordY);
					findCoordX--;
					linesLL.remove(findCoordX);

				}
			
				
				
			
				break;
				
			case 4:
				
				// Type city name, get X / Y Coordinates Function
				System.out.println("Type in the City Name you wish to find : ");
				System.out.println("Enter the City name you wish to search for: ");
				String citySearch;
				citySearch = scan.nextLine();
				int findXY = linesLL.indexOf(citySearch);
				//while (count != 2)
				{
					//if (lines.contains(citySearch))
					//{
						System.out.println("The city you were looking for is found: " + citySearch);

						//for (i = findXY; i<lines.size();)
						//{
							System.out.println("Located at index: " + linesLL.indexOf(citySearch));
							findXY++;
							System.out.println("The first coordinate is: "+  linesLL.get(findXY));
							findXY++;
							System.out.println("The second coordinate is: "+  linesLL.get(findXY));
						
						
						//}
						
					//}
				
				}//end of while
				
							
				
				
				
				break;
				
				
			case 5:
				// this function works.  Some slight touching up wouldn't hurt it.
				// Enter Coordinates / get city name function
				
				System.out.println("Search by Coords function\n");
				System.out.print("Enter the x(without decimal) coordinate of the city: \n");
				x = Integer.parseInt(scan.nextLine());
				String searchCoordsX = Integer.toString(x);
				
				System.out.print("Enter the y(without decimal) coordinate of the city: \n");
				y = Integer.parseInt(scan.nextLine());
				String searchCoordsY = Integer.toString(y);
				// should probably include an if lines.contains statement here'
				
				// Do not need to know the y position because x comes before always
				//int findYCoord = lines.indexOf(searchCoordsY);
				System.out.println("The X Coordinate Entered: " + searchCoordsX);
				int findXCoord = linesLL.indexOf(searchCoordsX);
				System.out.println("The Y Coordinate Entered: " + searchCoordsY);
				findXCoord--;
				System.out.println("The city with the above Coordinates is: " + linesLL.get(findXCoord));
				long endTime=System.currentTimeMillis();
				System.out.println("That took " + (endTime - startTime) + "milliseconds");
				
				
				
				
				break;
				
				
				
				
			case 6:
				//iterates through LL and lists X, Y and City values
				System.out.println("Prints out city based on values of lat / long, then all cities in db forward.  Then exits");
				// get coordinate values
				System.out.println("Enter a 4 digit x coordinate\n");
				x = Integer.parseInt(scan.nextLine());
				String compareX = Integer.toString(x);
				int compareCoordX = linesLL.indexOf(compareX);
				
				System.out.println("Enter a 4 digit y coordinate\n");
				y = Integer.parseInt(scan.nextLine());
				String compareY = Integer.toString(y);
				int compareCoordY = linesLL.indexOf(compareY);
				
				for (i=0;i<linesLL.size();compareCoordX++)
				{
					
					System.out.println("The x coordinate You are At: "+ linesLL.get(compareCoordX));				
					System.out.println("The index is: "+compareCoordX);
					
					System.out.println("The y coordinate you are at: " + linesLL.get(compareCoordY));
					System.out.println("The index of the y coordinate: " + compareCoordY);
					compareCoordX--;
					compareCoordY++;
					compareCoordY++;
					compareCoordY++;
					System.out.println("The city of these coordinates is: "+ linesLL.get(compareCoordX));
					System.out.println("                                 ");
					compareCoordX++;
					compareCoordX++;
					compareCoordX++;
					System.out.println("                 ");
					
					if (compareCoordX >= linesLL.size())
					{
						System.out.println("Exiting the program. ");
						System.exit(0);
					}


				}
				
		
				
			case 7:
				System.out.println("Print all function");
				System.out.println("This is what is present in the Linked List");
				System.out.println("--------");
				System.out.print(linesLL + "\n");
				System.out.println("------------");
				break;
				
				
			case 8:
				System.out.println("Exit");
		
			
			
			} // end of switch statement and menu
			
			
		} // end of while statement
	
		
		scan.close();
		long endTime=System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + "milliseconds");
	}
	

}
