package setandmap;
import java.util.*;
public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		String text = "O. Henry was a pen name used by an American writer of "
				+ "short stories. His real name was William Sydney Porter. "
				+ "He was born in North Carolina in 1862."
				+ " As a young boy he lived an exciting life. "
				+ "He did not go to school for very long, "
				+ "but he managed to teach himself everything he needed to know. "
				+ "When he was about 20 years old, O. Henry went to Texas, "
				+ "where he tried different jobs. He first worked on a newspaper, "
				+ "and then had a job in a bank, when some money went missing from the bank "
				+ "O. Henry was believed to have stolen it. Because of that, "
				+ "he was sent to prison. During the three years in prison, "
				+ "he learned to write short stories. After he got out of prison, "
				+ "he went to New York and continued writing. He wrote mostly about "
				+ "New York and the life of the poor there. "
				+ "People liked his stories, because simple as the tales were, "
				+ "they would finish with a sudden change at the end, to the reader¡¯s surprise.";
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		String[] word = text.split("[ \n\t\t.,;:!?(){}]");
		
		for (int i = 0; i < word.length; i++) {
			String key = word[i].toLowerCase();
			if(word.length>0) {
			if(!map.containsKey(key)) {
				map.put(key, 1);
				}
			else {
				int value = map.get(key);
				value++;
				map.put(key, value);
				}
			}
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}
