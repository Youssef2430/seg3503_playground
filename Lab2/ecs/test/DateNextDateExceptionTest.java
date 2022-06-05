import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{

    private Date current;
    private Date expectedResult;

    public DateNextDateExceptionTest(int year, int month, int day, int expYear, int expMonth, int expDay)
	{
		this.current = new Date(year,month,day);
		this.expectedResult = new Date(expYear,expMonth,expDay);
	}


    @Parameters
	public static List<Integer[]> data( )
	{
		List<Integer[]> params = new LinkedList<Integer[]>( );
		params.add(new Integer[] { 1700,6,20,1700,6,21 });
		params.add(new Integer[] { 2005,4,15,2005,4,16 });
		params.add(new Integer[] { 1901,7,20,1901,7,21 });
		params.add(new Integer[] { 1500,2,17,1500,2,18 });
		return params;
	}

    @Test
	public void testDate()
	{
		Date actualDate = current.nextDate();
		Assert.assertEquals(expectedResult, actualDate);
	}


}