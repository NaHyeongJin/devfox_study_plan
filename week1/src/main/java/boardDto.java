package boardDto;

public class BoardDto {
	private String title, content, reg_id, reg_date, id, name, password, email, comment;
	private int no, no2;
	
	
	//댓글조회
	public BoardDto(String comment, String reg_id) {
		super();
		this.comment = comment;
		this.reg_id = reg_id;
	}


	//댓글등록
	public BoardDto(String comment, String reg_id, String reg_date, int no, int no2) {
		this.comment = comment;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
		this.no = no;
		this.no2 = no2;
	}


	//회원가입
	public BoardDto(String reg_date, String id, String name, String password, String email) {
		this.reg_date = reg_date;
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}


	//게시글 수정
	public BoardDto(String title, String content, String reg_id, String reg_date) {
		super();
		this.title = title;
		this.content = content;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
	}



	//게시글 상세보기
	public BoardDto(String title, String content, String reg_id, String reg_date, int no) {
		this.title = title;
		this.content = content;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
		this.no = no;
	}
	
	
	
	//게시글등록
	public BoardDto(int no, String title, String content, String reg_id, String reg_date) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
	}


	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getReg_id() {
		return reg_id;
	}

	public String getReg_date() {
		return reg_date;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getComment() {
		return comment;
	}



	public int getNo2() {
		return no2;
	}
	
	
}