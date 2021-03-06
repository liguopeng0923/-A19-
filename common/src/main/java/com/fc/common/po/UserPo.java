package com.fc.common.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fc.common.po.status.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author 李国鹏
 * @version 1.0.0
 * @date 2021/3/2 13:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class UserPo {

    @TableId
    private Long id;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号（登陆账号）
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别枚举类
     */
    private Gender gender;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 删除时间
     */
    private Timestamp deleteTime;
}
