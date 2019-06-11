package day05;

import java.util.Vector;
import java.util.Scanner;

//Vector 성적처리 프로그램
/*1. 추가
 *2. 검색(이름)
 *3. 수정 이름(검색) -> 값 수정 총점, 평균도 바꿈
 *4. 삭제
 *5. 전체출력
 *6. 종료
 * */
public class StudentsManagement {
	public static void main(String []args) {
		Vector<Students> list = new Vector<Students>();
		Scanner scann = new Scanner(System.in);
		list.add(new Students("example01",10,20,30));
		list.add(new Students("example02",20,30,40));
		list.add(new Students("example03",30,40,50));
		boolean replay;
		do {
			replay=true;
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체출력  6. 종료");
			int select=scann.nextInt();
			switch(select) {
			case 1://추가
				Students s= new Students();
				int []arr = new int[3];
				System.out.println("name : ");
				String name=scann.next();
				s.setName(name);
				System.out.print("Kor : ");
				arr[0]=scann.nextInt();
				System.out.print("Eng : ");
				arr[1]=scann.nextInt();
				System.out.print("Math : ");
				arr[2]=scann.nextInt();
				s.setScore(arr);
				list.add(s);
			break;
			case 2://검색
				System.out.print("name : ");
				String name1 = scann.next();
				for(int i=0;i<list.size();i++){
					if(list.get(i).getName().equals(name1)) {
						System.out.println("name\t\t kor\t eng\t math\t sum\t avg");
						System.out.printf("%s\t %d\t %d\t %d\t %d\t%d",
								list.get(i).getName(),list.get(i).getScore()[0],list.get(i).getScore()[1],list.get(i).getScore()[2],
								list.get(i).getSum(),list.get(i).getAvg());
/*						System.out.println("name : "+list.get(i).getName());
						System.out.println("kor  : "+list.get(i).getScore()[0]);
						System.out.println("eng  : "+list.get(i).getScore()[1]);
						System.out.println("math : "+list.get(i).getScore()[2]);
						System.out.println("sum  : "+list.get(i).getSum());
						System.out.println("avg  : "+list.get(i).getAvg());*/
					}
				}
			break;	
			case 3://수정
				System.out.print("name : ");
				String name11 = scann.next();
				for(int i=0;i<list.size();i++){
					if(list.get(i).getName().equals(name11)) {
						Students s1= new Students();
						int []arr1 = new int[3];						
						System.out.print("name : ");
						s1.setName(scann.next());
						System.out.print("Kor : ");
						arr1[0]=scann.nextInt();
						System.out.print("Eng : ");
						arr1[1]=scann.nextInt();
						System.out.print("Math : ");
						arr1[2]=scann.nextInt();
						s1.setScore(arr1);
						list.add(i,s1);
						break;
					}
				}
					
			break;			
			case 4://삭제
				System.out.print("name : ");
				String name2 = scann.next();
				for(int i=0;i<list.size();i++){
					if(list.get(i).getName().equals(name2)) {
						list.remove(i);
					}
				}
			break;			
			case 5://전체출력
				System.out.println("name\t\t kor\t eng\t math\t sum\t avg");
				for(int i=0;i<list.size();i++){
					
					System.out.printf("%s\t %d\t %d\t %d\t %d\t%d",
							list.get(i).getName(),list.get(i).getScore()[0],list.get(i).getScore()[1],list.get(i).getScore()[2],
							list.get(i).getSum(),list.get(i).getAvg());
/*					System.out.println("name : "+list.get(i).getName());
					System.out.println("kor  : "+list.get(i).getScore()[0]);
					System.out.println("eng  : "+list.get(i).getScore()[1]);
					System.out.println("math : "+list.get(i).getScore()[2]);
					System.out.println("sum  : "+list.get(i).getSum());
					System.out.println("avg  : "+list.get(i).getAvg());*/
					System.out.println();
				}
			break;			
			case 6://종료
				replay=false;
			break;			
			default:
				System.out.println("miss index");
			
			}
		}while(replay==true);
	}

}
