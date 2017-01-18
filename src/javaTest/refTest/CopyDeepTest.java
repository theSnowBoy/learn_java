package javaTest.refTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javaTest.refTest.CopyTestClass.Position;

public class CopyDeepTest {

	public static void main(String[] args) throws Exception {
		Position first = new Position(1, 1, 1);
		first.layerAndBranch.put(55, 66);
		System.out.println(first.toString());

		Position second = (Position) first.deepCopy();

		second.layer = 2;
		second.layerAndBranch.put(55, 0);
		System.out.println(first.toString());
		System.out.println(second.toString());
	}

	public static class Position implements Serializable {
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
			return "[" + super.toString() + "]\n" + layer + "-" + currentBranch + "-" + positionInBranch + "\n"
					+ "map: " + 55 + " ---> " + layerAndBranch.get(55);
		}

		public Object deepCopy() throws Exception {
			// 该对象序列化成流,流中的对象是 虚拟机中对象的一个完整的拷贝。（包括：基本类型，其他成员对象）
			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeObject(this);

			// 流转化为对象
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());

			ObjectInputStream ois = new ObjectInputStream(bis);

			return ois.readObject();
		}
	}
}
