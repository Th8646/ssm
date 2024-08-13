package com.wpt.spring.annotation;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 21:30
 */

import com.wpt.spring.component.UserService;
import com.wpt.spring.wptapplicationcontext.WptApplicationContext;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @projectName: spring
 * @package: com.wpt.spring.annotation
 * @className: WptSpringApplicationContext
 * @author: wpt
 * @description: 作用类似Spring原生容器
 * @date: 2024/8/1 21:30
 * @version: 1.0
 */
public class WptSpringApplicationContext {
    private Class configClass;
    //存放通过反射创建的对象
    private final ConcurrentHashMap<String, Object> ioc = new ConcurrentHashMap<>();

    public WptSpringApplicationContext(Class configClass) {
        this.configClass = configClass;
        System.out.println("this.configClass = " + configClass);

        //获取要扫描的包
        //1.得到配置类的注解  @ComponentScan(value = "com.wpt.spring.component")
        ComponentScan componentScan = (ComponentScan) this.configClass.getDeclaredAnnotation(ComponentScan.class);
        //2.通过componentScan得到value----要扫描的包
        String path = componentScan.value();
        System.out.println("要扫描的包 = " + path);

        // 获取扫描包下所有的class文件
        // 1.得到类的加载器
        ClassLoader classLoader = WptApplicationContext.class.getClassLoader();
        path = path.replace(".", "/");
        // 2.通过类加载器，获取要扫描包的url
        URL resource = classLoader.getResource(path);
        System.out.println("resource = " + resource);
        // 3.遍历获取路径下所有class文件---IO
        File file = new File(resource.getFile());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
//                System.out.println("===============================");
//                D:\wpt_spring\spring\spring\out\production\spring\com\wpt\spring\component\UserService.class
                //System.out.println(f.getAbsolutePath());
                //获取全类名 反射对象
                String fileAbsolutePath = f.getAbsolutePath();
                // 过滤筛选
                if (fileAbsolutePath.endsWith(".class")) {
                    // 1.获取全类名
                    String className = fileAbsolutePath.substring(fileAbsolutePath.lastIndexOf("\\") + 1, fileAbsolutePath.indexOf(".class"));
                    //System.out.println(className);
                    path = path.replace("/", ".");
                    String classFullName = path.concat("." + className);
                    //System.out.println(classFullName);
                    // 2.判断该.class文件是否进行注入
                    try {
                        // 得到了该类的Class对象
                        Class<?> aClass = classLoader.loadClass(classFullName);
                        if (aClass.isAnnotationPresent(Component.class) ||
                                aClass.isAnnotationPresent(Controller.class) ||
                                aClass.isAnnotationPresent(Service.class) ||
                                aClass.isAnnotationPresent(Repository.class)
                        ) {
                            //反射对象，并加入容器
                            Class<?> clazz = Class.forName(classFullName);
                            Object instance = clazz.newInstance();

                            ioc.put(StringUtils.uncapitalize(className),instance);
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        }
    }
    public Object getBean(String name){
        return  ioc.get(name);
    }
}
