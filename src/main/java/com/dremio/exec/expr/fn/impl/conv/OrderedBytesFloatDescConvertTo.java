/*
 * Copyright (C) 2017-2018 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.exec.expr.fn.impl.conv;

import javax.inject.Inject;

import org.apache.arrow.memory.ArrowBuf;
import org.apache.arrow.vector.holders.Float4Holder;
import org.apache.arrow.vector.holders.VarBinaryHolder;

import com.dremio.exec.expr.SimpleFunction;
import com.dremio.exec.expr.annotations.FunctionTemplate;
import com.dremio.exec.expr.annotations.Output;
import com.dremio.exec.expr.annotations.Param;
import com.dremio.exec.expr.annotations.Workspace;
import com.dremio.exec.expr.annotations.FunctionTemplate.FunctionScope;
import com.dremio.exec.expr.annotations.FunctionTemplate.NullHandling;

@FunctionTemplate(name = "convert_toFLOAT_OBD", scope = FunctionScope.SIMPLE, nulls = NullHandling.NULL_IF_NULL)
public class OrderedBytesFloatDescConvertTo implements SimpleFunction {

  @Param Float4Holder in;
  @Output VarBinaryHolder out;
  @Inject ArrowBuf buffer;
  @Workspace byte[] bytes;
  @Workspace org.apache.hadoop.hbase.util.PositionedByteRange br;

  @Override
  public void setup() {
    buffer = buffer.reallocIfNeeded(5);
    bytes = new byte[5];
    br = new org.apache.hadoop.hbase.util.SimplePositionedMutableByteRange();
  }

  @Override
  public void eval() {
    buffer.clear();
    br.set(bytes);
    org.apache.hadoop.hbase.util.OrderedBytes.encodeFloat32(br, in.value,
            org.apache.hadoop.hbase.util.Order.DESCENDING);

    buffer.setBytes(0, bytes, 0, 5);
    out.buffer = buffer;
    out.start = 0;
    out.end = 5;
  }
}
