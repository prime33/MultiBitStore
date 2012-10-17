package org.multibit.store.resources;

import com.yammer.dropwizard.client.JerseyClient;
import com.yammer.dropwizard.jersey.caching.CacheControl;
import com.yammer.metrics.annotation.Timed;
import org.multibit.store.views.PublicFreemarkerView;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.TimeUnit;

/**
 * <p>Resource to provide the following to application:</p>
 * <ul>
 * <li>Provision of configuration for public contact page</li>
 * </ul>
 *
 * @since 0.0.1
 */
@Component
@Path("/contact")
@Produces(MediaType.TEXT_HTML)
public class PublicContactResource extends BaseResource {

  /**
   * @param jerseyClient The {@link com.yammer.dropwizard.client.JerseyClient} for upstream communication
   */
  public PublicContactResource(JerseyClient jerseyClient) {
    super(jerseyClient);
  }

  /**
   * Provide the initial view on to the system
   *
   * @return A localised view containing HTML
   */
  @GET
  @Timed
  @CacheControl(maxAge = 5, maxAgeUnit = TimeUnit.MINUTES)
  public PublicFreemarkerView retrieveAllByPage() {
    // TODO Add i18n
    return new PublicFreemarkerView("store/contact.ftl");
  }

}