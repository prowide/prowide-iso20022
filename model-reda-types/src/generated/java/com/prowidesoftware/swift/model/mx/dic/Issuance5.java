
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Issuance5", propOrder = {
    "issePlc",
    "ctryOfIsse",
    "isseDt",
    "anncmntDt",
    "isinVldFr",
    "issrOrg",
    "isseNmnlAmt",
    "fullIssdAmt",
    "isseSz",
    "issePric",
    "issncDstrbtn",
    "govngLaw"
})
public class Issuance5 {

    @XmlElement(name = "IssePlc")
    protected String issePlc;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "IsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anncmntDt;
    @XmlElement(name = "ISINVldFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isinVldFr;
    @XmlElement(name = "IssrOrg")
    protected Organisation38 issrOrg;
    @XmlElement(name = "IsseNmnlAmt")
    protected FinancialInstrumentQuantity1Choice isseNmnlAmt;
    @XmlElement(name = "FullIssdAmt")
    protected ActiveCurrencyAndAmount fullIssdAmt;
    @XmlElement(name = "IsseSz")
    protected BigDecimal isseSz;
    @XmlElement(name = "IssePric")
    protected PriceValue1 issePric;
    @XmlElement(name = "IssncDstrbtn")
    protected SecuritiesTransactionType31Choice issncDstrbtn;
    @XmlElement(name = "GovngLaw")
    protected List<Jurisdiction1> govngLaw;

    /**
     * Gets the value of the issePlc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssePlc() {
        return issePlc;
    }

    /**
     * Sets the value of the issePlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Issuance5 setIssePlc(String value) {
        this.issePlc = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Issuance5 setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
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
    public Issuance5 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Issuance5 setAnncmntDt(XMLGregorianCalendar value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the isinVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getISINVldFr() {
        return isinVldFr;
    }

    /**
     * Sets the value of the isinVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Issuance5 setISINVldFr(XMLGregorianCalendar value) {
        this.isinVldFr = value;
        return this;
    }

    /**
     * Gets the value of the issrOrg property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getIssrOrg() {
        return issrOrg;
    }

    /**
     * Sets the value of the issrOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public Issuance5 setIssrOrg(Organisation38 value) {
        this.issrOrg = value;
        return this;
    }

    /**
     * Gets the value of the isseNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getIsseNmnlAmt() {
        return isseNmnlAmt;
    }

    /**
     * Sets the value of the isseNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public Issuance5 setIsseNmnlAmt(FinancialInstrumentQuantity1Choice value) {
        this.isseNmnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the fullIssdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFullIssdAmt() {
        return fullIssdAmt;
    }

    /**
     * Sets the value of the fullIssdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Issuance5 setFullIssdAmt(ActiveCurrencyAndAmount value) {
        this.fullIssdAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsseSz() {
        return isseSz;
    }

    /**
     * Sets the value of the isseSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Issuance5 setIsseSz(BigDecimal value) {
        this.isseSz = value;
        return this;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public Issuance5 setIssePric(PriceValue1 value) {
        this.issePric = value;
        return this;
    }

    /**
     * Gets the value of the issncDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType31Choice }
     *     
     */
    public SecuritiesTransactionType31Choice getIssncDstrbtn() {
        return issncDstrbtn;
    }

    /**
     * Sets the value of the issncDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType31Choice }
     *     
     */
    public Issuance5 setIssncDstrbtn(SecuritiesTransactionType31Choice value) {
        this.issncDstrbtn = value;
        return this;
    }

    /**
     * Gets the value of the govngLaw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govngLaw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngLaw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jurisdiction1 }
     * 
     * 
     */
    public List<Jurisdiction1> getGovngLaw() {
        if (govngLaw == null) {
            govngLaw = new ArrayList<Jurisdiction1>();
        }
        return this.govngLaw;
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
     * Adds a new item to the govngLaw list.
     * @see #getGovngLaw()
     * 
     */
    public Issuance5 addGovngLaw(Jurisdiction1 govngLaw) {
        getGovngLaw().add(govngLaw);
        return this;
    }

}
