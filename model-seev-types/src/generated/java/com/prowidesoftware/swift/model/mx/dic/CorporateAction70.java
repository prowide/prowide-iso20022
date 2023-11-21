
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateAction70", propOrder = {
    "dtDtls",
    "evtStag",
    "addtlBizPrcInd",
    "intrmdtSctiesDstrbtnTp",
    "ltryTp"
})
public class CorporateAction70 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate86 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat14Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected AdditionalBusinessProcessFormat11Choice addtlBizPrcInd;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat15Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate86 }
     *     
     */
    public CorporateActionDate86 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate86 }
     *     
     */
    public CorporateAction70 setDtDtls(CorporateActionDate86 value) {
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
    public CorporateAction70 setEvtStag(CorporateActionEventStageFormat14Choice value) {
        this.evtStag = value;
        return this;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessProcessFormat11Choice }
     *     
     */
    public AdditionalBusinessProcessFormat11Choice getAddtlBizPrcInd() {
        return addtlBizPrcInd;
    }

    /**
     * Sets the value of the addtlBizPrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessProcessFormat11Choice }
     *     
     */
    public CorporateAction70 setAddtlBizPrcInd(AdditionalBusinessProcessFormat11Choice value) {
        this.addtlBizPrcInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat15Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat15Choice }
     *     
     */
    public CorporateAction70 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat15Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
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
    public CorporateAction70 setLtryTp(LotteryTypeFormat4Choice value) {
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
