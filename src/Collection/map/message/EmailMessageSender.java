package Collection.map.message;

public class EmailMessageSender implements MessageSender{

	@Override
	public void sendMessage (String from, String to, String title, String content) {
		System.out.println("e-mail 메세지 발송");
		System.out.println("보내는 사람: " + from);
		System.out.println("받는사람: " + to);
		System.out.println("내용: " + content);
	}
}