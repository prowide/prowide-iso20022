
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the realisation of benefits taken from a pension.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitCrystallisationEvent1", propOrder = {
    "evtTp",
    "evtNb",
    "evtDt",
    "crstllstnAmt",
    "pctgOfAllwnc",
    "addtlInf"
})
public class BenefitCrystallisationEvent1 {

    @XmlElement(name = "EvtTp")
    protected DrawdownEventType1Choice evtTp;
    @XmlElement(name = "EvtNb")
    protected String evtNb;
    @XmlElement(name = "EvtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "CrstllstnAmt")
    protected ActiveCurrencyAnd13DecimalAmount crstllstnAmt;
    @XmlElement(name = "PctgOfAllwnc")
    protected BigDecimal pctgOfAllwnc;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownEventType1Choice }
     *     
     */
    public DrawdownEventType1Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownEventType1Choice }
     *     
     */
    public BenefitCrystallisationEvent1 setEvtTp(DrawdownEventType1Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the evtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtNb() {
        return evtNb;
    }

    /**
     * Sets the value of the evtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitCrystallisationEvent1 setEvtNb(String value) {
        this.evtNb = value;
        return this;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public BenefitCrystallisationEvent1 setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the crstllstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCrstllstnAmt() {
        return crstllstnAmt;
    }

    /**
     * Sets the value of the crstllstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public BenefitCrystallisationEvent1 setCrstllstnAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.crstllstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfAllwnc() {
        return pctgOfAllwnc;
    }

    /**
     * Sets the value of the pctgOfAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BenefitCrystallisationEvent1 setPctgOfAllwnc(BigDecimal value) {
        this.pctgOfAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public BenefitCrystallisationEvent1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
