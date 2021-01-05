package board;

public class BoardVO {
//멤버변수
		//생성자
		//개터 세터
		//투스트링 오버라이딩
		private int BoardNum;
		private String name;
		private String pass;
		private String title;
		private String content;
		private String writeDate;
		
		//생성자
		// source => construtor using fields
		public BoardVO(int boardNum, String name, String pass, String title, String content, String writeDate) {
			super();
			BoardNum = boardNum;
			this.name = name;
			this.pass = pass;
			this.title = title;
			this.content = content;
			this.writeDate = writeDate;
		}
		//기본생성자
		public BoardVO() {
			
		}
		public int getBoardNum() {
			return BoardNum;
		}
		public void setBoardNum(int boardNum) {
			BoardNum = boardNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getWriteDate() {
			return writeDate;
		}
		//source => toString()
		@Override
		public String toString() {
			return "20102 [BoardNum=" + BoardNum + ", name=" + name + ", pass=" + pass + ", title=" + title
					+ ", content=" + content + ", writeDate=" + writeDate + "]";
		}
}
