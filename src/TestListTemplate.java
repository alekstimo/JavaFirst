import org.junit.Assert;
import org.junit.Test;

public class TestListTemplate {
    @Test
    public void TestSize()throws Exception{
        ListTemplate<Integer> list=new ListTemplate<>();
        list.addToHead(1);
        int s= list.size();
        Assert.assertEquals(1,s);
    }
    @Test
    public void TestIsEmpty()throws Exception{
        ListTemplate<Integer> list=new ListTemplate<>();
        list.addToHead(1);
        boolean e= list.isEmpty();
        Assert.assertEquals(false,e);
    }
    @Test
    public void TestEqual() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        ListTemplate<Integer> list2= new ListTemplate<>();
        list2.addToHead(1);
        list2.addToHead(2);
        list2.addToHead(3);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestAddList() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        ListTemplate<Integer> list2=new ListTemplate<>();
        list2.addToHead(2);
        list.addList(list2);
        ListTemplate<Integer> list3=new ListTemplate<>();
        list3.addToHead(2);
        list3.addToHead(1);
        if(list.Equals(list3))
            list3=list;
        Assert.assertEquals(list,list3);
    }
    @Test
    public void TestAddToHead() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        ListTemplate<Integer> list2= new ListTemplate<>(1);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestAddToTail()throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        ListTemplate<Integer> list2= new ListTemplate<>();
        list2.addToTail(1);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestAddAfterElem() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToTail(2);
        ListTemplate<Integer> list2= new ListTemplate<>();
        list2.addToHead(1);
        list2.addAfterElem(1,2);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestAddByIndex() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        ListTemplate<Integer> list2= new ListTemplate<>();
        list2.addToHead(1);
        list2.addToHead(3);
        list2.addByIndex(2,2);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestGet() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        int elem = list.get(2);
        Assert.assertEquals(2,elem);
    }
    @Test
    public void TestDeleteFromHead() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.deleteFromHead();
        ListTemplate<Integer> list2= new ListTemplate<>(1);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestDeleteFromTail() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.deleteFromTail();
        ListTemplate<Integer> list2= new ListTemplate<>(2);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestDeleteByIndex() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.deleteByIndex(2);
        ListTemplate<Integer> list2= new ListTemplate<>(3);
        list2.addToTail(1);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestDeleteElem() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.deleteElem(2);
        ListTemplate<Integer> list2= new ListTemplate<>(3);
        list2.addToTail(1);
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
    @Test
    public void TestClear() throws Exception{
        ListTemplate<Integer> list= new ListTemplate<>();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.clear();
        ListTemplate<Integer> list2= new ListTemplate<>();
        if (list.Equals(list2))
            list2=list;
        Assert.assertEquals(list,list2);
    }
}
