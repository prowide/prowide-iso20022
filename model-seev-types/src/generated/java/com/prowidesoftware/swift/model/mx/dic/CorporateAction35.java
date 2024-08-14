
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction35", propOrder = {
    "dtDtls",
    "evtStag",
    "ltryTp"
})
public class CorporateAction35 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate50 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat15Choice evtStag;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat5Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate50 }
     *     
     */
    public CorporateActionDate50 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate50 }
     *     
     */
    public CorporateAction35 setDtDtls(CorporateActionDate50 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public CorporateActionEventStageFormat15Choice getEvtStag() {
        return evtStag;
    }

    /**
     * Sets the value of the evtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public CorporateAction35 setEvtStag(CorporateActionEventStageFormat15Choice value) {
        this.evtStag = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public LotteryTypeFormat5Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public CorporateAction35 setLtryTp(LotteryTypeFormat5Choice value) {
        this.ltryTp = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
