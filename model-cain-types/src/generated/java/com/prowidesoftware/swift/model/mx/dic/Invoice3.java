
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
 * Invoice data pertaining to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice3", propOrder = {
    "nb",
    "dt",
    "creDtTm",
    "summryCmmdtyId",
    "sellrNm",
    "sellrId",
    "sellrAdr",
    "sellrCtct",
    "sellrTaxRegnId",
    "sellrAddtlInf",
    "buyrNm",
    "buyrId",
    "buyrAdr",
    "buyrCtct",
    "buyrTaxRegnId",
    "buyrAddtlInf",
    "frghtAmt",
    "taxTtl",
    "taxRclmMtd",
    "addtlData",
    "lineItm"
})
public class Invoice3 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "SellrNm")
    protected String sellrNm;
    @XmlElement(name = "SellrId")
    protected PartyIdentification285 sellrId;
    @XmlElement(name = "SellrAdr")
    protected Address2 sellrAdr;
    @XmlElement(name = "SellrCtct")
    protected ContactBusiness1 sellrCtct;
    @XmlElement(name = "SellrTaxRegnId")
    protected String sellrTaxRegnId;
    @XmlElement(name = "SellrAddtlInf")
    protected String sellrAddtlInf;
    @XmlElement(name = "BuyrNm")
    protected String buyrNm;
    @XmlElement(name = "BuyrId")
    protected PartyIdentification285 buyrId;
    @XmlElement(name = "BuyrAdr")
    protected Address2 buyrAdr;
    @XmlElement(name = "BuyrCtct")
    protected ContactBusiness1 buyrCtct;
    @XmlElement(name = "BuyrTaxRegnId")
    protected String buyrTaxRegnId;
    @XmlElement(name = "BuyrAddtlInf")
    protected String buyrAddtlInf;
    @XmlElement(name = "FrghtAmt")
    protected BigDecimal frghtAmt;
    @XmlElement(name = "TaxTtl")
    protected List<Tax41> taxTtl;
    @XmlElement(name = "TaxRclmMtd")
    @XmlSchemaType(name = "string")
    protected TaxReclaimMethod1Code taxRclmMtd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LineItm")
    protected List<InvoiceLineItem3> lineItm;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the sellrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrNm() {
        return sellrNm;
    }

    /**
     * Sets the value of the sellrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setSellrNm(String value) {
        this.sellrNm = value;
        return this;
    }

    /**
     * Gets the value of the sellrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getSellrId() {
        return sellrId;
    }

    /**
     * Sets the value of the sellrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public Invoice3 setSellrId(PartyIdentification285 value) {
        this.sellrId = value;
        return this;
    }

    /**
     * Gets the value of the sellrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getSellrAdr() {
        return sellrAdr;
    }

    /**
     * Sets the value of the sellrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public Invoice3 setSellrAdr(Address2 value) {
        this.sellrAdr = value;
        return this;
    }

    /**
     * Gets the value of the sellrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getSellrCtct() {
        return sellrCtct;
    }

    /**
     * Sets the value of the sellrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public Invoice3 setSellrCtct(ContactBusiness1 value) {
        this.sellrCtct = value;
        return this;
    }

    /**
     * Gets the value of the sellrTaxRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrTaxRegnId() {
        return sellrTaxRegnId;
    }

    /**
     * Sets the value of the sellrTaxRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setSellrTaxRegnId(String value) {
        this.sellrTaxRegnId = value;
        return this;
    }

    /**
     * Gets the value of the sellrAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrAddtlInf() {
        return sellrAddtlInf;
    }

    /**
     * Sets the value of the sellrAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setSellrAddtlInf(String value) {
        this.sellrAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the buyrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrNm() {
        return buyrNm;
    }

    /**
     * Sets the value of the buyrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setBuyrNm(String value) {
        this.buyrNm = value;
        return this;
    }

    /**
     * Gets the value of the buyrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getBuyrId() {
        return buyrId;
    }

    /**
     * Sets the value of the buyrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public Invoice3 setBuyrId(PartyIdentification285 value) {
        this.buyrId = value;
        return this;
    }

    /**
     * Gets the value of the buyrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getBuyrAdr() {
        return buyrAdr;
    }

    /**
     * Sets the value of the buyrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public Invoice3 setBuyrAdr(Address2 value) {
        this.buyrAdr = value;
        return this;
    }

    /**
     * Gets the value of the buyrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getBuyrCtct() {
        return buyrCtct;
    }

    /**
     * Sets the value of the buyrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public Invoice3 setBuyrCtct(ContactBusiness1 value) {
        this.buyrCtct = value;
        return this;
    }

    /**
     * Gets the value of the buyrTaxRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrTaxRegnId() {
        return buyrTaxRegnId;
    }

    /**
     * Sets the value of the buyrTaxRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setBuyrTaxRegnId(String value) {
        this.buyrTaxRegnId = value;
        return this;
    }

    /**
     * Gets the value of the buyrAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrAddtlInf() {
        return buyrAddtlInf;
    }

    /**
     * Sets the value of the buyrAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice3 setBuyrAddtlInf(String value) {
        this.buyrAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the frghtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrghtAmt() {
        return frghtAmt;
    }

    /**
     * Sets the value of the frghtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Invoice3 setFrghtAmt(BigDecimal value) {
        this.frghtAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<Tax41>();
        }
        return this.taxTtl;
    }

    /**
     * Gets the value of the taxRclmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public TaxReclaimMethod1Code getTaxRclmMtd() {
        return taxRclmMtd;
    }

    /**
     * Sets the value of the taxRclmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public Invoice3 setTaxRclmMtd(TaxReclaimMethod1Code value) {
        this.taxRclmMtd = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItem3 }
     * 
     * 
     */
    public List<InvoiceLineItem3> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<InvoiceLineItem3>();
        }
        return this.lineItm;
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
     * Adds a new item to the taxTtl list.
     * @see #getTaxTtl()
     * 
     */
    public Invoice3 addTaxTtl(Tax41 taxTtl) {
        getTaxTtl().add(taxTtl);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Invoice3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public Invoice3 addLineItm(InvoiceLineItem3 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
