
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Invoice data pertaining to the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice4", propOrder = {
    "nb",
    "dt",
    "creDtTm",
    "summryCmmdtyId",
    "sellrNm",
    "sellrId",
    "sellrBizNm",
    "sellrLglCorpNm",
    "sellrLclData",
    "sellrAdr",
    "sellrCtct",
    "sellrTaxRegnId",
    "sellrAddtlInf",
    "buyrNm",
    "buyrId",
    "buyrBizNm",
    "buyrLglCorpNm",
    "buyrLclData",
    "buyrAdr",
    "buyrCtct",
    "buyrTaxRegnId",
    "buyrAddtlInf",
    "frghtAmt",
    "taxTtl",
    "taxRclmMtd",
    "prvtData",
    "ntlData",
    "lineItm"
})
public class Invoice4 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "SellrNm")
    protected String sellrNm;
    @XmlElement(name = "SellrId")
    protected String sellrId;
    @XmlElement(name = "SellrBizNm")
    protected String sellrBizNm;
    @XmlElement(name = "SellrLglCorpNm")
    protected String sellrLglCorpNm;
    @XmlElement(name = "SellrLclData")
    protected List<LocalData20> sellrLclData;
    @XmlElement(name = "SellrAdr")
    protected Address4 sellrAdr;
    @XmlElement(name = "SellrCtct")
    protected ContactBusiness1 sellrCtct;
    @XmlElement(name = "SellrTaxRegnId")
    protected String sellrTaxRegnId;
    @XmlElement(name = "SellrAddtlInf")
    protected String sellrAddtlInf;
    @XmlElement(name = "BuyrNm")
    protected String buyrNm;
    @XmlElement(name = "BuyrId")
    protected String buyrId;
    @XmlElement(name = "BuyrBizNm")
    protected String buyrBizNm;
    @XmlElement(name = "BuyrLglCorpNm")
    protected String buyrLglCorpNm;
    @XmlElement(name = "BuyrLclData")
    protected List<LocalData20> buyrLclData;
    @XmlElement(name = "BuyrAdr")
    protected Address4 buyrAdr;
    @XmlElement(name = "BuyrCtct")
    protected ContactBusiness1 buyrCtct;
    @XmlElement(name = "BuyrTaxRegnId")
    protected String buyrTaxRegnId;
    @XmlElement(name = "BuyrAddtlInf")
    protected String buyrAddtlInf;
    @XmlElement(name = "FrghtAmt")
    protected BigDecimal frghtAmt;
    @XmlElement(name = "TaxTtl")
    protected List<Tax44> taxTtl;
    @XmlElement(name = "TaxRclmMtd")
    @XmlSchemaType(name = "string")
    protected TaxReclaimMethod1Code taxRclmMtd;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;
    @XmlElement(name = "LineItm")
    protected List<InvoiceLineItem4> lineItm;

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
    public Invoice4 setNb(String value) {
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
    public LocalDate getDt() {
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
    public Invoice4 setDt(LocalDate value) {
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
    public OffsetDateTime getCreDtTm() {
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
    public Invoice4 setCreDtTm(OffsetDateTime value) {
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
    public Invoice4 setSummryCmmdtyId(String value) {
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
    public Invoice4 setSellrNm(String value) {
        this.sellrNm = value;
        return this;
    }

    /**
     * Gets the value of the sellrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrId() {
        return sellrId;
    }

    /**
     * Sets the value of the sellrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setSellrId(String value) {
        this.sellrId = value;
        return this;
    }

    /**
     * Gets the value of the sellrBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrBizNm() {
        return sellrBizNm;
    }

    /**
     * Sets the value of the sellrBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setSellrBizNm(String value) {
        this.sellrBizNm = value;
        return this;
    }

    /**
     * Gets the value of the sellrLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrLglCorpNm() {
        return sellrLglCorpNm;
    }

    /**
     * Sets the value of the sellrLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setSellrLglCorpNm(String value) {
        this.sellrLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the sellrLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the sellrLclData property.
     */
    public List<LocalData20> getSellrLclData() {
        if (sellrLclData == null) {
            sellrLclData = new ArrayList<>();
        }
        return this.sellrLclData;
    }

    /**
     * Gets the value of the sellrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getSellrAdr() {
        return sellrAdr;
    }

    /**
     * Sets the value of the sellrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public Invoice4 setSellrAdr(Address4 value) {
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
    public Invoice4 setSellrCtct(ContactBusiness1 value) {
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
    public Invoice4 setSellrTaxRegnId(String value) {
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
    public Invoice4 setSellrAddtlInf(String value) {
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
    public Invoice4 setBuyrNm(String value) {
        this.buyrNm = value;
        return this;
    }

    /**
     * Gets the value of the buyrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrId() {
        return buyrId;
    }

    /**
     * Sets the value of the buyrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setBuyrId(String value) {
        this.buyrId = value;
        return this;
    }

    /**
     * Gets the value of the buyrBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrBizNm() {
        return buyrBizNm;
    }

    /**
     * Sets the value of the buyrBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setBuyrBizNm(String value) {
        this.buyrBizNm = value;
        return this;
    }

    /**
     * Gets the value of the buyrLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrLglCorpNm() {
        return buyrLglCorpNm;
    }

    /**
     * Sets the value of the buyrLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Invoice4 setBuyrLglCorpNm(String value) {
        this.buyrLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the buyrLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the buyrLclData property.
     */
    public List<LocalData20> getBuyrLclData() {
        if (buyrLclData == null) {
            buyrLclData = new ArrayList<>();
        }
        return this.buyrLclData;
    }

    /**
     * Gets the value of the buyrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getBuyrAdr() {
        return buyrAdr;
    }

    /**
     * Sets the value of the buyrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public Invoice4 setBuyrAdr(Address4 value) {
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
    public Invoice4 setBuyrCtct(ContactBusiness1 value) {
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
    public Invoice4 setBuyrTaxRegnId(String value) {
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
    public Invoice4 setBuyrAddtlInf(String value) {
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
    public Invoice4 setFrghtAmt(BigDecimal value) {
        this.frghtAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTtl property.
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
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the taxTtl property.
     */
    public List<Tax44> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<>();
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
    public Invoice4 setTaxRclmMtd(TaxReclaimMethod1Code value) {
        this.taxRclmMtd = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
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
     * {@link InvoiceLineItem4 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<InvoiceLineItem4> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
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
     * Adds a new item to the sellrLclData list.
     * @see #getSellrLclData()
     * 
     */
    public Invoice4 addSellrLclData(LocalData20 sellrLclData) {
        getSellrLclData().add(sellrLclData);
        return this;
    }

    /**
     * Adds a new item to the buyrLclData list.
     * @see #getBuyrLclData()
     * 
     */
    public Invoice4 addBuyrLclData(LocalData20 buyrLclData) {
        getBuyrLclData().add(buyrLclData);
        return this;
    }

    /**
     * Adds a new item to the taxTtl list.
     * @see #getTaxTtl()
     * 
     */
    public Invoice4 addTaxTtl(Tax44 taxTtl) {
        getTaxTtl().add(taxTtl);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Invoice4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Invoice4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public Invoice4 addLineItm(InvoiceLineItem4 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
