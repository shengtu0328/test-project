package ras;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class MainTest {


    public static final String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCHpIjhye0Lr7hLKs7NlOnVpgt5wAmArmsgHf_9CEAXlIgouvavQNV5DVZfdELrPDS3m5hMA8Bo3UqGo4pQneZwch7WO6FLR_sJHnKAY74HHBz13JH-SLq9KZDOW-3gUWly0rGVGtmZX62DHWhERR3ibN0E3drkRksU7R_M240NDQIDAQAB";

    public static final String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIekiOHJ7QuvuEsqzs2U6dWmC3nACYCuayAd__0IQBeUiCi69q9A1XkNVl90Qus8NLebmEwDwGjdSoajilCd5nByHtY7oUtH-wkecoBjvgccHPXckf5Iur0pkM5b7eBRaXLSsZUa2ZlfrYMdaERFHeJs3QTd2uRGSxTtH8zbjQ0NAgMBAAECgYAjRaPaovmjOlSAJ2eTig-sYPtG86sE7VYqCeMRV13jQ9qMTOHs_L0GN3OoasEkDone3PUjfy4_lpvUmx5SjFzpqlDeLU7XUpZp_BySgFx4qx9PS5-c4ypqe4JBRmPOunJ_7aBrHSPxigx1mvkBabasj8qhlZ0dwX9-8Q6D5OeOOQJBANztvrm0TdkzS3qFzbeAA06AzHO3pEJN0LT05Qfey_7QLn_1otU6lPMkWI7JqQ9fzEt366J2HreXc5wUY0oxxWsCQQCdLODbG_-avNtBWAD7ZF1mFKjeq2qJi6IhE8XeD-dftY_pGKY1aXCM5IDhYUgou3-izdbcxsC2Ed6oLbzbXJ1nAkEAu-Ysb48NIu0Ahf1lIGts5Iig2s5WktnR5wXeARqZj2gKFGSbEBVZ941zEEYtVlkYzRr6OtuRdn4GIrooVEMObwJACtDx0GJG3sEsXXzO5H3tp364eEpXlIuVZq1Tqopxo7Z85s-ZcIeHBUscS2ZEbvkoOW3s4ViUHnNwXSZ4nqfq9QJAPKzJFibbXekih2K2_ocr8KE3-Z3fgr6h2UgtrxoSurhhMxia2Cxqp8k7X0X76B4bU2KIE0SE6qS3O6WA-PPrwg";


    public static void main(String[] args) throws Exception {
        String filepath="D:/tmp/";

        //生成公钥和私钥文件
        RSAEncrypt.genKeyPair(filepath);

        System.out.println("--------------公钥加密私钥解密过程-------------------");
        String plainText="ihep_公钥加密私钥解密";
        //公钥加密过程
        byte[] cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),plainText.getBytes());
        String cipher=Base64.encode(cipherData);
        //私钥解密过程
        byte[] res=RSAEncrypt.decrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)), Base64.decode(cipher));
        String restr=new String(res);
        System.out.println("原文："+plainText);
        System.out.println("加密："+cipher);
        System.out.println("解密："+restr);
        System.out.println();

        System.out.println("--------------私钥加密公钥解密过程-------------------");
        plainText="ihep_私钥加密公钥解密";
        //私钥加密过程
        cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),plainText.getBytes());
        cipher=Base64.encode(cipherData);
        //公钥解密过程
        res=RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)), Base64.decode(cipher));
        restr=new String(res);
        System.out.println("原文："+plainText);
        System.out.println("加密："+cipher);
        System.out.println("解密："+restr);
        System.out.println();

        System.out.println("---------------私钥签名过程------------------");
        String content="ihep_这是用于签名的原始数据";
        String signstr=RSASignature.sign(content,RSAEncrypt.loadPrivateKeyByFile(filepath));
        System.out.println("签名原串："+content);
        System.out.println("签名串："+signstr);
        System.out.println();

        System.out.println("---------------公钥校验签名------------------");
        System.out.println("签名原串："+content);
        System.out.println("签名串："+signstr);

        System.out.println("验签结果："+RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(filepath)));
        System.out.println();
    }
}
