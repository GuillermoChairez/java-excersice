public class PopulationProjection{
	public static void main(String[] args) {
		int population = 312032486;
		population = population + (60*60*24*365*5)/7;
		population = population - (60*60*24*365*5)/13;
		population = population + (60*60*24*365*5)/45;
		System.out.println(population);
	}
}