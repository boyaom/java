<<<<<<< HEAD
package translate;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.tmt.v20180321.TmtClient;
import com.tencentcloudapi.tmt.v20180321.models.*;

public class TextTranslate
{
    public static String getTranslateResult(String totranslate) {
        try{
            Credential cred = new Credential("yourid", "yourpassword");//去腾讯云申请，免费的

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("tmt.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            TmtClient client = new TmtClient(cred, "ap-beijing", clientProfile);
            //System.out.println(totranslate);
            TextTranslateRequest req = new TextTranslateRequest();
            req.setSourceText(totranslate);
            req.setSource("auto");
            req.setTarget("zh");
            req.setProjectId(0);
            TextTranslateResponse resp = client.TextTranslate(req);
            return resp.getTargetText();
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
=======
package translate;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.tmt.v20180321.TmtClient;
import com.tencentcloudapi.tmt.v20180321.models.*;

public class TextTranslate
{
    public static String getTranslateResult(String totranslate) {
        try{
            Credential cred = new Credential("yourid", "yourpassword");//去腾讯云申请，免费的

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("tmt.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            TmtClient client = new TmtClient(cred, "ap-beijing", clientProfile);
            //System.out.println(totranslate);
            TextTranslateRequest req = new TextTranslateRequest();
            req.setSourceText(totranslate);
            req.setSource("auto");
            req.setTarget("zh");
            req.setProjectId(0);
            TextTranslateResponse resp = client.TextTranslate(req);
            return resp.getTargetText();
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
>>>>>>> de337e8e25f858ff2c3d1c8bb6e3f3c96aa4eed9
