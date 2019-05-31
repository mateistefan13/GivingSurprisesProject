package surprise;
import java.util.Random;
import java.util.ArrayList;
public class FortuneCookie implements ISurprise{
	
	private static Random randomNumberGenerator = new Random();
	private String joyMessage;
	
	FortuneCookie(String message) {
		this.joyMessage = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("I have received a fortune cookie with the following message: " + this.joyMessage);
	}
	
	@Override
	public String toString() {
		return "Mesajul din ravas este: " + joyMessage + "";
	}
	
	public static FortuneCookie generate() {
		ArrayList<String> zicale = new ArrayList<>();
		zicale.add("Bate toba la Craiova, de s-aude în Moldova.");
		zicale.add("La fapta bună, puţini s-adună.");
		zicale.add("Învăţătura e lumină ce-ţi face viaţa mai senină.");
		zicale.add("Tot înşiră la gogoşi, spunând despre moşi, strămoşi.");
		zicale.add("Banul e o mică roată ce-nvârteşte lumea toată.");
		zicale.add("De ar fi moşu' cât de bătrân, tot ar mânca măr din sân.");
		zicale.add("Are şi el omenie ca căţeaua lui Ilie.");
		zicale.add("Şcoala este locul unde îţi ţeşi norocul.");
		zicale.add("Cu şchiopii în loc de şezi, te înveţi să şchiopătezi.");
		zicale.add("Strânge omul ca furnica, când moare, nu ia nimica.");
		zicale.add("Nu da binelui cu piciorul, că pe urmă îi duci dorul.");
		zicale.add("Tu-mi spui mie că raţa-mpunge, când ea măcăie şi fuge?");
		zicale.add("Mincinosu' roade osu'.");
		zicale.add("Prin muncă şi stăruinţă, vei ajunge la dorinţă.");
		zicale.add("Câte flori sunt pe pământ, toate se duc în mormânt.");
		zicale.add("Lumea e amăgitoare: ca o floare trecătoare, ca o apă curgătoare.");
		zicale.add("A fi domn nu-i lucru mare, a fi om e de mirare.");
		zicale.add("Dacă tăceai, filozof rămâneai.");
		zicale.add("Orice muncă e frumoasă, dacă e pe plac aleasă.");
		zicale.add("Soarele până se-nalţă, leneşul abia se-ncalţă.");
		
		return new FortuneCookie(zicale.get(FortuneCookie.randomNumberGenerator.nextInt(20))); 
	}
	
}
