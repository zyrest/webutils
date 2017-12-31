package xyz.zhouying.javautils.utils;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.net.URL;

/**
 * Created by 96428 on 2017/7/20.
 * This in TestWeixin, samson.common.utils
 */
public class ClassUtil {

    @Nullable
    public static File getResourcesFile(String fileName) {
        ClassLoader classLoader = ClassUtil.class.getClassLoader();

        URL file = classLoader.getResource(fileName);

        if (file == null) return null;

        return new File(file.getFile());
    }
}
