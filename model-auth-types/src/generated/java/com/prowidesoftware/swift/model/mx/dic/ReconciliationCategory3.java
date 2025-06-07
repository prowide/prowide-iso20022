
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies categories of statuses of a derivative when there is a reporting requirement for both counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCategory3", propOrder = {
    "rptgTp",
    "pairg",
    "rcncltn",
    "valtnRcncltn",
    "rvvd",
    "frthrMod"
})
public class ReconciliationCategory3 {

    @XmlElement(name = "RptgTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeRepositoryReportingType1Code rptgTp;
    @XmlElement(name = "Pairg", required = true)
    @XmlSchemaType(name = "string")
    protected PairingStatus1Code pairg;
    @XmlElement(name = "Rcncltn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationStatus1Code rcncltn;
    @XmlElement(name = "ValtnRcncltn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationStatus2Code valtnRcncltn;
    @XmlElement(name = "Rvvd")
    protected boolean rvvd;
    @XmlElement(name = "FrthrMod")
    protected boolean frthrMod;

    /**
     * Gets the value of the rptgTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public TradeRepositoryReportingType1Code getRptgTp() {
        return rptgTp;
    }

    /**
     * Sets the value of the rptgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRepositoryReportingType1Code }
     *     
     */
    public ReconciliationCategory3 setRptgTp(TradeRepositoryReportingType1Code value) {
        this.rptgTp = value;
        return this;
    }

    /**
     * Gets the value of the pairg property.
     * 
     * @return
     *     possible object is
     *     {@link PairingStatus1Code }
     *     
     */
    public PairingStatus1Code getPairg() {
        return pairg;
    }

    /**
     * Sets the value of the pairg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingStatus1Code }
     *     
     */
    public ReconciliationCategory3 setPairg(PairingStatus1Code value) {
        this.pairg = value;
        return this;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus1Code }
     *     
     */
    public ReconciliationStatus1Code getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus1Code }
     *     
     */
    public ReconciliationCategory3 setRcncltn(ReconciliationStatus1Code value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the valtnRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatus2Code }
     *     
     */
    public ReconciliationStatus2Code getValtnRcncltn() {
        return valtnRcncltn;
    }

    /**
     * Sets the value of the valtnRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatus2Code }
     *     
     */
    public ReconciliationCategory3 setValtnRcncltn(ReconciliationStatus2Code value) {
        this.valtnRcncltn = value;
        return this;
    }

    /**
     * Gets the value of the rvvd property.
     * 
     */
    public boolean isRvvd() {
        return rvvd;
    }

    /**
     * Sets the value of the rvvd property.
     * 
     */
    public ReconciliationCategory3 setRvvd(boolean value) {
        this.rvvd = value;
        return this;
    }

    /**
     * Gets the value of the frthrMod property.
     * 
     */
    public boolean isFrthrMod() {
        return frthrMod;
    }

    /**
     * Sets the value of the frthrMod property.
     * 
     */
    public ReconciliationCategory3 setFrthrMod(boolean value) {
        this.frthrMod = value;
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
