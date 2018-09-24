package io.github.stayhungrystayfoolish.service;

import io.github.stayhungrystayfoolish.web.rest.vm.oss.OSSMetadataVM;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by bonismo@hotmail.com on 2018/9/24 下午11:29
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public interface OSS_Service {

    OSSMetadataVM upload(MultipartFile file, String packageName);

    String getUrlByName(String name, String packageName);

    void deleteByName(String name, String packageName);
}


