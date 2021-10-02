package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//프로젝트를 톰캣에 실행시키면 객채가 실행되며 초기화 메소드가 호출
public class ContextLoaderListener implements ServletContextListener {
    static ApplicationContext applicationContext;
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}