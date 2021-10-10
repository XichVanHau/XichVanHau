
public class Cow {
	double weight;
    String breed;
    String color;
    
	public Cow(double weight, String breed, String color) {
		super();
		this.weight = weight;
		this.breed = breed;
		this.color = color;
	}
	public void ThongTinConBo() {
		System.out.println("cân nặng: " + weight);
		System.out.println("giống: " + breed);
		System.out.println("màu: " + color);

	}
    
}
