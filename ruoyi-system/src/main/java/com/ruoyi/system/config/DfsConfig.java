package com.ruoyi.system.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 文件配置
 *
 * @author zmr
 * @version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "dfs")
public class DfsConfig {
    /**
     * 路径
     */
    private String path;

    /**
     * 域名
     */
    private String domain;
}