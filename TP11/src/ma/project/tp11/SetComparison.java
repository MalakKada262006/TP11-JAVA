package ma.project.tp11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
	public static void main(String[] args) {
		var data = Arrays.asList("Zèbre", "Avocat", "Banane");

		Set<String> hashSet = new HashSet<>(data);

		Set<String> linkedHashSet = new LinkedHashSet<>(data);

		Set<String> treeSet = new TreeSet<>(data);

		System.out.println("HashSet (non ordonné)              : " + hashSet);
		System.out.println("LinkedHashSet (ordre d'insertion)  : " + linkedHashSet);
		System.out.println("TreeSet (trié alphabétiquement)    : " + treeSet);
	}
}
