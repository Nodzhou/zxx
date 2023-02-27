package com.bonade.sdk.opencenter.utils;

import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JwtUtil {

    public static final String BASE64_SECURITY = "BONADE";

    public static JSONObject parseJWT(String jsonWebToken, String base64Security) {
        /**
         * json
         * {
         *     "clientId": "a9d6ee67626c454aaee93f6beeba29d5",
         *     "exp": 1652928858,
         *     "user_name": "a9d6ee67626c454aaee93f6beeba29d5",
         *     "jti": "8c13f337-3fbe-48cc-9dda-0f7e9fd8c11d",
         *     "client_id": "a9d6ee67626c454aaee93f6beeba29d5",
         *     "scope": ["read", "write", "server", "薪企服"]
         * }
         */
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(base64Security.getBytes())
                    .parseClaimsJws(jsonWebToken).getBody();
            return (JSONObject) JSONObject.toJSON(claims);
        } catch (Exception ex) {
            // token过期
            return null;
        }
    }

    public static JSONObject parseJWT(String jsonWebToken) {
        return parseJWT(jsonWebToken, BASE64_SECURITY);
    }

    public static void main(String[] args) {
        Map<String,String> g= new HashMap<>();
        g.put("2","3333");
       g.put(null,null);
        System.out.println("g .containsKey="+g.containsKey(6));
        Set<String> sd= new HashSet<>();
        sd.add(null);
        sd.add(null);
        System.out.println("sd.size()="+sd.size());
    }
}