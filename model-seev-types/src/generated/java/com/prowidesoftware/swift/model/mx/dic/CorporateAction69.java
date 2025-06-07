
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "CorporateAction69", propOrder = {
    "dtDtls",
    "sctiesQty",
    "evtStag",
    "addtlBizPrcInd",
    "intrmdtSctiesDstrbtnTp",
    "ltryTp"
})
public class CorporateAction69 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate85 dtDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantity12 sctiesQty;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat14Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat18Choice> addtlBizPrcInd;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat15Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat4Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate85 }
     *     
     */
    public CorporateActionDate85 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate85 }
     *     
     */
    public CorporateAction69 setDtDtls(CorporateActionDate85 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantity12 }
     *     
     */
    public CorporateActionQuantity12 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantity12 }
     *     
     */
    public CorporateAction69 setSctiesQty(CorporateActionQuantity12 value) {
        this.sctiesQty = value;
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
    public CorporateAction69 setEvtStag(CorporateActionEventStageFormat14Choice value) {
        this.evtStag = value;
        return this;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBizPrcInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBizPrcInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBusinessProcessFormat18Choice }
     * 
     * 
     */
    public List<AdditionalBusinessProcessFormat18Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<AdditionalBusinessProcessFormat18Choice>();
        }
        return this.addtlBizPrcInd;
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
    public CorporateAction69 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat15Choice value) {
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
    public CorporateAction69 setLtryTp(LotteryTypeFormat4Choice value) {
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

    /**
     * Adds a new item to the addtlBizPrcInd list.
     * @see #getAddtlBizPrcInd()
     * 
     */
    public CorporateAction69 addAddtlBizPrcInd(AdditionalBusinessProcessFormat18Choice addtlBizPrcInd) {
        getAddtlBizPrcInd().add(addtlBizPrcInd);
        return this;
    }

}
