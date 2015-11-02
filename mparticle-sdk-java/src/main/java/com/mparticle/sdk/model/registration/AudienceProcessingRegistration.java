package com.mparticle.sdk.model.registration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Audience data stream subscription settings.
 */
public final class AudienceProcessingRegistration {

    @JsonProperty("account_settings")
    private List<Setting> accountSettings;

    @JsonProperty("audience_subscription_settings")
    private List<Setting> audienceSubscriptionSettings;

    /**
     *
     * @return account subscription settings
     */
    public List<Setting> getAccountSettings() {
        return accountSettings;
    }

    /**
     *
     * @param accountSettings account subscription settings
     * @return this
     */
    public AudienceProcessingRegistration setAccountSettings(List<Setting> accountSettings) {
        this.accountSettings = accountSettings;
        return this;
    }

    /**
     *
     * @return audience subscription settings
     */
    public List<Setting> getAudienceSubscriptionSettings() {
        return audienceSubscriptionSettings;
    }

    /**
     *
     * @param audienceSubscriptionSettings audience subscription settings
     * @return this
     */
    public AudienceProcessingRegistration setAudienceSubscriptionSettings(List<Setting> audienceSubscriptionSettings) {
        this.audienceSubscriptionSettings = audienceSubscriptionSettings;
        return this;
    }
}
