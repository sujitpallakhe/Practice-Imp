package practice.mess.exceptions;

public class InvalidMail extends MessException
{
	private static final long serialVersionUID = 1L;
	
	public InvalidMail(String errMsg)
	{
		super(errMsg);
	}
}
