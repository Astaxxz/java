class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
double FtoC(double f){
  return (f - 32) * 5 / 9;
}

  //3: Sphere volume
double sphereVolume(double radius){
  return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
}
  
  //4: Cone volume
double coneVolume(double radius, double height){
  return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
}

  //5: Distance between two coordinate points

double distance(double x1, double y1, double x2, double y2){
  return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}

  
void init(){
  //1
  System.out.println("Enter your name ");
  String name = Input.readString();
  print("Welcome " + name);

  //2
  System.out.println("Enter temperature in Fahrenheit: ");
  double f = Input.readDouble();
  print("Celsius: " + FtoC(f));

  //3
  System.out.println("Enter radius of sphere: ");
  double r = Input.readDouble();
  print("Sphere volume: " + sphereVolume(r));

  //4
  System.out.println("Enter radius of cone: ");
  double cr = Input.readDouble();
  System.out.println("Enter height of cone: ");
  double ch = Input.readDouble();
  print("Cone volume: " + coneVolume(cr, ch));

  //5
  System.out.println("Enter x1, y1: ");
  double x1 = Input.readDouble();
  double y1 = Input.readDouble();
  System.out.println("Enter x2, y2: ");
  double x2 = Input.readDouble();
  double y2 = Input.readDouble();
  print("Distance: " + distance(x1, y1, x2, y2));
}
 
}