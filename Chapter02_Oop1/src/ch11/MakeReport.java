package ch11;

public class MakeReport {

    StringBuffer sb = new StringBuffer();

    private String line = "===========================\n";
    private String title = " 이름\t		주소\t\t	전화번호	\n";

    private void makeHeader() {
        sb.append(line);
        sb.append(title);
        sb.append(line);
    }

    private void generateBody() {
        sb.append("Compose \t");
        sb.append("Seoul Korea \t");
        sb.append("010-123-456\n");

        sb.append("Ediya \t");
        sb.append("NewYork US \t");
        sb.append("010-789-000\n");
    }

    private void makeFooter() {
        sb.append(line);
    }

    // 클라이언트에 제공되는 메서드
    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();

        return sb.toString();
    }
}
