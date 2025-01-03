
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
@XmlType(name = "CorporateAction13", propOrder = {
    "dtDtls",
    "evtStag",
    "ltryTp"
})
public class CorporateAction13 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate30 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat6Choice evtStag;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat1Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate30 }
     *     
     */
    public CorporateActionDate30 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate30 }
     *     
     */
    public CorporateAction13 setDtDtls(CorporateActionDate30 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStageFormat6Choice }
     *     
     */
    public CorporateActionEventStageFormat6Choice getEvtStag() {
        return evtStag;
    }

    /**
     * Sets the value of the evtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStageFormat6Choice }
     *     
     */
    public CorporateAction13 setEvtStag(CorporateActionEventStageFormat6Choice value) {
        this.evtStag = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat1Choice }
     *     
     */
    public LotteryTypeFormat1Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat1Choice }
     *     
     */
    public CorporateAction13 setLtryTp(LotteryTypeFormat1Choice value) {
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
