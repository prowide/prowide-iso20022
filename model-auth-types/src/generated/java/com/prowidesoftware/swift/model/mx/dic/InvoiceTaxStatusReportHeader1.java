
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the Invoice tax status report header details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTaxStatusReportHeader1", propOrder = {
    "taxAuthrty",
    "msgId",
    "orgnlMsgId",
    "rptSts",
    "vldtnRule"
})
public class InvoiceTaxStatusReportHeader1 {

    @XmlElement(name = "TaxAuthrty")
    protected TaxOrganisationIdentification1 taxAuthrty;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected MessageIdentification1 orgnlMsgId;
    @XmlElement(name = "RptSts", required = true)
    @XmlSchemaType(name = "string")
    protected TaxReportingStatus1Code rptSts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;

    /**
     * Gets the value of the taxAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOrganisationIdentification1 }
     *     
     */
    public TaxOrganisationIdentification1 getTaxAuthrty() {
        return taxAuthrty;
    }

    /**
     * Sets the value of the taxAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOrganisationIdentification1 }
     *     
     */
    public InvoiceTaxStatusReportHeader1 setTaxAuthrty(TaxOrganisationIdentification1 value) {
        this.taxAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public InvoiceTaxStatusReportHeader1 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public InvoiceTaxStatusReportHeader1 setOrgnlMsgId(MessageIdentification1 value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReportingStatus1Code }
     *     
     */
    public TaxReportingStatus1Code getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReportingStatus1Code }
     *     
     */
    public InvoiceTaxStatusReportHeader1 setRptSts(TaxReportingStatus1Code value) {
        this.rptSts = value;
        return this;
    }

    /**
     * Gets the value of the vldtnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vldtnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVldtnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     */
    public List<GenericValidationRuleIdentification1> getVldtnRule() {
        if (vldtnRule == null) {
            vldtnRule = new ArrayList<GenericValidationRuleIdentification1>();
        }
        return this.vldtnRule;
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
     * Adds a new item to the vldtnRule list.
     * @see #getVldtnRule()
     * 
     */
    public InvoiceTaxStatusReportHeader1 addVldtnRule(GenericValidationRuleIdentification1 vldtnRule) {
        getVldtnRule().add(vldtnRule);
        return this;
    }

}
