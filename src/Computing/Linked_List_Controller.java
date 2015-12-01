package Computing;
import java.util.Scanner;
public class Linked_List_Controller {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Linked_List studentDataList = new Linked_List();
		studentDataList.insertFirst("Wendy", 100, "1Direction", true);
		studentDataList.insertFirst("Peter Pan", 18, "Little Mix", true);
		studentDataList.insertFirst("Captain Hook", 15, "Little Mix", true);
		studentDataList.insertFirst("Smee", 19, "Little Mix", true);
		studentDataList.displayList();
		
		System.out.println("******************************************************");

		
		for(int i=0;i<100;i++){
			System.out.println("Enter action you want to do (find/delete/insert/finish)? or whether you would like to finish");
			String y = sc.nextLine();
			if(y.equals("finish")){
				return;
			}else if(y.equals("find")){
				studentDataList.LinkFind();
				studentDataList.displayList();
				
			}else if(y.equals("delete")){
				studentDataList.LinkDeleteFirst();
				studentDataList.displayList();
				
			}else if(y.equals("insert")){
				System.out.println("Enter Name");
				String name = sc.nextLine();
				System.out.println("Enter Age");
				int age = sc.nextInt();
				System.out.println("Enter Favourite Band");
				String favBand = sc.nextLine();
				System.out.println("Enter whether the person is in a relationship on not (true/false)");
				boolean r = sc.nextBoolean();
				studentDataList.insertFirst(name, age, favBand, r);
				studentDataList.displayList();
			}else{
				System.out.println("Invalid");
			}
			}
		
			}
		}
	



