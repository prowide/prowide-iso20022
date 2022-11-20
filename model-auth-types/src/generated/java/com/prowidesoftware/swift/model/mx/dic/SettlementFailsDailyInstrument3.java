
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
 * Specifies the type of financial instruments that are initially recorded or centrally maintained in CSDs (central securities depositories) as defined in the relevant regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyInstrument3", propOrder = {
    "eqty",
    "svrgnDebt",
    "bd",
    "othrTrfblScties",
    "xchgTraddFnds",
    "cllctvInvstmtUdrtkgs",
    "mnyMktInstrm",
    "emssnAllwnc",
    "othr"
})
public class SettlementFailsDailyInstrument3 {

    @XmlElement(name = "Eqty", required = true)
    protected SettlementFailsDailyTransactionType1Choice eqty;
    @XmlElement(name = "SvrgnDebt", required = true)
    protected SettlementFailsDailyTransactionType1Choice svrgnDebt;
    @XmlElement(name = "Bd", required = true)
    protected SettlementFailsDailyTransactionType1Choice bd;
    @XmlElement(name = "OthrTrfblScties", required = true)
    protected SettlementFailsDailyTransactionType1Choice othrTrfblScties;
    @XmlElement(name = "XchgTraddFnds", required = true)
    protected SettlementFailsDailyTransactionType1Choice xchgTraddFnds;
    @XmlElement(name = "CllctvInvstmtUdrtkgs", required = true)
    protected SettlementFailsDailyTransactionType1Choice cllctvInvstmtUdrtkgs;
    @XmlElement(name = "MnyMktInstrm", required = true)
    protected SettlementFailsDailyTransactionType1Choice mnyMktInstrm;
    @XmlElement(name = "EmssnAllwnc", required = true)
    protected SettlementFailsDailyTransactionType1Choice emssnAllwnc;
    @XmlElement(name = "Othr", required = true)
    protected SettlementFailsDailyTransactionType1Choice othr;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setEqty(SettlementFailsDailyTransactionType1Choice value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the svrgnDebt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getSvrgnDebt() {
        return svrgnDebt;
    }

    /**
     * Sets the value of the svrgnDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setSvrgnDebt(SettlementFailsDailyTransactionType1Choice value) {
        this.svrgnDebt = value;
        return this;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setBd(SettlementFailsDailyTransactionType1Choice value) {
        this.bd = value;
        return this;
    }

    /**
     * Gets the value of the othrTrfblScties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getOthrTrfblScties() {
        return othrTrfblScties;
    }

    /**
     * Sets the value of the othrTrfblScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setOthrTrfblScties(SettlementFailsDailyTransactionType1Choice value) {
        this.othrTrfblScties = value;
        return this;
    }

    /**
     * Gets the value of the xchgTraddFnds property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getXchgTraddFnds() {
        return xchgTraddFnds;
    }

    /**
     * Sets the value of the xchgTraddFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setXchgTraddFnds(SettlementFailsDailyTransactionType1Choice value) {
        this.xchgTraddFnds = value;
        return this;
    }

    /**
     * Gets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getCllctvInvstmtUdrtkgs() {
        return cllctvInvstmtUdrtkgs;
    }

    /**
     * Sets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setCllctvInvstmtUdrtkgs(SettlementFailsDailyTransactionType1Choice value) {
        this.cllctvInvstmtUdrtkgs = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getMnyMktInstrm() {
        return mnyMktInstrm;
    }

    /**
     * Sets the value of the mnyMktInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setMnyMktInstrm(SettlementFailsDailyTransactionType1Choice value) {
        this.mnyMktInstrm = value;
        return this;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setEmssnAllwnc(SettlementFailsDailyTransactionType1Choice value) {
        this.emssnAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyTransactionType1Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyTransactionType1Choice }
     *     
     */
    public SettlementFailsDailyInstrument3 setOthr(SettlementFailsDailyTransactionType1Choice value) {
        this.othr = value;
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
