package Lecture_20;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.addWord("art");
		trie.addWord("arts");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("see");
		trie.addWord("sea");
		trie.addWord("seen");

		trie.display();
		System.out.println(trie.search("artist"));

		trie.displayAstree();
		trie.remove("arts");
		trie.remove("art");
		System.out.println("************************");
		trie.displayAstree();
		
	}

}
