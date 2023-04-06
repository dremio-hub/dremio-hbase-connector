# Dremio Community HBase Connector

[![Build Status](https://travis-ci.org/dremio-hub/dremio-hbase-connector.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-hbase-connector)

## Compatibility Notice

As of April 6, 2023, the connector no longer compiles with Dremio OSS versions older than 24.0.0 due to a change in Dremio. Please make sure to use Dremio OSS version 24.0.0 or later if you want to use the Dremio community HBase connector.

## Building and Installation

To add the Dremio Community HBase Connector to the list of Dremio sources:

1. From the project root, run `mvn clean install`. 
   The HBase Connector `dremio-hbase-plugin-<latest-version>.jar` appears in the `target` directory.

1. Copy `dremio-hbase-plugin-<latest-version>.jar` to the `<DREMIO_HOME>/jars` folder on all Dremio
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