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
            Credential cred = new Credential("AKIDGK9hzB6l9G8j48wShfOq1vYuzmIYYGhs", "vZv0pRnsgDTSBeZDZfT0GFyRdYCZgW5N");

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