
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
 * Specifies the type of financial instruments that are initially recorded or centrally maintained in CSDs (central securities depositories) as defined in the relevant regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserFinancialInstrument1", propOrder = {
    "eqty",
    "svrgnDebt",
    "bd",
    "othrTrfblScties",
    "xchgTradgFnds",
    "cllctvInvstmtUdrtkgs",
    "mnyMktInstrm",
    "emssnAllwnc",
    "othrFinInstrms"
})
public class SettlementInternaliserFinancialInstrument1 {

    @XmlElement(name = "Eqty", required = true)
    protected InternalisationData1 eqty;
    @XmlElement(name = "SvrgnDebt", required = true)
    protected InternalisationData1 svrgnDebt;
    @XmlElement(name = "Bd", required = true)
    protected InternalisationData1 bd;
    @XmlElement(name = "OthrTrfblScties", required = true)
    protected InternalisationData1 othrTrfblScties;
    @XmlElement(name = "XchgTradgFnds", required = true)
    protected InternalisationData1 xchgTradgFnds;
    @XmlElement(name = "CllctvInvstmtUdrtkgs", required = true)
    protected InternalisationData1 cllctvInvstmtUdrtkgs;
    @XmlElement(name = "MnyMktInstrm", required = true)
    protected InternalisationData1 mnyMktInstrm;
    @XmlElement(name = "EmssnAllwnc", required = true)
    protected InternalisationData1 emssnAllwnc;
    @XmlElement(name = "OthrFinInstrms", required = true)
    protected InternalisationData1 othrFinInstrms;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setEqty(InternalisationData1 value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the svrgnDebt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getSvrgnDebt() {
        return svrgnDebt;
    }

    /**
     * Sets the value of the svrgnDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setSvrgnDebt(InternalisationData1 value) {
        this.svrgnDebt = value;
        return this;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setBd(InternalisationData1 value) {
        this.bd = value;
        return this;
    }

    /**
     * Gets the value of the othrTrfblScties property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrTrfblScties() {
        return othrTrfblScties;
    }

    /**
     * Sets the value of the othrTrfblScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setOthrTrfblScties(InternalisationData1 value) {
        this.othrTrfblScties = value;
        return this;
    }

    /**
     * Gets the value of the xchgTradgFnds property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getXchgTradgFnds() {
        return xchgTradgFnds;
    }

    /**
     * Sets the value of the xchgTradgFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setXchgTradgFnds(InternalisationData1 value) {
        this.xchgTradgFnds = value;
        return this;
    }

    /**
     * Gets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getCllctvInvstmtUdrtkgs() {
        return cllctvInvstmtUdrtkgs;
    }

    /**
     * Sets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setCllctvInvstmtUdrtkgs(InternalisationData1 value) {
        this.cllctvInvstmtUdrtkgs = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getMnyMktInstrm() {
        return mnyMktInstrm;
    }

    /**
     * Sets the value of the mnyMktInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setMnyMktInstrm(InternalisationData1 value) {
        this.mnyMktInstrm = value;
        return this;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setEmssnAllwnc(InternalisationData1 value) {
        this.emssnAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the othrFinInstrms property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getOthrFinInstrms() {
        return othrFinInstrms;
    }

    /**
     * Sets the value of the othrFinInstrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public SettlementInternaliserFinancialInstrument1 setOthrFinInstrms(InternalisationData1 value) {
        this.othrFinInstrms = value;
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
