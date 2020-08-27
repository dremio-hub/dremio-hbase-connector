# Dremio Community HBase Connector

[![Build Status](https://travis-ci.org/dremio-hub/dremio-hbase-connector.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-hbase-connector)

## Building and Installation

To add the Dremio Community HBase Connector to the list of Dremio sources:

1. From the project root, run `mvn clean install`. 
   The HBase Connector `dremio-hbase-plugin-4.7.3-202008270723550726-918276ee.jar` appears in the `target` directory.

1. Copy `dremio-hbase-plugin-4.7.3-202008270723550726-918276ee.jar` to the `<DREMIO_HOME>/jars` folder on all Dremio
 nodes.

1. Run `<DREMIO_HOME>/bin/stop` to stop Dremio.

1. Download and copy the following jars to the `<DREMIO_HOME>/jars/3rdparty` folder on all Dremio nodes.
    * [hbase-client-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/hbase-client/2.2.0/hbase-client-2.2.0.jar)
    * [hbase-common-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/hbase-common/2.2.0/hbase-common-2.2.0.jar)
    * [hbase-protocol-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/hbase-protocol/2.2.0/hbase-protocol-2.2.0.jar)
    * [hbase-protocol-shaded-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/hbase-protocol-shaded/2.2.0/hbase-protocol-shaded-2.2.0.jar)
    * [hbase-shaded-miscellaneous-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/thirdparty/hbase-shaded-miscellaneous/2.2.0/hbase-shaded-miscellaneous-2.2.0.jar)
    * [hbase-shaded-netty-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/thirdparty/hbase-shaded-netty/2.2.0/hbase-shaded-netty-2.2.0.jar)
    * [hbase-shaded-protobuf-2.2.0.jar](https://repo1.maven.org/maven2/org/apache/hbase/thirdparty/hbase-shaded-protobuf/2.2.0/hbase-shaded-protobuf-2.2.0.jar)

1. Run `<DREMIO_HOME>/bin/start` to start Dremio.

You now have the HBase Connector available in the list of sources on the Dremio UI.