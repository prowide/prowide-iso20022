
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of a cheque instruction, such as cheque type or cheque number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque14", propOrder = {
    "instrId",
    "orgnlInstrId",
    "chqNb",
    "isseDt",
    "stlDt",
    "amt",
    "fctvDt",
    "drwrAgt",
    "drwrAgtAcct",
    "pyee",
    "pyeeAcct",
    "chqCxlOrStopSts"
})
public class Cheque14 {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "ChqNb", required = true)
    protected String chqNb;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar isseDt;
    @XmlElement(name = "StlDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar stlDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTime2Choice fctvDt;
    @XmlElement(name = "DrwrAgt")
    protected BranchAndFinancialInstitutionIdentification6 drwrAgt;
    @XmlElement(name = "DrwrAgtAcct")
    protected CashAccount40 drwrAgtAcct;
    @XmlElement(name = "Pyee")
    protected PartyIdentification135 pyee;
    @XmlElement(name = "PyeeAcct")
    protected CashAccount40 pyeeAcct;
    @XmlElement(name = "ChqCxlOrStopSts", required = true)
    protected ChequeCancellationStatus1 chqCxlOrStopSts;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque14 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque14 setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
        return this;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque14 setChqNb(String value) {
        this.chqNb = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque14 setIsseDt(Calendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the stlDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStlDt() {
        return stlDt;
    }

    /**
     * Sets the value of the stlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque14 setStlDt(Calendar value) {
        this.stlDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Cheque14 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Cheque14 setFctvDt(DateAndDateTime2Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the drwrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDrwrAgt() {
        return drwrAgt;
    }

    /**
     * Sets the value of the drwrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public Cheque14 setDrwrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.drwrAgt = value;
        return this;
    }

    /**
     * Gets the value of the drwrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDrwrAgtAcct() {
        return drwrAgtAcct;
    }

    /**
     * Sets the value of the drwrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Cheque14 setDrwrAgtAcct(CashAccount40 value) {
        this.drwrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Cheque14 setPyee(PartyIdentification135 value) {
        this.pyee = value;
        return this;
    }

    /**
     * Gets the value of the pyeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPyeeAcct() {
        return pyeeAcct;
    }

    /**
     * Sets the value of the pyeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Cheque14 setPyeeAcct(CashAccount40 value) {
        this.pyeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the chqCxlOrStopSts property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeCancellationStatus1 }
     *     
     */
    public ChequeCancellationStatus1 getChqCxlOrStopSts() {
        return chqCxlOrStopSts;
    }

    /**
     * Sets the value of the chqCxlOrStopSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeCancellationStatus1 }
     *     
     */
    public Cheque14 setChqCxlOrStopSts(ChequeCancellationStatus1 value) {
        this.chqCxlOrStopSts = value;
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
