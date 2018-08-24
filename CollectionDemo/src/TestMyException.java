import com.exceptions.MyException;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		try {
		if(age<18)
		{
			throw new MyException("taggu :p"); // unless you throw the exception object, we can't handle it
		}
		}catch(MyException e) {
			e.printStackTrace();
		}
	}

}
