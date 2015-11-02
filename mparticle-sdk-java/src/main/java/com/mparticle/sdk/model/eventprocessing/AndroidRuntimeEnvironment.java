package com.mparticle.sdk.model.eventprocessing;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Android device information.
 */
public final class AndroidRuntimeEnvironment extends RuntimeEnvironment {

    @JsonProperty("identities")
    private List<DeviceIdentity> identities;

    @JsonProperty("build_id")
    private String buildId;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("product")
    private String product;

    @JsonProperty("name")
    private String name;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("os_version")
    private String osVersion;

    @JsonProperty("model")
    private String model;

    @JsonProperty("screen_height")
    private int screenHeight;

    @JsonProperty("screen_width")
    private int screenWidth;

    @JsonProperty("screen_dpi")
    private int screenDpi;

    @JsonProperty("country")
    private String country;

    @JsonProperty("locale_language")
    private String localeLanguage;

    @JsonProperty("locale_country")
    private String localeCountry;

    @JsonProperty("network_country")
    private String networkCountry;

    @JsonProperty("network_carrier")
    private String networkCarrier;

    @JsonProperty("network_code")
    private String mobileNetworkCode;

    @JsonProperty("network_mobile_country_code")
    private String mobileCountryCode;

    @JsonProperty("timezone_offset")
    private int utcOffset;

    @JsonProperty("timezone_name")
    private String timeZoneName;

    @JsonProperty("is_tablet")
    private Boolean isTablet;

    @JsonProperty("supports_telephony")
    private Boolean supportsTelephony;

    @JsonProperty("has_nfc")
    private Boolean hasNFC;

    @JsonProperty("bluetooth_enabled")
    private Boolean bluetoothEnabled;

    @JsonProperty("bluetooth_version")
    private String bluetoothVersion;

    @JsonProperty("android_sdk_level")
    private int androidSdkLevel;

    @JsonProperty("application_name")
    private String applicationName;

    @JsonProperty("application_version")
    private String applicationVersion;

    @JsonProperty("application_package")
    private String applicationPackage;

    public AndroidRuntimeEnvironment() {
        super(Type.ANDROID);
    }

    public List<DeviceIdentity> getIdentities() {
        return identities;
    }

    public void setIdentities(List<DeviceIdentity> identities) {
        this.identities = identities;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenDpi() {
        return screenDpi;
    }

    public void setScreenDpi(int screenDpi) {
        this.screenDpi = screenDpi;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocaleLanguage() {
        return localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }

    public String getLocaleCountry() {
        return localeCountry;
    }

    public void setLocaleCountry(String localeCountry) {
        this.localeCountry = localeCountry;
    }

    public String getNetworkCountry() {
        return networkCountry;
    }

    public void setNetworkCountry(String networkCountry) {
        this.networkCountry = networkCountry;
    }

    public String getNetworkCarrier() {
        return networkCarrier;
    }

    public void setNetworkCarrier(String networkCarrier) {
        this.networkCarrier = networkCarrier;
    }

    public String getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    public void setMobileNetworkCode(String mobileNetworkCode) {
        this.mobileNetworkCode = mobileNetworkCode;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public Boolean getIsTablet() {
        return isTablet;
    }

    public void setIsTablet(Boolean isTablet) {
        this.isTablet = isTablet;
    }

    public Boolean getSupportsTelephony() {
        return supportsTelephony;
    }

    public void setSupportsTelephony(Boolean supportsTelephony) {
        this.supportsTelephony = supportsTelephony;
    }

    public Boolean getHasNFC() {
        return hasNFC;
    }

    public void setHasNFC(Boolean hasNFC) {
        this.hasNFC = hasNFC;
    }

    public Boolean getBluetoothEnabled() {
        return bluetoothEnabled;
    }

    public void setBluetoothEnabled(Boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    public String getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(String bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }

    public int getAndroidSdkLevel() {
        return androidSdkLevel;
    }

    public void setAndroidSdkLevel(int androidSdkLevel) {
        this.androidSdkLevel = androidSdkLevel;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getApplicationPackage() {
        return applicationPackage;
    }

    public void setApplicationPackage(String applicationPackage) {
        this.applicationPackage = applicationPackage;
    }
}