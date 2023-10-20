import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        System.out.println("ArrayList to lista, która pozwala przechowywać elementy zgodne z zadeklarowanym typem");
        List<String> lista = new ArrayList<>();
        lista.add("Jabłko");
        lista.add("Banan");
        lista.add("Gruszka");
        System.out.println(lista); // [Jabłko, Banan, Gruszka]

        System.out.println("HashSet to kolekcja, która przechowuje unikalne elementy w dowolnej kolejności");
        Set<Integer> zbior = new HashSet<>();
        zbior.add(1);
        zbior.add(2);
        zbior.add(1); // Ten element zostanie zignorowany, ponieważ jest duplikatem
        System.out.println(zbior); // [1, 2]

        System.out.println("HashMap to kolekcja typu klucz-wartość, która przechowuje pary obiektów");
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Jan", 25);
        mapa.put("Anna", 30);
        mapa.put("Marek", 28);
        System.out.println("Wiek Anny: " + mapa.get("Anna")); // Wiek Anny: 30

        System.out.println("LinkedList to lista dwukierunkowa, która pozwala na efektywne dodawanie i usuwanie elementów na początku, końcu i w środku listy.");
        // Wiek Anny: 30
        List<String> linkedLista = new LinkedList<>();
        linkedLista.add("Pierwszy");
        linkedLista.add("Drugi");
        linkedLista.add("Trzeci");
        System.out.println(linkedLista); // [Pierwszy, Drugi, Trzeci]
        linkedLista.remove(1); // Usuwa drugi element
        System.out.println(linkedLista); // [Pierwszy, Trzeci]

        System.out.println("TreeSet to kolekcja, która przechowuje unikalne elementy w porządku naturalnym lub według dostarczonego komparatora");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        System.out.println(treeSet); // [A, B, C] (uporządkowane alfabetycznie)
    }
}
