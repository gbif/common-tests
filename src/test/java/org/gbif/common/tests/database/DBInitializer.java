package org.gbif.common.tests.database;

import java.sql.Connection;

public interface DBInitializer {
  void init(Connection connection);
}
