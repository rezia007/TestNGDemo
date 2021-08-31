package testng;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data={{"rezia.parvin@gmail.com","safeer007"},{"sajjad.mcc@gmail.com","jamalpur2000"}};
        return data;
    }
}
