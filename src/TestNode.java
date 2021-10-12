import org.junit.Assert;
import org.junit.Test;

public class TestNode {
    @Test
    public void TestGetDataInt() throws Exception{
        Node<Integer> node=new Node<>(2);
        int elem=node.getData();
        Assert.assertEquals(2,elem);
    }
    @Test
    public void TestGetDataDbl() throws Exception{
        Node<Double> node=new Node<>(2.2);
        double elem=node.getData();
        Assert.assertEquals(2.2,elem,0);
    }
    @Test
    public void TestGetDataStr() throws Exception{
        Node<String> node=new Node<>("Hello");
        String elem = node.getData();
        Assert.assertEquals("Hello",elem);
    }
    @Test
    public void TestSetDataInt() throws  Exception{
        Node<Integer> node=new Node<>(3);
        node.setData(2);
        int elem=node.getData();
        Assert.assertEquals(2,elem);
    }
    @Test
    public void TestSetDataStr() throws  Exception{
        Node<String> node=new Node<>("World");
        node.setData("Hello");
        String elem=node.getData();
        Assert.assertEquals("Hello",elem);
    }
    @Test
    public void TestSetDataDbl() throws  Exception{
        Node<Double> node=new Node<>(3.2);
        node.setData(2.2);
        double elem=node.getData();
        Assert.assertEquals(2.2,elem,0);
    }
    @Test
    public void TestGetNext() throws Exception{
        Node<Integer> node=new Node<>(3);
        Node<Integer> node2=node.getNext();
        Assert.assertEquals(null,node2);
    }

}
