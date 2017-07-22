package algorithmTest.basic.easy_5;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		if(flowerbed.length == 1){
			if(flowerbed[0] == 0){
				n--;
			}
			return n <= 0;
		}
		
		for(int i = 0;i < flowerbed.length;i++){
			if(i == 0){
				if(!(flowerbed[i] ==1) && !(flowerbed[i+1] == 1)){
					flowerbed[i] = 1;
					n--;
				}
				continue;
			}
			
			if(i == flowerbed.length -1){
				if(!(flowerbed[i] ==1) && !(flowerbed[i-1] == 1)){
					flowerbed[i] = 1;
					n--;
				}
				continue;
			}
			
			if(!(flowerbed[i] ==1) && !(flowerbed[i-1] == 1) && !(flowerbed[i+1] == 1)){
				flowerbed[i] = 1;
				n--;
			}
			
		}
		
		return n <= 0;

	}
}
