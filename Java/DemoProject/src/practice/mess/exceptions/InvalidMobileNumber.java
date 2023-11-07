package practice.mess.exceptions;

public class InvalidMobileNumber extends MessException
{
	private static final long serialVersionUID = 1L;
	
	public InvalidMobileNumber(String errMsg)
	{
		super(errMsg);
	}
	
}
