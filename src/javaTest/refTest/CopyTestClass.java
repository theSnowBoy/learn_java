package javaTest.refTest;

import java.util.HashMap;
import java.util.Map;

public class CopyTestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		//1.����һ������first,���Ҹ����Ա������ֵ��
		Position first = new Position(1, 1, 1);
		first.layerAndBranch.put(55, 66);
		System.out.println(first.toString());
		
		//2.ʹ�ø��Ʒ��������ҽ����ƽ�� �������� second.
		Position second = (Position) first.clone();
		
		//3.��second�����У��Գ�Ա���������޸ġ�
		// 3.1.����second�еĻ������͡�
		second.layer = 2;
		// 3.2.����second�е�map��
		second.layerAndBranch.put(55, 0);
		//4.��������
		System.out.println(first.toString());
		System.out.println(second.toString());
	}

	//position ����Ϊ�˾�̬�ڲ��ࡣ��ʵ��clone������
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
