package MavenFilters;

import java.util.logging.Logger;

/**
 * Created by ferg on 19/01/15.
 */
public class HelloWorldApp
{
    private static Logger LOGGER = Logger.getLogger(String.valueOf(HelloWorldApp.class));

    public static void main( String[] args )
    {
        LOGGER.info("Hello World!");
    }
}
