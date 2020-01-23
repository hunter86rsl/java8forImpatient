package r11.r11_01;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.util.List;

import r11.r11_02.BugReport;
import r11.r11_02.Reference;
import r11.r11_02.Test;

@interface Entity {}

@interface Param { String value(); }

@Target(ElementType.TYPE_PARAMETER)
@interface Immutable {}


public abstract class AnnotationDemo {
    @Test public void checkRandomInsertions() {}
    
    @Test(timeout=10000) 
    public void hopefullyNotTooSlowAlgo() {}
    
    class CacheTest {}

    @BugReport(showStopper=true,
        assignedTo="Henryk",
        testCase=CacheTest.class,
        status=BugReport.Status.CONFIRMED) 
    public void buggyMethod() {}
    
    @BugReport(reportedBy={"Henryk", "Franek"})
    public void anotherBuggyMethod() {}
    
    @BugReport(reportedBy="Henryk")
    public void yetAnotherBuggyMethod() {}
    
    @BugReport(ref=@Reference(id=11235811))
    public void andAnotherBuggyMethod() {}
    
    @Test
    @BugReport(showStopper=true, reportedBy="Jan")
    public void checkMoreRandomInsertions() {}
    
    @BugReport(showStopper=true, reportedBy="Jan")
    @BugReport(reportedBy={"Henryk", "Karol"})
    public void checkEvenMoreRandomInsertions() {}
    
    public abstract List<?> getList(String table);
    
    @Entity public class User {}
    @SuppressWarnings("unchecked") List<User> users = (List<User>) getList("users");
    public User getUser(@Param("id") String userId) { return null; }
    
    public class Cache<@Immutable V> {}
}