import java.util.*;
public class LoLQuizJava {
	public static void main(String[] args) {
		System.out.println("Choose the letter of the correct answer.");
		items(0, 0);
	}
	public static void items(int num, int i) {
		Scanner s = new Scanner(System.in);
		String[][] quiz = {
				{"1. How many Champions did League of Legends start with?", "A. 20 Champions", "B. 40 Champions", "C. 35 Champions", "B"},
				{"2. When did League of Legends release?", "A. June 18, 2011", "B. August 17, 2009", "C. October 27, 2009", "C"},
				{"3. Which Champion has the ability 'Orb Of Deception'?", "A. Ahri", "B. Nami", "C. Evelynn", "A"},
				{"4. In the League of Legends World Championship, Which Esports Team has 3 Championship Titles, 2 Runners-up titles, and 2 Semifinalist Titles?", "A. GEN.G", "B. T1", "C. DAMWON", "B"},
				{"5. Which of these champions said, 'The darker the night, the brighter the stars'?", "A. Jax", "B. Braum", "C. Lux", "B"}
		};
		if (num == 5) {
			System.out.println("Congratulations, your score is: " + i);
		} else {
			for(int j=0; j<4; j++) {
				System.out.println(quiz[num][j]);
			}
			String answer = s.nextLine();
			if(answer.equalsIgnoreCase(quiz[num][4])) {
				i++;
			}
			items(num + 1, i);
		}
	}
}
