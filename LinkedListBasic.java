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
		list1 = tmp; // �� ���� �ּҸ� list1�� ����. ���� list1�� ù��° ���Ұ� �����.
		// �ι�° ����
		tmp = new LinkedList2();
		tmp.data = "Lee";
		tmp.link = null;
		list1.link = tmp; // 2��° ���Ҹ� ���� ����
		// ����° ����
		tmp = new LinkedList2();
		tmp.data = "Park";
		tmp.link = null;
		list1.link.link = tmp;
		System.out.print("list1 = (");
		System.out.print(list1.data + ", ");
		System.out.print(list1.link.data + ", ");
		System.out.println(list1.link.link.data + ")");
		// 1. list2 = ("apple", "strawberry", "orange", "banana", "melon") ������.

		tmp = new LinkedList2();
		tmp.data = "apple";
		tmp.link = null;
		list2 = tmp;
		tail = tmp; // last�� ������ ��带 ����Ų��
		tmp = new LinkedList2();
		tmp.data = "strawberry";
		tmp.link = null;
		tail.link = tmp;
		tail = tmp;

		// ����غ���. �� �ڵ带 �����ϸ� �� ������ ����.
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
		// ���ο� �����߰��϶�
		tmp = new LinkedList2();
		tmp.data = "pineapple"; tmp.link = list2;
		list2 = tmp;
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// ������
		// �ι�° ���Ҹ� �����϶�.
		list2.link = list2.link.link;
    
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2�� ������ ������ ����Ͽ� ����϶�.
		p = list2; int count = 0;
		while (p != null)
		{
			count = count+1;
			p = p.link;
		}
		System.out.println("����� ���� : " + count);
		System.out.println();
		// 5. list2�� �������� "durian"�� �߰��϶�
		tmp = new LinkedList2();
		tmp.data = "durian"; tmp.link = null;
		p = list2;
		while(p.link != null)
		{
			p = p.link;
		}
		p.link = tmp;

		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. ����° ������ "orange"�� "grape"�� �����϶�
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
