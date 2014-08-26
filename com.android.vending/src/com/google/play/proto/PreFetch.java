/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Requests.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.*;

public final class PreFetch extends Message {

  public static final String DEFAULT_URL = "";
  public static final ByteString DEFAULT_RESPONSE = ByteString.EMPTY;
  public static final String DEFAULT_ETAG = "";
  public static final Long DEFAULT_TTL = 0L;
  public static final Long DEFAULT_SOFTTTL = 0L;

  @ProtoField(tag = 1, type = STRING)
  public final String url;

  @ProtoField(tag = 2, type = BYTES)
  public final ByteString response;

  @ProtoField(tag = 3, type = STRING)
  public final String etag;

  @ProtoField(tag = 4, type = INT64)
  public final Long ttl;

  @ProtoField(tag = 5, type = INT64)
  public final Long softTtl;

  public PreFetch(String url, ByteString response, String etag, Long ttl, Long softTtl) {
    this.url = url;
    this.response = response;
    this.etag = etag;
    this.ttl = ttl;
    this.softTtl = softTtl;
  }

  private PreFetch(Builder builder) {
    this(builder.url, builder.response, builder.etag, builder.ttl, builder.softTtl);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PreFetch)) return false;
    PreFetch o = (PreFetch) other;
    return equals(url, o.url)
        && equals(response, o.response)
        && equals(etag, o.etag)
        && equals(ttl, o.ttl)
        && equals(softTtl, o.softTtl);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = url != null ? url.hashCode() : 0;
      result = result * 37 + (response != null ? response.hashCode() : 0);
      result = result * 37 + (etag != null ? etag.hashCode() : 0);
      result = result * 37 + (ttl != null ? ttl.hashCode() : 0);
      result = result * 37 + (softTtl != null ? softTtl.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PreFetch> {

    public String url;
    public ByteString response;
    public String etag;
    public Long ttl;
    public Long softTtl;

    public Builder() {
    }

    public Builder(PreFetch message) {
      super(message);
      if (message == null) return;
      this.url = message.url;
      this.response = message.response;
      this.etag = message.etag;
      this.ttl = message.ttl;
      this.softTtl = message.softTtl;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder response(ByteString response) {
      this.response = response;
      return this;
    }

    public Builder etag(String etag) {
      this.etag = etag;
      return this;
    }

    public Builder ttl(Long ttl) {
      this.ttl = ttl;
      return this;
    }

    public Builder softTtl(Long softTtl) {
      this.softTtl = softTtl;
      return this;
    }

    @Override
    public PreFetch build() {
      return new PreFetch(this);
    }
  }
}