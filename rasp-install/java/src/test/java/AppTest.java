import com.baidu.rasp.App;
import com.baidu.rasp.RaspError;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author: anyang
 * @create: 2019/03/25 14:13
 */
public class AppTest {

    @Test
    public void testMain() {
        try {
            String[] installTomcat = {"-install", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installTomcat);
            String[] installBackup = {"-install", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087",
                    "-keepconf", "true"};
            App.main(installBackup);
            String[] uninstallTomcat = {"-uninstall", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/"};
            App.main(uninstallTomcat);

            String[] installJboss = {"-install", "/Users/anyang/Desktop/jacoco/sum/jboss-5.0.1.GA/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installJboss);
            String[] uninstallJboss = {"-uninstall", "/Users/anyang/Desktop/jacoco/sum/jboss-5.0.1.GA/"};
            App.main(uninstallJboss);

            String[] installResin4 = {"-install", "/Users/anyang/Desktop/jacoco/sum/resin-4.0.56/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installResin4);
            String[] uninstallResin4 = {"-uninstall", "/Users/anyang/Desktop/jacoco/sum/resin-4.0.56/"};
            App.main(uninstallResin4);

            String[] installResin3 = {"-install", "/Users/anyang/Desktop/jacoco/sum/resin-3.1.15/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installResin3);
            String[] uninstallResin3 = {"-uninstall", "/Users/anyang/Desktop/jacoco/sum/resin-3.1.15/"};
            App.main(uninstallResin3);

            String[] installJbossEAP = {"-install", "/Users/anyang/Desktop/jacoco/sum/jboss-as-7.1.1.Final/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installJbossEAP);
//        String[] uninstallJbossEAP = { "-uninstall", "/Users/anyang/Desktop/jacoco/sum/jboss-as-7.1.1.Final/"};
//        App.main(uninstallJbossEAP);

            String[] installWildfly = {"-install", "/Users/anyang/Desktop/jacoco/sum/wildfly-8.0.0.Final/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            App.main(installWildfly);
//        String[] uninstallWildfly= { "-uninstall", "/Users/anyang/Desktop/jacoco/sum/wildfly-8.0.0.Final/"};
//        App.main(uninstallWildfly);
        } catch (Exception e) {
            //
        }
    }

    @Test
    public void testArgsParser() {
        try {
            String[] args1 = {"-help"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args1});
        } catch (Exception e) {
            //
        }

        try {
            String[] args2 = {"-install", "/Users/anyang/Desktop/jacoco/resin-4.0.56/",
                    "-uninstall", "/Users/anyang/Desktop/jacoco/sum/resin-4.0.56/"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args2});
        } catch (Exception e) {
            //
        }

        try {
            String[] args3 = {"-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args3});
        } catch (Exception e) {
            //
        }

        try {
            String[] args4 = {"-install", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087",
                    "-pid", "12345"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args4});
        } catch (Exception e) {
            //
        }

        try {
            String[] args5 = {"-install", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-appsecret", "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE",
                    "-backendurl", "http://scloud.baidu.com:8087",
                    "-pid", "aaaaaa"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args5});
        } catch (Exception e) {
            //
        }

        try {
            String[] args6 = {"-install", "/Users/anyang/Desktop/jacoco/sum/apache-tomcat-8.5.30/",
                    "-appid", "9b3554a97673f1f8f5c929310298037a660d3b7a",
                    "-backendurl", "http://scloud.baidu.com:8087"};
            Method method = App.class.getDeclaredMethod("argsParser", String[].class);
            method.setAccessible(true);
            method.invoke(new App(), new Object[]{args6});
        } catch (Exception e) {
            //
        }

    }

    @Test
    public void testNewInstallerFactory() {
        try {
            String temp = System.getProperty("os.name");
            System.setProperty("os.name", "Windows");
            Object app = App.class.newInstance();
            Utils.invokeMethod(app, "newInstallerFactory", new Class[]{});
            System.setProperty("os.name", temp);
        } catch (Exception e) {
            //
        }
    }

    @Test
    public void testNewUninstallerFactory() {
        try {
            String temp = System.getProperty("os.name");
            System.setProperty("os.name", "Windows");
            Object app = App.class.newInstance();
            Utils.invokeMethod(app, "newUninstallerFactory", new Class[]{});
            System.setProperty("os.name", temp);
        } catch (Exception e) {
            //
        }
    }


    @Test
    public void testCheckArgs() {
        try {
            App.appId = "9b3554a97673f1f8f5c929310298037a660";
            App.appSecret = "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE";
            App.url = "http://scloud.baidu.com:8087";
            Utils.invokeStaticMethod("com.baidu.rasp.App", "checkArgs", new Class[]{});
        } catch (Exception e) {
            //
        }
        try {
            App.appId = "9b3554a97673f1f8f5c929310298037a660d3b7a";
            App.appSecret = "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9H";
            App.url = "http://scloud.baidu.com:8087";
            Utils.invokeStaticMethod("com.baidu.rasp.App", "checkArgs", new Class[]{});
        } catch (Exception e) {
            //
        }
        try {
            App.appId = "9b3554a97673f1f8f5c929310298037a660d3b7a";
            App.appSecret = "Lng_oIYW-cf2OZUBSywxY6UnBqRizF0cTg9HGi2VVeE";
            App.url = "http/scloud.baidu.com:8087";
            Utils.invokeStaticMethod("com.baidu.rasp.App", "checkArgs", new Class[]{});
        } catch (Exception e) {
            //
        }

        try {
            throw new RaspError("xxxxxx", new Throwable());
        } catch (Throwable t) {
            //
        }

        try {
            throw new RaspError(new Throwable());
        } catch (Throwable t) {
            //
        }
    }

    @Test
    public void testShowNotice() {
        try {
            Utils.invokeStaticMethod("com.baidu.rasp.App", "showNotice", new Class[]{});
        } catch (Exception e) {
            //
        }
    }


}