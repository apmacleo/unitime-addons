/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.banner.model.base;

import java.io.Serializable;

import org.unitime.banner.model.BannerSession;
import org.unitime.banner.model.BannerTermCrnProperties;
import org.unitime.timetable.model.Session;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseBannerSession implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long iUniqueId;
	private String iBannerCampus;
	private String iBannerTermCode;
	private Boolean iStoreDataForBanner;
	private Boolean iSendDataToBanner;
	private Boolean iLoadingOfferingsFile;
	private Integer iFutureSessionUpdateModeInt;
	private String iStudentCampus;
	private Boolean iUseSubjectAreaPrefixAsCampus;
	private String iSubjectAreaPrefixDelimiter;

	private Session iSession;
	private BannerSession iFutureSession;
	private BannerTermCrnProperties iBannerTermCrnProperties;

	public static String PROP_UNIQUEID = "uniqueId";
	public static String PROP_BANNER_CAMPUS = "bannerCampus";
	public static String PROP_BANNER_TERM_CODE = "bannerTermCode";
	public static String PROP_STORE_DATA_FOR_BANNER = "storeDataForBanner";
	public static String PROP_SEND_DATA_TO_BANNER = "sendDataToBanner";
	public static String PROP_LOADING_OFFERINGS_FILE = "loadingOfferingsFile";
	public static String PROP_FUTURE_MODE = "futureSessionUpdateModeInt";
	public static String PROP_STUDENT_CAMPUS = "studentCampus";
	public static String PROP_USE_SUBJ_AREA_PRFX_AS_CAMPUS = "useSubjectAreaPrefixAsCampus";
	public static String PROP_SUBJ_AREA_PRFX_DELIM = "subjectAreaPrefixDelimiter";

	public BaseBannerSession() {
		initialize();
	}

	public BaseBannerSession(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Long getUniqueId() { return iUniqueId; }
	public void setUniqueId(Long uniqueId) { iUniqueId = uniqueId; }

	public String getBannerCampus() { return iBannerCampus; }
	public void setBannerCampus(String bannerCampus) { iBannerCampus = bannerCampus; }

	public String getBannerTermCode() { return iBannerTermCode; }
	public void setBannerTermCode(String bannerTermCode) { iBannerTermCode = bannerTermCode; }

	public Boolean isStoreDataForBanner() { return iStoreDataForBanner; }
	public Boolean getStoreDataForBanner() { return iStoreDataForBanner; }
	public void setStoreDataForBanner(Boolean storeDataForBanner) { iStoreDataForBanner = storeDataForBanner; }

	public Boolean isSendDataToBanner() { return iSendDataToBanner; }
	public Boolean getSendDataToBanner() { return iSendDataToBanner; }
	public void setSendDataToBanner(Boolean sendDataToBanner) { iSendDataToBanner = sendDataToBanner; }

	public Boolean isLoadingOfferingsFile() { return iLoadingOfferingsFile; }
	public Boolean getLoadingOfferingsFile() { return iLoadingOfferingsFile; }
	public void setLoadingOfferingsFile(Boolean loadingOfferingsFile) { iLoadingOfferingsFile = loadingOfferingsFile; }

	public Integer getFutureSessionUpdateModeInt() { return iFutureSessionUpdateModeInt; }
	public void setFutureSessionUpdateModeInt(Integer futureSessionUpdateModeInt) { iFutureSessionUpdateModeInt = futureSessionUpdateModeInt; }

	public String getStudentCampus() { return iStudentCampus; }
	public void setStudentCampus(String studentCampus) { iStudentCampus = studentCampus; }

	public Boolean isUseSubjectAreaPrefixAsCampus() { return iUseSubjectAreaPrefixAsCampus; }
	public Boolean getUseSubjectAreaPrefixAsCampus() { return iUseSubjectAreaPrefixAsCampus; }
	public void setUseSubjectAreaPrefixAsCampus(Boolean useSubjectAreaPrefixAsCampus) { iUseSubjectAreaPrefixAsCampus = useSubjectAreaPrefixAsCampus; }

	public String getSubjectAreaPrefixDelimiter() { return iSubjectAreaPrefixDelimiter; }
	public void setSubjectAreaPrefixDelimiter(String subjectAreaPrefixDelimiter) { iSubjectAreaPrefixDelimiter = subjectAreaPrefixDelimiter; }

	public Session getSession() { return iSession; }
	public void setSession(Session session) { iSession = session; }

	public BannerSession getFutureSession() { return iFutureSession; }
	public void setFutureSession(BannerSession futureSession) { iFutureSession = futureSession; }

	public BannerTermCrnProperties getBannerTermCrnProperties() { return iBannerTermCrnProperties; }
	public void setBannerTermCrnProperties(BannerTermCrnProperties bannerTermCrnProperties) { iBannerTermCrnProperties = bannerTermCrnProperties; }

	public boolean equals(Object o) {
		if (o == null || !(o instanceof BannerSession)) return false;
		if (getUniqueId() == null || ((BannerSession)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((BannerSession)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "BannerSession["+getUniqueId()+"]";
	}

	public String toDebugString() {
		return "BannerSession[" +
			"\n	BannerCampus: " + getBannerCampus() +
			"\n	BannerTermCode: " + getBannerTermCode() +
			"\n	BannerTermCrnProperties: " + getBannerTermCrnProperties() +
			"\n	FutureSession: " + getFutureSession() +
			"\n	FutureSessionUpdateModeInt: " + getFutureSessionUpdateModeInt() +
			"\n	LoadingOfferingsFile: " + getLoadingOfferingsFile() +
			"\n	SendDataToBanner: " + getSendDataToBanner() +
			"\n	Session: " + getSession() +
			"\n	StoreDataForBanner: " + getStoreDataForBanner() +
			"\n	StudentCampus: " + getStudentCampus() +
			"\n	SubjectAreaPrefixDelimiter: " + getSubjectAreaPrefixDelimiter() +
			"\n	UniqueId: " + getUniqueId() +
			"\n	UseSubjectAreaPrefixAsCampus: " + getUseSubjectAreaPrefixAsCampus() +
			"]";
	}
}
