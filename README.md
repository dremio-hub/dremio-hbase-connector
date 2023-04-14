# Dremio Community HBase Connector

[![Build Status](https://travis-ci.org/dremio-hub/dremio-hbase-connector.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-hbase-connector)

## Compatibility Notice

Connector is compatible with Dremio versions 24.0 and later.

Use [HBase v1.0.0 connector](https://github.com/dremio-hub/dremio-hbase-connector/releases/tag/v1.0.0) with earlier versions of Dremio.

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
    * [htrace-core4-4.2.0-incubating.jar](
    https://repo1.maven.org/maven2/org/apache/htrace/htrace-core4/4.2.0-incubating/htrace-core4-4.2.0-incubating.jar)

1. Run `<DREMIO_HOME>/bin/start` to start Dremio.

You now have the HBase Connector available in the list of sources on the Dremio UI.