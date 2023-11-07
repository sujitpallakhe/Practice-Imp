package practice.mess.exceptions;

public class InvalidRegistrationDate extends MessException {

	private static final long serialVersionUID = 1L;

	public InvalidRegistrationDate(String errMsg) {
		super(errMsg);
	}
}
