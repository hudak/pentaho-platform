package org.pentaho.platform.engine.services.connection;

import org.pentaho.commons.connection.IPentahoConnection;
import org.pentaho.platform.api.engine.IPentahoSession;

import java.util.Properties;

/**
 * @author nhudak
 */
public interface ConnectionEventHandler {
  boolean connect( IPentahoConnection connection, IPentahoSession session, Properties properties );
}
