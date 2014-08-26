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
// Source file: proto/Asset.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.*;
import static com.squareup.wire.Message.Label.REPEATED;

public final class ExtendedInfoProto extends Message {

  public static final String DEFAULT_DESCRIPTION = "";
  public static final Long DEFAULT_DOWNLOADCOUNT = 0L;
  public static final List<String> DEFAULT_APPLICATIONPERMISSIONID = Collections.emptyList();
  public static final Long DEFAULT_REQUIREDINSTALLATIONSIZE = 0L;
  public static final String DEFAULT_PACKAGENAME = "";
  public static final String DEFAULT_CATEGORY = "";
  public static final Boolean DEFAULT_FORWARDLOCKED = false;
  public static final String DEFAULT_CONTACTEMAIL = "";
  public static final Boolean DEFAULT_EVERINSTALLEDBYUSER = false;
  public static final String DEFAULT_DOWNLOADCOUNTSTRING = "";
  public static final String DEFAULT_CONTACTPHONE = "";
  public static final String DEFAULT_CONTACTWEBSITE = "";
  public static final Boolean DEFAULT_NEXTPURCHASEREFUNDABLE = false;
  public static final Integer DEFAULT_NUMSCREENSHOTS = 0;
  public static final String DEFAULT_PROMOTIONALDESCRIPTION = "";
  public static final Integer DEFAULT_SERVERASSETSTATE = 0;
  public static final Integer DEFAULT_CONTENTRATINGLEVEL = 0;
  public static final String DEFAULT_CONTENTRATINGSTRING = "";
  public static final String DEFAULT_RECENTCHANGES = "";
  public static final List<PackageDependencyProto> DEFAULT_PACKAGEDEPENDENCY = Collections.emptyList();
  public static final String DEFAULT_VIDEOLINK = "";

  @ProtoField(tag = 13, type = STRING)
  public final String description;

  @ProtoField(tag = 14, type = INT64)
  public final Long downloadCount;

  @ProtoField(tag = 15, type = STRING, label = REPEATED)
  public final List<String> applicationPermissionId;

  @ProtoField(tag = 16, type = INT64)
  public final Long requiredInstallationSize;

  @ProtoField(tag = 17, type = STRING)
  public final String packageName;

  @ProtoField(tag = 18, type = STRING)
  public final String category;

  @ProtoField(tag = 19, type = BOOL)
  public final Boolean forwardLocked;

  @ProtoField(tag = 20, type = STRING)
  public final String contactEmail;

  @ProtoField(tag = 21, type = BOOL)
  public final Boolean everInstalledByUser;

  @ProtoField(tag = 23, type = STRING)
  public final String downloadCountString;

  @ProtoField(tag = 26, type = STRING)
  public final String contactPhone;

  @ProtoField(tag = 27, type = STRING)
  public final String contactWebsite;

  @ProtoField(tag = 28, type = BOOL)
  public final Boolean nextPurchaseRefundable;

  @ProtoField(tag = 30, type = INT32)
  public final Integer numScreenshots;

  @ProtoField(tag = 31, type = STRING)
  public final String promotionalDescription;

  @ProtoField(tag = 34, type = INT32)
  public final Integer serverAssetState;

  @ProtoField(tag = 36, type = INT32)
  public final Integer contentRatingLevel;

  @ProtoField(tag = 37, type = STRING)
  public final String contentRatingString;

  @ProtoField(tag = 38, type = STRING)
  public final String recentChanges;

  @ProtoField(tag = 39, label = REPEATED)
  public final List<PackageDependencyProto> packageDependency;

  @ProtoField(tag = 43, type = STRING)
  public final String videoLink;

  @ProtoField(tag = 49)
  public final DownloadInfoProto downloadInfo;

  public ExtendedInfoProto(String description, Long downloadCount, List<String> applicationPermissionId, Long requiredInstallationSize, String packageName, String category, Boolean forwardLocked, String contactEmail, Boolean everInstalledByUser, String downloadCountString, String contactPhone, String contactWebsite, Boolean nextPurchaseRefundable, Integer numScreenshots, String promotionalDescription, Integer serverAssetState, Integer contentRatingLevel, String contentRatingString, String recentChanges, List<PackageDependencyProto> packageDependency, String videoLink, DownloadInfoProto downloadInfo) {
    this.description = description;
    this.downloadCount = downloadCount;
    this.applicationPermissionId = immutableCopyOf(applicationPermissionId);
    this.requiredInstallationSize = requiredInstallationSize;
    this.packageName = packageName;
    this.category = category;
    this.forwardLocked = forwardLocked;
    this.contactEmail = contactEmail;
    this.everInstalledByUser = everInstalledByUser;
    this.downloadCountString = downloadCountString;
    this.contactPhone = contactPhone;
    this.contactWebsite = contactWebsite;
    this.nextPurchaseRefundable = nextPurchaseRefundable;
    this.numScreenshots = numScreenshots;
    this.promotionalDescription = promotionalDescription;
    this.serverAssetState = serverAssetState;
    this.contentRatingLevel = contentRatingLevel;
    this.contentRatingString = contentRatingString;
    this.recentChanges = recentChanges;
    this.packageDependency = immutableCopyOf(packageDependency);
    this.videoLink = videoLink;
    this.downloadInfo = downloadInfo;
  }

