
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines message level identification, number of individual tax reports and tax authority.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReportHeader1", propOrder = {
    "msgId",
    "nbOfTaxRpts",
    "taxAuthrty"
})
public class TaxReportHeader1 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "NbOfTaxRpts")
    protected BigDecimal nbOfTaxRpts;
    @XmlElement(name = "TaxAuthrty")
    protected List<TaxOrganisationIdentification1> taxAuthrty;

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
    public TaxReportHeader1 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfTaxRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTaxRpts() {
        return nbOfTaxRpts;
    }

    /**
     * Sets the value of the nbOfTaxRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxReportHeader1 setNbOfTaxRpts(BigDecimal value) {
        this.nbOfTaxRpts = value;
        return this;
    }

    /**
     * Gets the value of the taxAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxOrganisationIdentification1 }
     * 
     * 
     */
    public List<TaxOrganisationIdentification1> getTaxAuthrty() {
        if (taxAuthrty == null) {
            taxAuthrty = new ArrayList<TaxOrganisationIdentification1>();
        }
        return this.taxAuthrty;
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
     * Adds a new item to the taxAuthrty list.
     * @see #getTaxAuthrty()
     * 
     */
    public TaxReportHeader1 addTaxAuthrty(TaxOrganisationIdentification1 taxAuthrty) {
        getTaxAuthrty().add(taxAuthrty);
        return this;
    }

}
