
public interface Reporter {
	void writeArticle();
	void add(Reader r);
	String getState();
	void notifyEveryone();
}
