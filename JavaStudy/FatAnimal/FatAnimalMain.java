package JavaStudy;

import java.util.Scanner;

public class FatAnimalMain {
	
	public static void main(String[]args) {
		
		Animal[] animals = new Animal[3];
//		Animal[] ani = {new Apple(), new Joonie(), new Cutie()};
		animals[0]= new Apple();
		animals[1]= new Joonie();
		animals[2]= new Cutie();
		
		Animal fatAni = null;
		PrintScript ps = new PrintScript();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println(ps.start);
		
		for(int i=0;i<animals.length;i++) {
			System.out.printf("%d. %s\n",i+1,animals[i]);
			}
		System.out.print("어떤 동물을 고르시겠어요? >> ");
		int choice = scan.nextInt();
		fatAni = animals[choice-1];
		
		System.out.println(ps.hello(fatAni.getaName()));
		int count = 0;
		while(fatAni.getaFat()<10) {
			System.out.print("선택>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1: if(count<3) {
				System.out.println(fatAni.eating());
				count++;
				} else {System.out.println("시러시러 취미활동 하고시퍼 !!");
				}
			
			break;
			case 2: System.out.println(fatAni.sleeping());
			break;
			case 3: System.out.println(fatAni.pooping());
			break;
			case 4: System.out.println(fatAni.hobby());
			if(count>0) { count--;}
			break;
			}
		}
		
		System.out.printf("%s 살찌우기 성공 !",fatAni.getaName());
		System.out.print("게임종료");
		
		

	
		
	}
	
	
}

