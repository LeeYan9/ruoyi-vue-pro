package cn.iocoder.dashboard.modules.system.dal.redis;

import cn.iocoder.dashboard.framework.redis.core.RedisKeyDefine;
import cn.iocoder.dashboard.framework.security.core.LoginUser;

import java.time.Duration;

import static cn.iocoder.dashboard.framework.redis.core.RedisKeyDefine.KeyTypeEnum.STRING;

/**
 * Redis Key 枚举类
 *
 * @author 芋道源码
 */
public interface SysRedisKeyConstants {

    RedisKeyDefine LOGIN_USER = new RedisKeyDefine("登陆用户的缓存",
            "login_user:%s", // 参数为 sessionId
            STRING, LoginUser.class, Duration.ofMinutes(30));

    RedisKeyDefine CAPTCHA_CODE = new RedisKeyDefine("验证码的缓存",
            "captcha_code:%s", // 参数为 uuid
            STRING, String.class, RedisKeyDefine.TimeoutTypeEnum.DYNAMIC);

}
