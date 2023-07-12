package entity;

import lombok.Data;

@Data
public class Userlogin {
	private Integer ulid;
	private String ulphone;
	private Userinformation userid;
	private String ulpassword;
	private Subparameter ulstatus;
	private Subparameter ullosure;
	private Purview ulpowerid;
	private Float ulbalance;
}
