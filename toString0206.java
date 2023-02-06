package edu.toString0206;

class Node
{
	public String data;
//	public String data = null;
	public Node link; //타입은 Node
	public String toString()
	{
		return "노드의 데이더 값은 "+ data +" 입니다";
	}
}

public class toString0206 {

	public static void main(String[] args) {
		Node node = new Node();
		node.data = "피카츄";
		System.out.println(node.toString());  //조상object의 toString()이 오버라이딩돼서 출력됨 

	}

}
