package defpackage;

import com.alipay.android.phone.mobilecommon.multimediabiz.biz.utils.LogItem;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taobao.accs.common.Constants;
import com.taobao.tao.remotebusiness.js.MtopJSBridge.MtopJSParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fft reason: default package */
/* compiled from: ProductNetworkConverter */
public final class fft extends ffq {
    private static final Map<String, String> a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(24);
        a = concurrentHashMap;
        concurrentHashMap.put("x-sid", Constants.KEY_SID);
        a.put("x-t", LogItem.MM_C15_K4_TIME);
        a.put("x-appkey", "appKey");
        a.put("x-ttid", "ttid");
        a.put("x-utdid", "utdid");
        a.put("x-sign", "sign");
        a.put("x-nq", "nq");
        a.put("x-nettype", "netType");
        a.put("x-pv", "pv");
        a.put("x-uid", Oauth2AccessToken.KEY_UID);
        a.put("x-umt", "umt");
        a.put("x-reqbiz-ext", "reqbiz-ext");
        a.put("x-mini-wua", "x-mini-wua");
        a.put("x-features", "x-features");
        a.put("x-app-ver", "x-app-ver");
        a.put("x-orange-q", "x-orange-q");
        a.put(MtopJSParam.USER_AGENT, MtopJSParam.USER_AGENT);
        a.put("x-c-traceid", "x-c-traceid");
        a.put("f-refer", "f-refer");
        a.put("x-netinfo", "x-netinfo");
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> a() {
        return a;
    }
}
