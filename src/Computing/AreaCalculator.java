package Computing;

public class AreaCalculator {
	public class calculator {
		private float height = 0;
		private float width = 0;
		private float radius = 0;
		private float area = 0;
		
		
		public calculator(){
			
		}
		public float getheight(){
			return height;
		}
		public float getwidth(){
			return width;
		}
		public float getNumthree(){
			return width;
		}
		public void setheight(float height){
			this.height = height;
		}
		public void setwidth(float width){
			this.width = width;
		}
		public float square(){
		return height * height;
		}
		public float Rectangle(){
			return height * width;
		}
		public float Circle(){
			return (float) (radius * Math.PI * radius);
		}
		public float RightAngledTriangle (){
			return height * width/2;
		}
	}
}
