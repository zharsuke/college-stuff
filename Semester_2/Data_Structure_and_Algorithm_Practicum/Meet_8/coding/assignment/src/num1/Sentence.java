package num1;

public class Sentence {
    public String sentence;
    public int size, top;
    char [] data;

    public Sentence(String sentence) {
        this.sentence = sentence;
        size = sentence.length();
        data = new char[size];
        top = -1;
    }

    public void push(char dt) {
        top++;
        data[top] = dt;
    }

    public char pop() {
        char dt = data[top];
        top--;
        return dt;
    }
}
