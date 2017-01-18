package javaTest.refTest;

import java.util.HashMap;
import java.util.Map;

public class CopyTestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		//1.创建一个对象first,并且给其成员变量赋值。
		Position first = new Position(1, 1, 1);
		first.layerAndBranch.put(55, 66);
		System.out.println(first.toString());
		
		//2.使用复制方法，并且将复制结果 给了引用 second.
		Position second = (Position) first.clone();
		
		//3.在second对象中，对成员变量进行修改。
		// 3.1.更改second中的基本类型。
		second.layer = 2;
		// 3.2.更改second中的map。
		second.layerAndBranch.put(55, 0);
		//4.输出结果。
		System.out.println(first.toString());
		System.out.println(second.toString());
	}

	//position 定义为了静态内部类。（实现clone方法）
	public static class Position implements Cloneable{
		public int layer;
		public int currentBranch;
		public int positionInBranch;
		public Map<Integer, Integer> layerAndBranch = new HashMap<Integer, Integer>();

		Position(int layer, int branch, int positionInBranch) {
			this.layer = layer;
			this.currentBranch = branch;
			this.positionInBranch = positionInBranch;
		}

		@Override
		public String toString() {
			return "[" + super.toString() + "]\n" + layer + "-" + currentBranch + "-" + positionInBranch +"\n"
		+ "map: " + 55 + " ---> " +layerAndBranch.get(55);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}
}
