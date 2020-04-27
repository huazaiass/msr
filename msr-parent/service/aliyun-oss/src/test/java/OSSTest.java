import com.aliyun.oss.OSSClient;
import org.junit.Test;

/**
 * 测试OSS的bucketName是否可以创建
 */
public class OSSTest {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    String endpoint = "oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    String accessKeyId = "LTAI4Fpa7tdsRDwqcjJXfutL";
    String accessKeySecret = "FOiTcdX53qpn3i63hnWayAzIT2BqPP";
    String bucketName = "msr-system3";

    @Test
    public void testCreateBucket() {

        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        // 创建存储空间。
        ossClient.createBucket(bucketName);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}