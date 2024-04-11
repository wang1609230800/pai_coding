package com.github.paicoding.forum.core.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用常量
 *
 * @author Louzai
 * @date 2022/11/1
 */
public class CommonConstants {

    /**
     * 消息队列
     */
    public static final String EXCHANGE_NAME_DIRECT = "direct.exchange";
    public static final String QUEUE_KEY_PRAISE = "praise";
    public static final String QUEUE_NAME_PRAISE = "queue.praise";

    /**
     * 分类类型
     */
    public static final String CATEGORY_ALL             = "全部";
    public static final String CATEGORY_BACK_EMD        = "后端";
    public static final String CATEGORY_FORNT_END       = "前端";
    public static final String CATEGORY_ANDROID         = "Android";
    public static final String CATEGORY_IOS             = "IOS";
    public static final String CATEGORY_BIG_DATA        = "大数据";
    public static final String CATEGORY_INTELLIGENCE    = "人工智能";
    public static final String CATEGORY_CODE_LIFE       = "代码人生";
    public static final String CATEGORY_TOOL            = "开发工具";
    public static final String CATEGORY_READ            = "阅读";

    /**
     * 首页图片
     */
    public static final Map<String, List<String>> HOMEPAGE_TOP_PIC_MAP = new HashMap<String, List<String>>() {
        {
            put(CATEGORY_ALL, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/077b7d8891e69701e8d3d4302392dab5.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6f93d0ff95dba3f9a968d0920d347c2.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/39058ec85ab3e0a6a4ce442e6db8b8b.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/36f31ec5baf82e222a0172e1b1b354a.png");
                }
            });
            put(CATEGORY_BACK_EMD, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/077b7d8891e69701e8d3d4302392dab5.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/1217d3dd677d91cb65b0cc85769f7f3d.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/36f31ec5baf82e222a0172e1b1b354a.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/39058ec85ab3e0a6a4ce442e6db8b8b.png");
                }
            });
            put(CATEGORY_FORNT_END, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a4be72b8b6752eff93c4b39822bb49f.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6f93d0ff95dba3f9a968d0920d347c2.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/39058ec85ab3e0a6a4ce442e6db8b8b.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/36f31ec5baf82e222a0172e1b1b354a.png");
                }
            });
            put(CATEGORY_ANDROID, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/4eb9f0bad37ba5903ca9e249743e3ecb.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/5de37f5c879543bd17f031f4243fae7d.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6a810a33480fc3b42740713a6687f3fd.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6ed5aa120b7a06a5f4b5fe351adfda94.jpg");
                }
            });
            put(CATEGORY_IOS, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6f93d0ff95dba3f9a968d0920d347c2.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6ed5aa120b7a06a5f4b5fe351adfda94.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/7edcb3dd19d4d517be34a30bc082338d.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/989d3c1f73ee953a05347c0b99cba46d.jpg");
                }
            });
            put(CATEGORY_BIG_DATA, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/99ca3b142d901d9ca63946efca0122d8.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a4be72b8b6752eff93c4b39822bb49f.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a8cfe8140b683809a68205da76e77fb1.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/be98a2779d2dde96c40092bbae958864.jpg");
                }
            });
            put(CATEGORY_INTELLIGENCE, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/99ca3b142d901d9ca63946efca0122d8.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a4be72b8b6752eff93c4b39822bb49f.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a8cfe8140b683809a68205da76e77fb1.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/be98a2779d2dde96c40092bbae958864.jpg");
                }
            });
            put(CATEGORY_CODE_LIFE, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6f93d0ff95dba3f9a968d0920d347c2.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6ed5aa120b7a06a5f4b5fe351adfda94.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/7edcb3dd19d4d517be34a30bc082338d.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/989d3c1f73ee953a05347c0b99cba46d.jpg");
                }
            });
            put(CATEGORY_TOOL, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/4eb9f0bad37ba5903ca9e249743e3ecb.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/5de37f5c879543bd17f031f4243fae7d.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6a810a33480fc3b42740713a6687f3fd.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/6ed5aa120b7a06a5f4b5fe351adfda94.jpg");
                }
            });
            put(CATEGORY_READ, new ArrayList<String>() {
                {
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/99ca3b142d901d9ca63946efca0122d8.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a4be72b8b6752eff93c4b39822bb49f.png");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/a8cfe8140b683809a68205da76e77fb1.jpg");
                    add("http://pai-coding-wyj.oss-cn-guangzhou.aliyuncs.com/paicoding/%E9%A6%96%E9%A1%B5%E5%9B%BE%E7%89%87/be98a2779d2dde96c40092bbae958864.jpg");
                }
            });
        }
    };
}
