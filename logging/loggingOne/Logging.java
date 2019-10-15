import java.util.logging.*;
import org.aspectj.lang.*;

public aspect Logging{
    private Logger lgr = Logger.getLogger("MyLogger");

    pointcut logmeths() : execution(* *.*(..));

    before() : logmeths(){
        Signature sig = thisJoinPointStaticPart.getSignature();
        lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(),"Status: Done");
    }
}