package week1day2;

public class FriendDetails {

	public static void main(String[] args) {

		String friendName[]={"Mani","Isaac","Srini","Arjun","Raja"};
		long mobileNumbers[]={9940212345l,9940212346l,9940212347l,9940212348l,9940212349l};

		System.out.println("Names"+"\t "+"Mobile Numbers");

		for(int i=0;i<=4;i++)
		{
			System.out.println(friendName[i]+"\t "+mobileNumbers[i]);

		}

	}
}

