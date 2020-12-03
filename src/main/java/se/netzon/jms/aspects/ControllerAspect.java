package se.netzon.jms.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {
    private final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    /*
    * Catch all route access.
    * i.e. se.netzon.jms.controllers.ApiController.getShortText()
    * */
    @Before("execution(* se.netzon.jms.controllers.*Controller.*())")
    public void beforeRouteAccess(JoinPoint joinPoint) {
        logger.info("Route accessed: " + joinPoint.getSignature().toString());
    }

}
