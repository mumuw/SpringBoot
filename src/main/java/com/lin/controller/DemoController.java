package com.lin.controller;

import com.lin.XmlUtils;
import com.lin.bean.AuthRequest;
import com.lin.config.AuthorConfig;
import com.lin.wsdl.KiasSvc;
import com.lin.wsdl2.KiasSvcSoap;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class DemoController {

    @Autowired
    private AuthorConfig authorConfig;


    @Resource(name = "insuranceWebService")
    private KiasSvcSoap kiasSvcSoap;
    private static final QName SERVICE_NAME = new QName("http://inslab.ru/", "kiasSvc");

    @RequestMapping("/")
    public String testConfigurationProperties() throws MalformedURLException {
        URL url = new URL("https://rep.absolutins.ru/FrontSvcRep/kiassvc.asmx?WSDL");
//        logger.info("requestEmailAndModify end with url.{}",url);

        AuthRequest authRequest = new AuthRequest();
        AuthRequest.Params params = new AuthRequest.Params();
        params.setName("Voshod");
        params.setPwd("9abd71a0dbf0eeff2463f0d8e6938d153a673a9f587b403fced6ff88dc171a401a768f8bf203f57b3d0cbfc7c3560d272038f3288f9604c43f9a79014f1cb4e3");
        params.setSid("");
        authRequest.setParams(params);
        authRequest.setAppId(221392);
        authRequest.setRequestIp("183.14.29.140");
        authRequest.setReqName("Auth");
        String xle ="<![CDATA[<data>" +  XmlUtils.toXml(authRequest)  + "</data>]]>";
        System.out.println(xle);


        System.out.println( kiasSvcSoap.execProc(xle));

//        try {
//            JaxWsProxyFactoryBean bean=new JaxWsProxyFactoryBean();
//            bean.setAddress("https://rep.absolutins.ru/FrontSvcRep/kiassvc.asmx?WSDL");
//
//            bean.setServiceClass(KiasSvc.class);
//            bean.setUsername("Voshod");
//            bean.setPassword("555b8d85cef");
//            KiasSvc port=(KiasSvc) bean.create();//得到service。
//
//            System.out.println(port.getKiasSvcSoap().execProc(xle));
////            logger.info("111111111111111111122222");
////            logger.info("111111111111111111122222{}",port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()));
//
//
////            URL url = new URL("https://rep.absolutins.ru/FrontSvcRep/kiassvc.asmx?WSDL");
////            KiasSvc ss = new KiasSvc(url, SERVICE_NAME);
////            KiasSvcSoap port = ss.getKiasSvcSoap12();
////            return new LightningResponse(0,port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()) + "..........................." + port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()));
//        } catch (Exception e) {
//            e.printStackTrace();
////            logger.info("requestEmailAndModify end with exception.{}",e.getMessage());
////
////            logger.error("requestEmailAndModify end with exception.",e);
//            return null;
//        }


//        KiasSvc ss = new KiasSvc(url, SERVICE_NAME);
//        KiasSvcSoap port = ss.getKiasSvcSoap12();
//        System.out.println("Invoking execProcJson..." + port.execProcJson(testModifyEmailMessage.getParam()));



//        logger.info("111111111111111111122222{}",port.execProcJson(testModifyEmailMessage.getParam()));



        return authorConfig.getName() + authorConfig.getAge();
    }

//    public static void main(String[]args){
////        AuthRequest authRequest = new AuthRequest();
////        AuthRequest.Params params = new AuthRequest.Params();
////        params.setName("Voshod");
////        params.setPwd("9abd71a0dbf0eeff2463f0d8e6938d153a673a9f587b403fced6ff88dc171a401a768f8bf203f57b3d0cbfc7c3560d272038f3288f9604c43f9a79014f1cb4e3");
////        params.setSid("");
////        authRequest.setParams(params);
////        authRequest.setAppId(221392);
////        authRequest.setRequestIp("183.14.29.140");
////        authRequest.setReqName("Auth");
////        String xle = XmlUtils.toXml(authRequest);
////        System.out.println("<![CDATA[<data>" + xle + "</data>]]>");
//
//
//
//
//
//        AuthRequest authRequest = new AuthRequest();
//        AuthRequest.Params params = new AuthRequest.Params();
//        params.setName("Voshod");
//        params.setPwd("9abd71a0dbf0eeff2463f0d8e6938d153a673a9f587b403fced6ff88dc171a401a768f8bf203f57b3d0cbfc7c3560d272038f3288f9604c43f9a79014f1cb4e3");
//        params.setSid("");
//        authRequest.setParams(params);
//        authRequest.setAppId(221392);
//        authRequest.setRequestIp("80.240.137.117");
//        authRequest.setReqName("Auth");
//        String xle ="<![CDATA[<data>" +  XmlUtils.toXml(authRequest)  + "</data>]]>";
//        System.out.println(xle);
////        strHtml.getBytes("utf-8")
////        kiasSvcSoap.execProc();
//
//
//        try {
//            JaxWsProxyFactoryBean bean=new JaxWsProxyFactoryBean();
//            bean.setAddress("https://rep.absolutins.ru/FrontSvcRep/kiassvc.asmx?WSDL");
//
//            bean.setServiceClass(KiasSvcSoap.class);
//            bean.setUsername("Voshod");
//            bean.setPassword("555b8d85cef");
//            KiasSvcSoap port=(KiasSvcSoap) bean.create();//得到service。
//
//            System.out.println("111111111111111111122222");
//            System.out.println("111111111111111111122222:::" + port.execProc(xle).getContent());
////            logger.info("111111111111111111122222");
////            logger.info("111111111111111111122222{}",port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()));
//
//
////            URL url = new URL("https://rep.absolutins.ru/FrontSvcRep/kiassvc.asmx?WSDL");
////            KiasSvc ss = new KiasSvc(url, SERVICE_NAME);
////            KiasSvcSoap port = ss.getKiasSvcSoap12();
////            return new LightningResponse(0,port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()) + "..........................." + port.getKiasSvcSoap().execProc(testModifyEmailMessage.getParam()));
//        } catch (Exception e) {
//            e.printStackTrace();
////            logger.info("requestEmailAndModify end with exception.{}",e.getMessage());
////
////            logger.error("requestEmailAndModify end with exception.",e);
//
//        }
//
//



//    }
}