  private ExtendedInfoProto(Builder builder) {
    this(builder.description, builder.downloadCount, builder.applicationPermissionId, builder.requiredInstallationSize, builder.packageName, builder.category, builder.forwardLocked, builder.contactEmail, builder.everInstalledByUser, builder.downloadCountString, builder.contactPhone, builder.contactWebsite, builder.nextPurchaseRefundable, builder.numScreenshots, builder.promotionalDescription, builder.serverAssetState, builder.contentRatingLevel, builder.contentRatingString, builder.recentChanges, builder.packageDependency, builder.videoLink, builder.downloadInfo);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ExtendedInfoProto)) return false;
    ExtendedInfoProto o = (ExtendedInfoProto) other;
    return equals(description, o.description)
        && equals(downloadCount, o.downloadCount)
        && equals(applicationPermissionId, o.applicationPermissionId)
        && equals(requiredInstallationSize, o.requiredInstallationSize)
        && equals(packageName, o.packageName)
        && equals(category, o.category)
        && equals(forwardLocked, o.forwardLocked)
        && equals(contactEmail, o.contactEmail)
        && equals(everInstalledByUser, o.everInstalledByUser)
        && equals(downloadCountString, o.downloadCountString)
        && equals(contactPhone, o.contactPhone)
        && equals(contactWebsite, o.contactWebsite)
        && equals(nextPurchaseRefundable, o.nextPurchaseRefundable)
        && equals(numScreenshots, o.numScreenshots)
        && equals(promotionalDescription, o.promotionalDescription)
        && equals(serverAssetState, o.serverAssetState)
        && equals(contentRatingLevel, o.contentRatingLevel)
        && equals(contentRatingString, o.contentRatingString)
        && equals(recentChanges, o.recentChanges)
        && equals(packageDependency, o.packageDependency)
        && equals(videoLink, o.videoLink)
        && equals(downloadInfo, o.downloadInfo);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = description != null ? description.hashCode() : 0;
      result = result * 37 + (downloadCount != null ? downloadCount.hashCode() : 0);
      result = result * 37 + (applicationPermissionId != null ? applicationPermissionId.hashCode() : 1);
      result = result * 37 + (requiredInstallationSize != null ? requiredInstallationSize.hashCode() : 0);
      result = result * 37 + (packageName != null ? packageName.hashCode() : 0);
      result = result * 37 + (category != null ? category.hashCode() : 0);
      result = result * 37 + (forwardLocked != null ? forwardLocked.hashCode() : 0);
      result = result * 37 + (contactEmail != null ? contactEmail.hashCode() : 0);
      result = result * 37 + (everInstalledByUser != null ? everInstalledByUser.hashCode() : 0);
      result = result * 37 + (downloadCountString != null ? downloadCountString.hashCode() : 0);
      result = result * 37 + (contactPhone != null ? contactPhone.hashCode() : 0);
      result = result * 37 + (contactWebsite != null ? contactWebsite.hashCode() : 0);
      result = result * 37 + (nextPurchaseRefundable != null ? nextPurchaseRefundable.hashCode() : 0);
      result = result * 37 + (numScreenshots != null ? numScreenshots.hashCode() : 0);
      result = result * 37 + (promotionalDescription != null ? promotionalDescription.hashCode() : 0);
      result = result * 37 + (serverAssetState != null ? serverAssetState.hashCode() : 0);
      result = result * 37 + (contentRatingLevel != null ? contentRatingLevel.hashCode() : 0);
      result = result * 37 + (contentRatingString != null ? contentRatingString.hashCode() : 0);
      result = result * 37 + (recentChanges != null ? recentChanges.hashCode() : 0);
      result = result * 37 + (packageDependency != null ? packageDependency.hashCode() : 1);
      result = result * 37 + (videoLink != null ? videoLink.hashCode() : 0);
      result = result * 37 + (downloadInfo != null ? downloadInfo.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ExtendedInfoProto> {

    public String description;
    public Long downloadCount;
    public List<String> applicationPermissionId;
    public Long requiredInstallationSize;
    public String packageName;
    public String category;
    public Boolean forwardLocked;
    public String contactEmail;
    public Boolean everInstalledByUser;
    public String downloadCountString;
    public String contactPhone;
    public String contactWebsite;
    public Boolean nextPurchaseRefundable;
    public Integer numScreenshots;
    public String promotionalDescription;
    public Integer serverAssetState;
    public Integer contentRatingLevel;
    public String contentRatingString;
    public String recentChanges;
    public List<PackageDependencyProto> packageDependency;
    public String videoLink;
    public DownloadInfoProto downloadInfo;

    public Builder() {
    }

    public Builder(ExtendedInfoProto message) {
      super(message);
      if (message == null) return;
      this.description = message.description;
      this.downloadCount = message.downloadCount;
      this.applicationPermissionId = copyOf(message.applicationPermissionId);
      this.requiredInstallationSize = message.requiredInstallationSize;
      this.packageName = message.packageName;
      this.category = message.category;
      this.forwardLocked = message.forwardLocked;
      this.contactEmail = message.contactEmail;
      this.everInstalledByUser = message.everInstalledByUser;
      this.downloadCountString = message.downloadCountString;
      this.contactPhone = message.contactPhone;
      this.contactWebsite = message.contactWebsite;
      this.nextPurchaseRefundable = message.nextPurchaseRefundable;
      this.numScreenshots = message.numScreenshots;
      this.promotionalDescription = message.promotionalDescription;
      this.serverAssetState = message.serverAssetState;
      this.contentRatingLevel = message.contentRatingLevel;
      this.contentRatingString = message.contentRatingString;
      this.recentChanges = message.recentChanges;
      this.packageDependency = copyOf(message.packageDependency);
      this.videoLink = message.videoLink;
      this.downloadInfo = message.downloadInfo;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder downloadCount(Long downloadCount) {
      this.downloadCount = downloadCount;
      return this;
    }

    public Builder applicationPermissionId(List<String> applicationPermissionId) {
      this.applicationPermissionId = checkForNulls(applicationPermissionId);
      return this;
    }

    public Builder requiredInstallationSize(Long requiredInstallationSize) {
      this.requiredInstallationSize = requiredInstallationSize;
      return this;
    }

    public Builder packageName(String packageName) {
      this.packageName = packageName;
      return this;
    }

    public Builder category(String category) {
      this.category = category;
      return this;
    }

    public Builder forwardLocked(Boolean forwardLocked) {
      this.forwardLocked = forwardLocked;
      return this;
    }

    public Builder contactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    public Builder everInstalledByUser(Boolean everInstalledByUser) {
      this.everInstalledByUser = everInstalledByUser;
      return this;
    }

    public Builder downloadCountString(String downloadCountString) {
      this.downloadCountString = downloadCountString;
      return this;
    }

    public Builder contactPhone(String contactPhone) {
      this.contactPhone = contactPhone;
      return this;
    }

    public Builder contactWebsite(String contactWebsite) {
      this.contactWebsite = contactWebsite;
      return this;
    }

    public Builder nextPurchaseRefundable(Boolean nextPurchaseRefundable) {
      this.nextPurchaseRefundable = nextPurchaseRefundable;
      return this;
    }

    public Builder numScreenshots(Integer numScreenshots) {
      this.numScreenshots = numScreenshots;
      return this;
    }

    public Builder promotionalDescription(String promotionalDescription) {
      this.promotionalDescription = promotionalDescription;
      return this;
    }

    public Builder serverAssetState(Integer serverAssetState) {
      this.serverAssetState = serverAssetState;
      return this;
    }

    public Builder contentRatingLevel(Integer contentRatingLevel) {
      this.contentRatingLevel = contentRatingLevel;
      return this;
    }

    public Builder contentRatingString(String contentRatingString) {
      this.contentRatingString = contentRatingString;
      return this;
    }

    public Builder recentChanges(String recentChanges) {
      this.recentChanges = recentChanges;
      return this;
    }

    public Builder packageDependency(List<PackageDependencyProto> packageDependency) {
      this.packageDependency = checkForNulls(packageDependency);
      return this;
    }

    public Builder videoLink(String videoLink) {
      this.videoLink = videoLink;
      return this;
    }

    public Builder downloadInfo(DownloadInfoProto downloadInfo) {
      this.downloadInfo = downloadInfo;
      return this;
    }

    @Override
    public ExtendedInfoProto build() {
      return new ExtendedInfoProto(this);
    }
  }
}