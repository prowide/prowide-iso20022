
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
@XmlType(name = "CorporateAction42", propOrder = {
    "dtDtls",
    "evtStag",
    "addtlBizPrcInd",
    "ltryTp",
    "sctiesQty"
})
public class CorporateAction42 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate63 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat14Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected AdditionalBusinessProcessFormat10Choice addtlBizPrcInd;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity9 sctiesQty;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate63 }
     *     
     */
    public CorporateActionDate63 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate63 }
     *     
     */
    public CorporateAction42 setDtDtls(CorporateActionDate63 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStageFormat14Choice }
     *     
     */
    public CorporateActionEventStageFormat14Choice getEvtStag() {
        return evtStag;
    }

    /**
     * Sets the value of the evtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStageFormat14Choice }
     *     
     */
    public CorporateAction42 setEvtStag(CorporateActionEventStageFormat14Choice value) {
        this.evtStag = value;
        return this;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessProcessFormat10Choice }
     *     
     */
    public AdditionalBusinessProcessFormat10Choice getAddtlBizPrcInd() {
        return addtlBizPrcInd;
    }

    /**
     * Sets the value of the addtlBizPrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessProcessFormat10Choice }
     *     
     */
    public CorporateAction42 setAddtlBizPrcInd(AdditionalBusinessProcessFormat10Choice value) {
        this.addtlBizPrcInd = value;
        return this;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public LotteryTypeFormat4Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat4Choice }
     *     
     */
    public CorporateAction42 setLtryTp(LotteryTypeFormat4Choice value) {
        this.ltryTp = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity9 }
     *     
     */
    public CorporateActionQuantity9 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity9 }
     *     
     */
    public CorporateAction42 setSctiesQty(CorporateActionQuantity9 value) {
        this.sctiesQty = value;
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
