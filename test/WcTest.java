import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class WcTest{

	@Test
	public void countChar_char_of_text(){
	String text = "This is a sample text file, We will be using it in our development of wc";
		Wc t1 = new Wc(text);
		assertEquals(72,t1.countChar());
	}

	@Test
	public void countChar_counts_char_for_empty_String_and_returns_0(){
		Wc t1 = new Wc("");
		assertEquals(0,t1.countChar());
	}

	@Test
	public void countChar_counts_char_for_white_space_and_returns_1(){
		Wc t1 = new Wc(" ");
		assertEquals(1,t1.countChar());
	}

	@Test
	public void countChar_counts_char_for_white_question_mark_and_returns_1(){
		Wc t1 = new Wc("?");
		assertEquals(1,t1.countChar());
	}

	@Test
	public void countChar_counts_char_for_dot_for_each_dot_and_returns_1(){
		Wc t1 = new Wc("seeta.ram.");
		assertEquals(10,t1.countChar());
	}

	@Test
	public void countChar_count_char_for_special_char(){
		Wc t1 = new Wc("!@#$%^&*()_+:<>?");
		assertEquals(16,t1.countChar());
	}	
	@Test
	public void countBytes_counts_bytes_of_texts(){
		String text = "This is a sample text file, We will be using it in our development of wc";
		Wc t1 = new Wc(text);
		assertEquals(72,t1.countBytes());
	}	
}
