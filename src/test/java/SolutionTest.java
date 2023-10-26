import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numFactoredBinaryTreesTest1() {
        int[] arr = {2, 4};
        int expected = 3;
        int actual = new Solution().numFactoredBinaryTrees(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numFactoredBinaryTreesTest2() {
        int[] arr = {2, 4, 5, 10};
        int expected = 7;
        int actual = new Solution().numFactoredBinaryTrees(arr);

        Assert.assertEquals(expected, actual);
    }

}
