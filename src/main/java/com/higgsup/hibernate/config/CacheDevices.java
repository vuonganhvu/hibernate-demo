package com.higgsup.hibernate.config;

import com.higgsup.hibernate.entity.DevicesToken;
import org.springframework.cache.support.AbstractValueAdaptingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by anhvu on 23-Apr-18.
 */
public class CacheDevices {

    private static Map<String, DevicesToken> cacheDevices = new HashMap<>();

    public static Map<String, DevicesToken> getCacheDevices() {
        return cacheDevices;
    }

    public static void putDevices(String token, DevicesToken devicesToken) throws Exception {
        if(cacheDevices.containsKey(token)){
            throw new Exception("Logined");
        }
        cacheDevices.put(token, devicesToken);
    }

    public static DevicesToken getDevices(String token) {
        return cacheDevices.get(token);
    }
}
