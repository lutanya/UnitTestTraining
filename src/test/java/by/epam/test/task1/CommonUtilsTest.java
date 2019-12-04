package by.epam.test.task1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CommonUtilsTest {

  @Test
  public void toCapitalizeShouldReturnEmptyStringIFParamNull() {
    assertThat(CommonUtils.toCapitalize(null), is(""));
  }

  @Test
  public void toCapitalizeShouldReturnEmptyStringIFParamEmptyString() {
    assertThat(CommonUtils.toCapitalize("             "), is(""));
  }

  @Test
  public void toCapitalizeShouldReturnStringWithFirstCapitalIFParamString() {
    assertThat(CommonUtils.toCapitalize("  heLLo wOrLD  \n !   "), is("Hello World !"));
  }

  @Test
  public void getArrayListFromStringShouldReturnEmptyListIfBothParamsIsNull() {
    assertThat(CommonUtils.getArrayListFromString(null, null).isEmpty(), is(true));
  }
  
  @Test
  public void getArrayListFromStringShouldReturnEmptyListIfOneOfParamsIsNull() {
    assertThat(CommonUtils.getArrayListFromString(null, "/'").isEmpty(), is(true));
    assertThat(CommonUtils.getArrayListFromString("One, two, 3, four", null).isEmpty(), is(true));
  }
  
  @Test
  public void getArrayListFromStringShouldReturnListIfBothParamsIsNotNull() {
    List<String> actual = CommonUtils.getArrayListFromString("One, two, 3, four", ",");
    List<String> expected = new ArrayList<String>(Arrays.asList("One","two","3","four"));
    Assert.assertEquals(actual, expected);
  }

}
