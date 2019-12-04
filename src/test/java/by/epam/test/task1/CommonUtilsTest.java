package by.epam.test.task1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
    assertThat(CommonUtils.toCapitalize("  kjhdfkjd lksdjflksdj  \n jhgjhg   "), is("Kjhdfkjd Lksdjflksdj Jhgjhg"));
  }
  
  
  
}
