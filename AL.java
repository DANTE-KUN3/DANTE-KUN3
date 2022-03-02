public class AL{

public static void main(String[] args) {

Scanner sc=new Scanner(system.in);

System.out.println("Enter size of array: ");

int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Enter elements: ");

for(int i=0;i<arr.length;i++) { // accepting array elements

arr[i]=sc.nextInt();

}

int large=arr[0];

for(int i=1;i<arr.length;i++) { //finding the largest element in the list

if(large<arr[i])

large=arr[i];

}

System.out.println("Largest element is: "+large);

sc.close();

}

}