package net.foldingcoin.api;

import java.io.IOException;
import java.util.Set;
import java.util.StringJoiner;

import org.rapidoid.http.Route;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.foldingcoin.api.lib.MarkdownTableBuilder;

public class LaunchApp {

    public static final Logger LOGGER = LoggerFactory.getLogger("FLDC Stats");
    public static final String NYI = "This has not been implemented.";
    public static final String SEP = System.getProperty("line.separator");

    public static void main (String[] args) throws IOException {

        LOGGER.info("Launching the FLDC Web API!");

        App.bootstrap(args);

        LOGGER.info("The FLDC Web API has launched.");
        logRoutes();
    }

    private static void logRoutes () {

        final MarkdownTableBuilder<Route> builder = new MarkdownTableBuilder<>();
        builder.addColumn("Verb", route -> route.verb().name());
        builder.addColumn("Route", route -> route.path());
        builder.addColumn("CacheTTL", route -> route.config().cacheTTL());

        final Set<Route> routes = On.setup().routes().all();
        builder.addEntries(routes);

        LOGGER.info("Started with {} routes.{}{}", routes.size(), SEP, builder.createString());
    }

    public static String getTempMessage (String... args) {

        final StringJoiner response = new StringJoiner(", ");

        if (args.length == 0) {

            response.add("None.");
        }

        for (final String arg : args) {

            response.add(arg);
        }

        return NYI + " Args: " + response.toString();
    }
}