
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
@XmlType(name = "SettlementFailsInstrument2", propOrder = {
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
public class SettlementFailsInstrument2 {

    @XmlElement(name = "Eqty", required = true)
    protected SettlementTotalData1Choice eqty;
    @XmlElement(name = "SvrgnDebt", required = true)
    protected SettlementTotalData1Choice svrgnDebt;
    @XmlElement(name = "Bd", required = true)
    protected SettlementTotalData1Choice bd;
    @XmlElement(name = "OthrTrfblScties", required = true)
    protected SettlementTotalData1Choice othrTrfblScties;
    @XmlElement(name = "XchgTraddFnds", required = true)
    protected SettlementTotalData1Choice xchgTraddFnds;
    @XmlElement(name = "CllctvInvstmtUdrtkgs", required = true)
    protected SettlementTotalData1Choice cllctvInvstmtUdrtkgs;
    @XmlElement(name = "MnyMktInstrm", required = true)
    protected SettlementTotalData1Choice mnyMktInstrm;
    @XmlElement(name = "EmssnAllwnc", required = true)
    protected SettlementTotalData1Choice emssnAllwnc;
    @XmlElement(name = "Othr", required = true)
    protected SettlementTotalData1Choice othr;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setEqty(SettlementTotalData1Choice value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the svrgnDebt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getSvrgnDebt() {
        return svrgnDebt;
    }

    /**
     * Sets the value of the svrgnDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setSvrgnDebt(SettlementTotalData1Choice value) {
        this.svrgnDebt = value;
        return this;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setBd(SettlementTotalData1Choice value) {
        this.bd = value;
        return this;
    }

    /**
     * Gets the value of the othrTrfblScties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getOthrTrfblScties() {
        return othrTrfblScties;
    }

    /**
     * Sets the value of the othrTrfblScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setOthrTrfblScties(SettlementTotalData1Choice value) {
        this.othrTrfblScties = value;
        return this;
    }

    /**
     * Gets the value of the xchgTraddFnds property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getXchgTraddFnds() {
        return xchgTraddFnds;
    }

    /**
     * Sets the value of the xchgTraddFnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setXchgTraddFnds(SettlementTotalData1Choice value) {
        this.xchgTraddFnds = value;
        return this;
    }

    /**
     * Gets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getCllctvInvstmtUdrtkgs() {
        return cllctvInvstmtUdrtkgs;
    }

    /**
     * Sets the value of the cllctvInvstmtUdrtkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setCllctvInvstmtUdrtkgs(SettlementTotalData1Choice value) {
        this.cllctvInvstmtUdrtkgs = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getMnyMktInstrm() {
        return mnyMktInstrm;
    }

    /**
     * Sets the value of the mnyMktInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setMnyMktInstrm(SettlementTotalData1Choice value) {
        this.mnyMktInstrm = value;
        return this;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setEmssnAllwnc(SettlementTotalData1Choice value) {
        this.emssnAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsInstrument2 setOthr(SettlementTotalData1Choice value) {
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
