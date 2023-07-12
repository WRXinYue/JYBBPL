package entity;

import lombok.Data;

@Data
public class Userinformation {
	private Integer userid;
	private String username;
	private String userphone;
	private Subparameter usersex;
	private Float userheight;
	private Float userweight;
}
