package com.dhc.api.service;

import com.dhc.api.dao.LoginDao;
import com.dhc.api.model.GoogleUser;
import com.dhc.api.model.User;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private static final String FROM_ADDRESS = "ssafystudy@gmail.com";


    public String getToken(final String authorize_code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://kauth.kakao.com/oauth/token";

        try {
            URL url = new URL(reqURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //    POST �슂泥��쓣 �쐞�빐 湲곕낯媛믪씠 false�씤 setDoOutput�쓣 true濡�

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            //    POST �슂泥��뿉 �븘�슂濡� �슂援ы븯�뒗 �뙆�씪誘명꽣 �뒪�듃由쇱쓣 �넻�빐 �쟾�넚
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=8d49647c4738cb1c7919b1734a1e2121");  //蹂몄씤�씠 諛쒓툒諛쏆� key
            sb.append("&redirect_uri=https://login.hawaiian-pizza.space/kakao_login");     // 蹂몄씤�씠 �꽕�젙�빐 �넃�� 寃쎈줈
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();

            //    寃곌낵 肄붾뱶媛� 200�씠�씪硫� �꽦怨�
            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            //    �슂泥��쓣 �넻�빐 �뼸�� JSON���엯�쓽 Response 硫붿꽭吏� �씫�뼱�삤湲�
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);

            //    Gson �씪�씠釉뚮윭由ъ뿉 �룷�븿�맂 �겢�옒�뒪濡� JSON�뙆�떛 媛앹껜 �깮�꽦
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            access_Token = element.getAsJsonObject().get("access_token").getAsString();
            refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();

            System.out.println("access_token : " + access_Token);
            System.out.println("refresh_token : " + refresh_Token);

            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return access_Token;

    }
    public HashMap<String, Object> getUserInfo (final String access_Token) {

        //    �슂泥��븯�뒗 �겢�씪�씠�뼵�듃留덈떎 媛�吏� �젙蹂닿� �떎瑜� �닔 �엳湲곗뿉 HashMap���엯�쑝濡� �꽑�뼵
        HashMap<String, Object> userInfo = new HashMap<>();
        String reqURL = "https://kapi.kakao.com/v2/user/me";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            //    �슂泥��뿉 �븘�슂�븳 Header�뿉 �룷�븿�맆 �궡�슜
            conn.setRequestProperty("Authorization", "Bearer " + access_Token);

            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
            JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();
            String nickname = properties.getAsJsonObject().get("nickname").getAsString();
            String profile_image = properties.getAsJsonObject().get("profile_image").getAsString();
            String email = kakao_account.getAsJsonObject().get("email").getAsString();
            String id = element.getAsJsonObject().get("id").getAsString();
            userInfo.put("nickname", nickname);
            userInfo.put("email", email);
            userInfo.put("profile_image", profile_image);
            userInfo.put("id",id);
            System.out.println(userInfo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error");
            e.printStackTrace();
        }

        return userInfo;
    }


    public String kakaoLogout (final String access_Token) {

        //    �슂泥��븯�뒗 �겢�씪�씠�뼵�듃留덈떎 媛�吏� �젙蹂닿� �떎瑜� �닔 �엳湲곗뿉 HashMap���엯�쑝濡� �꽑�뼵
        HashMap<String, Object> userInfo = new HashMap<>();
        String reqURL = "https://kapi.kakao.com/v1/user/logout";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            //    �슂泥��뿉 �븘�슂�븳 Header�뿉 �룷�븿�맆 �궡�슜
            conn.setRequestProperty("Authorization", "Bearer " + access_Token);

            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);
            return result;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error");
            e.printStackTrace();
        }

        return "logout fail";
    }

    public String getGithubToken(final String authorize_code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://github.com/login/oauth/access_token?";
        try {
            URL url = new URL(reqURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //    POST �슂泥��쓣 �쐞�빐 湲곕낯媛믪씠 false�씤 setDoOutput�쓣 true濡�

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Accept","application/json");

            //    POST �슂泥��뿉 �븘�슂濡� �슂援ы븯�뒗 �뙆�씪誘명꽣 �뒪�듃由쇱쓣 �넻�빐 �쟾�넚
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("&client_id=fd299d60e9868bcaf31f");  //蹂몄씤�씠 諛쒓툒諛쏆� key
            sb.append("&client_secret=98d6e0d9d70fb6262ad1e9f1eae79c90c47d43e7");     //
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();

            //    寃곌낵 肄붾뱶媛� 200�씠�씪硫� �꽦怨�
            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            //    �슂泥��쓣 �넻�빐 �뼸�� JSON���엯�쓽 Response 硫붿꽭吏� �씫�뼱�삤湲�
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);

            //    Gson �씪�씠釉뚮윭由ъ뿉 �룷�븿�맂 �겢�옒�뒪濡� JSON�뙆�떛 媛앹껜 �깮�꽦
            String t[] = result.split("&");
            for(int i = 0;i<t.length;i++){

            }
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            access_Token = element.getAsJsonObject().get("access_token").getAsString();

            System.out.println("access_token : " + access_Token);
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return access_Token;

    }
    public HashMap<String, Object> getGithubUserInfo (final String access_Token) {
        System.out.println("getGithubUserInfo");
        //    �슂泥��븯�뒗 �겢�씪�씠�뼵�듃留덈떎 媛�吏� �젙蹂닿� �떎瑜� �닔 �엳湲곗뿉 HashMap���엯�쑝濡� �꽑�뼵
        HashMap<String, Object> userInfo = new HashMap<>();
        String reqURL = "https://api.github.com/user";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            //    �슂泥��뿉 �븘�슂�븳 Header�뿉 �룷�븿�맆 �궡�슜
            conn.setRequestProperty("Authorization", "token " + access_Token);

            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            String result = "";

            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);

            String nickname = element.getAsJsonObject().get("login").getAsString();
            String id = element.getAsJsonObject().get("id").getAsString();
            String email = element.getAsJsonObject().get("html_url").getAsString();
            String profile_image = element.getAsJsonObject().get("avatar_url").getAsString();
            System.out.println("nickname : " + nickname);
            System.out.println("id : " + id);
            System.out.println("email : " + email);
            System.out.println("profile_image : " +profile_image);
            userInfo.put("nickname",nickname);
            userInfo.put("id",id);
            userInfo.put("email",email);
            userInfo.put("profile_image",profile_image);


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return userInfo;
    }
    public User googleLogin(GoogleUser guser){

        //todo :  user 媛��엯 �뿬遺� �솗�씤, �뾾�쓣�떆 媛��엯

        try{
            Optional<User> user = loginDao.findById(guser.getId());
            if(loginDao.findById(guser.getId()).isPresent()){
                System.out.println("user login");
            }
            else
            {
                System.out.println("test");
                loginDao.save(new User());
                System.out.println("test success");
                User suser = new User();
                System.out.println("save");
                suser.setId(guser.getId());
                suser.setEmail(guser.getEmail());
                suser.setLogintype("google");
                suser.setName(guser.getName());
                suser.setToken(guser.getAccess_token());
                suser.setProfileimage(guser.getProfile_image());
                System.out.println(suser);
                loginDao.save(suser);
                System.out.println("save");
            }
            return user.get();
        }
        catch (Exception e)
        {
            User suser = new User();
            System.out.println("user join");
            suser.setId(guser.getId());
            suser.setEmail(guser.getEmail());
            suser.setLogintype("google");
            suser.setName(guser.getName());
            suser.setToken(guser.getAccess_token());
            suser.setProfileimage(guser.getProfile_image());
            loginDao.save(suser);
            return suser;
        }

    }

    // 濡쒖뺄 濡쒓렇�씤 遺�遺�
    public boolean overLapCheck(String id){
        try{
            if(loginDao.findById(id).isPresent()){
                return true;
            };
            return false;
        }
        catch (Exception e){

            return false;
        }
    }

    public User localSignIn(String id,String pwd){

        try{
            Optional<User> ret = loginDao.findById(id);
            if(ret.isPresent()){
                if(passwordEncoder.matches(pwd,ret.get().getPwd()))
                    return ret.get();
                else
                    System.out.println(pwd+": password fail");
            }
            else
                System.out.println(id+": id fail");
            return null;
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
        return null;
    }
   
    // �씤利� �떆�룄, �꽦怨듭떆 �옱濡쒓렇�씤
    public boolean localCertify(String id,String code){
        Optional<User> ret = loginDao.findByIdAndCertifycode(id,code);
        try{
            if(ret.isPresent()){
                User user = ret.get();
                user.setCertified("true");
                loginDao.save(user);
                //硫붿씪�쟾�넚
                return true;
            }
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
        return false;
    }

}
