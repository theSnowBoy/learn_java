import java.util.ArrayList;

public class InterView2 {

	public static class QueueImpl{
		int back = 0;
		int front = 0;
		int size = 0;
		int capacity = 100;
		String[] queue = new String[capacity];
		double ratio = 0.5;//表示元素占用了多少比率的capacity. size / capacity 
		
		
		public void Enqueue(String e){
			if(size == capacity){
				Enlarge();//扩容
				return;
			}
			queue[back]= e;
			back = (back +1) % capacity;
			size++;
		}
		private void Enlarge(){
			reArrange((int)(capacity*1.25)); 
		}
		
		private void Scale(){
			 reArrange((int)(size * 1.25));
		}
		
		private void reArrange(int newCapacity){
			String[] dataNew = new String[newCapacity];
			for(int i = 0; i < size;i++){
				dataNew[i] = queue[front];
				front = (front +1) % capacity;
			}
			queue = dataNew;
			back = size-1;
			front = 0;
			capacity = newCapacity;
		}
		
		public String Dequeue(){
			if(size == 0){
				return null;
			}
			String result = queue[front];
			front = (front+1)%capacity;
			size--;
			//缩减？
			if(size*1.0/capacity < 0.5){
				Scale();
			}
			return result;
		} 
		public String Peek(){
			if(size != 0){
				return queue[front];
			}
			return null;
		}
		public String BackPeek(){
			if(size!=0){
				return queue[back];
			}
			return null;
		}
	}
	
}
