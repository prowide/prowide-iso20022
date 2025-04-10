
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "Cheque20", propOrder = {
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
    "chqCxlOrStopRsn"
})
public class Cheque20 {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "ChqNb", required = true)
    protected String chqNb;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "StlDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stlDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTime2Choice fctvDt;
    @XmlElement(name = "DrwrAgt")
    protected BranchAndFinancialInstitutionIdentification8 drwrAgt;
    @XmlElement(name = "DrwrAgtAcct")
    protected CashAccount40 drwrAgtAcct;
    @XmlElement(name = "Pyee")
    protected PartyIdentification272 pyee;
    @XmlElement(name = "PyeeAcct")
    protected CashAccount40 pyeeAcct;
    @XmlElement(name = "ChqCxlOrStopRsn")
    protected ChequeCancellationReason1 chqCxlOrStopRsn;

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
    public Cheque20 setInstrId(String value) {
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
    public Cheque20 setOrgnlInstrId(String value) {
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
    public Cheque20 setChqNb(String value) {
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
    public XMLGregorianCalendar getIsseDt() {
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
    public Cheque20 setIsseDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getStlDt() {
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
    public Cheque20 setStlDt(XMLGregorianCalendar value) {
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
    public Cheque20 setAmt(ActiveCurrencyAndAmount value) {
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
    public Cheque20 setFctvDt(DateAndDateTime2Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the drwrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDrwrAgt() {
        return drwrAgt;
    }

    /**
     * Sets the value of the drwrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public Cheque20 setDrwrAgt(BranchAndFinancialInstitutionIdentification8 value) {
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
    public Cheque20 setDrwrAgtAcct(CashAccount40 value) {
        this.drwrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Cheque20 setPyee(PartyIdentification272 value) {
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
    public Cheque20 setPyeeAcct(CashAccount40 value) {
        this.pyeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the chqCxlOrStopRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeCancellationReason1 }
     *     
     */
    public ChequeCancellationReason1 getChqCxlOrStopRsn() {
        return chqCxlOrStopRsn;
    }

    /**
     * Sets the value of the chqCxlOrStopRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeCancellationReason1 }
     *     
     */
    public Cheque20 setChqCxlOrStopRsn(ChequeCancellationReason1 value) {
        this.chqCxlOrStopRsn = value;
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
