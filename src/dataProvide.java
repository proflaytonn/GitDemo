import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {
	
	
	
	@Test
	public void testCaseData()
	{
		//ini project error
	}
	
	
	
	
	@DataProvider
	public void getData()
	{
		//Object[][] data = {};
		Object[][] data = {{"tes"},{"yaaa"}};
	}
	
	@DataProvider
	public void dataDummyForMerging()
	{
		//di developBranch ini method tidak ada
	}
	
}
