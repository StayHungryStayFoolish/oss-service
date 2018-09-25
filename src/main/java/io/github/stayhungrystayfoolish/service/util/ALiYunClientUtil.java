package io.github.stayhungrystayfoolish.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

/**
 * Created by bonismo@hotmail.com on 2018/9/25 上午9:44
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public class ALiYunClientUtil {

    private static final Logger logger = LoggerFactory.getLogger(ALiYunClientUtil.class);

    public static HashMap<String, Object> upload(MultipartFile multipartFile) {
        logger.debug("Upload file is : {} .", multipartFile.getOriginalFilename());
        HashMap<String, Object> map = new HashMap<>();
    }
}


