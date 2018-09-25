package io.github.stayhungrystayfoolish.service.impl;

import com.aliyun.oss.OSSClient;
import io.github.stayhungrystayfoolish.config.ApplicationProperties;
import io.github.stayhungrystayfoolish.service.OSS_Service;
import io.github.stayhungrystayfoolish.web.rest.errors.BadRequestAlertException;
import io.github.stayhungrystayfoolish.web.rest.vm.oss.OSSMetadataVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by bonismo@hotmail.com on 2018/9/25 上午9:11
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
@Service
public class ALiYunServiceImpl implements OSS_Service {

    private final Logger logger = LoggerFactory.getLogger(ALiYunServiceImpl.class);

    private static String accessKey;
    private static String secretKey;
    private static String endpoint;
    private static String bucket;
    private static String aliPackage;

    private final ApplicationProperties properties;

    private static volatile OSSClient ossClient;

    public ALiYunServiceImpl(ApplicationProperties properties) {
        this.properties = properties;
        accessKey = properties.getOss().getaLiYun().getAccessKey();
        secretKey = properties.getOss().getaLiYun().getSecretKey();
        endpoint = properties.getOss().getaLiYun().getEndpoint();
        bucket = properties.getOss().getaLiYun().getBucket();
        aliPackage = properties.getOss().getaLiYun().getAliPackage();
    }

    private static  OSSClient getInstance() {
        if (ossClient == null) {
            synchronized (OSSClient.class) {
                if (ossClient == null) {
                    ossClient = new OSSClient(endpoint, accessKey, secretKey);
                    Runtime.getRuntime().addShutdownHook(new Thread(() -> ossClient.shutdown()));
                }
            }
        }
        return ossClient;
    }

    @Override
    public OSSMetadataVM upload(MultipartFile file, String packageName) {
        if (file.getSize() > 1024 * 1024 * 5) {
            throw new BadRequestAlertException("Upload File size must less than 5M .", "", "");
        }
        OSSMetadataVM metadata = new OSSMetadataVM();


        return metadata;
    }

    @Override
    public String getUrlByName(String name, String packageName) {
        return null;
    }

    @Override
    public void deleteByName(String name, String packageName) {

    }
}


