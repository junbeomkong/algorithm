package kog;

class LinkedList2 {
	String data;
	LinkedList2 link;
}

public class LinkedListBasic {

	public static void main(String[] ar) {
		// list1 = ("Kim", "Lee", "Park")
		LinkedList2 list1, list2;
		LinkedList2 tmp, tail, p;
		tmp = new LinkedList2();
		tmp.data = "Kim";
		tmp.link = null;
		list1 = tmp; // 찍어낸 빵의 주소를 list1에 저장. 드디어 list1에 첫번째 원소가 저장됨.
		// 두번째 원소
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2번째 원소를 끝에 연결
		// 세번째 원소
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");
		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") 만들어라.

		tmp = new LinkedList2();
		tmp.data = "apple";
		tmp.link = null;
		list2 = tmp;
		tail = tmp; // last는 마지막 노드를 가르킨다
		tmp = new LinkedList2();
		tmp.data = "strawberry";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		// 출력해보자. 이 코드를 이해하면 다 이해한 것임.
		p = list2;
		while (p != null) {
			System.out.print(" " + p.data);
			if (p.data == "orange") {
				p.data = "durian";
			}
			p = p.link;
		}
		System.out.println();

		tmp= new LinkedList2();
		tmp.data="apple"; tmp.link=null;
		list2 = tmp;
		
		tmp = new LinkedList2();
		tmp.data = "strawberry"; tmp.link = null;
		list2.link = tmp;
		
		tmp = new LinkedList2();
		tmp.data = "orange"; tmp.link = null;
		list2.link.link = tmp;
		
		tmp = new LinkedList2();
		tmp.data = "banana"; tmp.link = null;
		list2.link.link.link = tmp;
		
		tmp = new LinkedList2();
		tmp.data = "melon"; tmp.link = null;
		list2.link.link.link.link = tmp;
		// 선두에 원소추가하라
		tmp = new LinkedList2();
		tmp.data = "pineapple"; tmp.link = list2;
		list2 = tmp;
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// 만들어라
		// 두번째 원소를 제거하라.
		list2.link = list2.link.link;
    
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2의 원소의 개수를 계산하여 출력하라.
		p = list2; int count = 0;
		while (p != null)
		{
			count = count+1;
			p = p.link;
		}
		System.out.println("노드의 갯수 : " + count);
		System.out.println();
		// 5. list2의 마지막에 "durian"을 추가하라
		tmp = new LinkedList2();
		tmp.data = "durian"; tmp.link = null;
		p = list2;
		while(p.link != null)
		{
			p = p.link;
		}
		p.link = tmp;

		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. 세번째 원소인 "orange"를 "grape"로 변경하라
		p = list2;
		while(p.data != "orange")
		{
			p = p.link;
		}
		p.data = "grape";
		p = list2;
		while (p != null) {
			System.out.print(" " + p.data);
			if (p.data == "orange") {
				p.data = "durian";
			}
			p = p.link;
		}
		System.out.println();
	}
}
