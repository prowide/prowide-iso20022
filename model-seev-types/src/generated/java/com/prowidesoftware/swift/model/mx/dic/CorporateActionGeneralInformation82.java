
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
 * General information about the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformation82", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "clssActnNb",
    "evtTp",
    "finInstrmId",
    "addtlBizPrcInd",
    "intrmdtSctiesDstrbtnTp",
    "frctnlQty"
})
public class CorporateActionGeneralInformation82 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "ClssActnNb")
    protected String clssActnNb;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType27Choice evtTp;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "AddtlBizPrcInd")
    protected AdditionalBusinessProcessFormat8Choice addtlBizPrcInd;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat13Choice intrmdtSctiesDstrbtnTp;
    @XmlElement(name = "FrctnlQty")
    protected FinancialInstrumentQuantity15Choice frctnlQty;

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformation82 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the offclCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffclCorpActnEvtId() {
        return offclCorpActnEvtId;
    }

    /**
     * Sets the value of the offclCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformation82 setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the clssActnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssActnNb() {
        return clssActnNb;
    }

    /**
     * Sets the value of the clssActnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformation82 setClssActnNb(String value) {
        this.clssActnNb = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType27Choice }
     *     
     */
    public CorporateActionEventType27Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType27Choice }
     *     
     */
    public CorporateActionGeneralInformation82 setEvtTp(CorporateActionEventType27Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public CorporateActionGeneralInformation82 setFinInstrmId(SecurityIdentification15 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessProcessFormat8Choice }
     *     
     */
    public AdditionalBusinessProcessFormat8Choice getAddtlBizPrcInd() {
        return addtlBizPrcInd;
    }

    /**
     * Sets the value of the addtlBizPrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessProcessFormat8Choice }
     *     
     */
    public CorporateActionGeneralInformation82 setAddtlBizPrcInd(AdditionalBusinessProcessFormat8Choice value) {
        this.addtlBizPrcInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat13Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat13Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat13Choice }
     *     
     */
    public CorporateActionGeneralInformation82 setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat13Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getFrctnlQty() {
        return frctnlQty;
    }

    /**
     * Sets the value of the frctnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public CorporateActionGeneralInformation82 setFrctnlQty(FinancialInstrumentQuantity15Choice value) {
        this.frctnlQty = value;
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
