
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Contains the details of the package
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackage4", propOrder = {
    "trckgNb",
    "spplrNm",
    "spplrId",
    "spplrBizNm",
    "spplrLglCorpNm",
    "spplrAdr",
    "spplrLclData",
    "spplrCtct",
    "spplrInstrs",
    "pckpDt",
    "pckpTm",
    "dlvryNoteNb",
    "dlvryAdr",
    "dlvryCtct",
    "dlvryInstrs",
    "dlvryDt",
    "dlvryTm",
    "wghtUnit",
    "othrWghtUnit",
    "nbOfUnits",
    "pdct",
    "insrnc",
    "insrncAmt"
})
public class ShippingPackage4 {

    @XmlElement(name = "TrckgNb")
    protected String trckgNb;
    @XmlElement(name = "SpplrNm")
    protected String spplrNm;
    @XmlElement(name = "SpplrId")
    protected String spplrId;
    @XmlElement(name = "SpplrBizNm")
    protected String spplrBizNm;
    @XmlElement(name = "SpplrLglCorpNm")
    protected String spplrLglCorpNm;
    @XmlElement(name = "SpplrAdr")
    protected Address4 spplrAdr;
    @XmlElement(name = "SpplrLclData")
    protected List<LocalData20> spplrLclData;
    @XmlElement(name = "SpplrCtct")
    protected ContactBusiness2 spplrCtct;
    @XmlElement(name = "SpplrInstrs")
    protected String spplrInstrs;
    @XmlElement(name = "PckpDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pckpDt;
    @XmlElement(name = "PckpTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime pckpTm;
    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "DlvryAdr")
    protected Address4 dlvryAdr;
    @XmlElement(name = "DlvryCtct")
    protected ContactPersonal1 dlvryCtct;
    @XmlElement(name = "DlvryInstrs")
    protected String dlvryInstrs;
    @XmlElement(name = "DlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dlvryDt;
    @XmlElement(name = "DlvryTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime dlvryTm;
    @XmlElement(name = "WghtUnit")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code wghtUnit;
    @XmlElement(name = "OthrWghtUnit")
    protected String othrWghtUnit;
    @XmlElement(name = "NbOfUnits")
    protected BigDecimal nbOfUnits;
    @XmlElement(name = "Pdct")
    protected List<Product8> pdct;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;

    /**
     * Gets the value of the trckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckgNb() {
        return trckgNb;
    }

    /**
     * Sets the value of the trckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setTrckgNb(String value) {
        this.trckgNb = value;
        return this;
    }

    /**
     * Gets the value of the spplrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpplrNm() {
        return spplrNm;
    }

    /**
     * Sets the value of the spplrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setSpplrNm(String value) {
        this.spplrNm = value;
        return this;
    }

    /**
     * Gets the value of the spplrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpplrId() {
        return spplrId;
    }

    /**
     * Sets the value of the spplrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setSpplrId(String value) {
        this.spplrId = value;
        return this;
    }

    /**
     * Gets the value of the spplrBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpplrBizNm() {
        return spplrBizNm;
    }

    /**
     * Sets the value of the spplrBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setSpplrBizNm(String value) {
        this.spplrBizNm = value;
        return this;
    }

    /**
     * Gets the value of the spplrLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpplrLglCorpNm() {
        return spplrLglCorpNm;
    }

    /**
     * Sets the value of the spplrLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setSpplrLglCorpNm(String value) {
        this.spplrLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the spplrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getSpplrAdr() {
        return spplrAdr;
    }

    /**
     * Sets the value of the spplrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public ShippingPackage4 setSpplrAdr(Address4 value) {
        this.spplrAdr = value;
        return this;
    }

    /**
     * Gets the value of the spplrLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spplrLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpplrLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the spplrLclData property.
     */
    public List<LocalData20> getSpplrLclData() {
        if (spplrLclData == null) {
            spplrLclData = new ArrayList<>();
        }
        return this.spplrLclData;
    }

    /**
     * Gets the value of the spplrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness2 }
     *     
     */
    public ContactBusiness2 getSpplrCtct() {
        return spplrCtct;
    }

    /**
     * Sets the value of the spplrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness2 }
     *     
     */
    public ShippingPackage4 setSpplrCtct(ContactBusiness2 value) {
        this.spplrCtct = value;
        return this;
    }

    /**
     * Gets the value of the spplrInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpplrInstrs() {
        return spplrInstrs;
    }

    /**
     * Sets the value of the spplrInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setSpplrInstrs(String value) {
        this.spplrInstrs = value;
        return this;
    }

    /**
     * Gets the value of the pckpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPckpDt() {
        return pckpDt;
    }

    /**
     * Sets the value of the pckpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setPckpDt(LocalDate value) {
        this.pckpDt = value;
        return this;
    }

    /**
     * Gets the value of the pckpTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getPckpTm() {
        return pckpTm;
    }

    /**
     * Sets the value of the pckpTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setPckpTm(OffsetTime value) {
        this.pckpTm = value;
        return this;
    }

    /**
     * Gets the value of the dlvryNoteNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryNoteNb() {
        return dlvryNoteNb;
    }

    /**
     * Sets the value of the dlvryNoteNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getDlvryAdr() {
        return dlvryAdr;
    }

    /**
     * Sets the value of the dlvryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public ShippingPackage4 setDlvryAdr(Address4 value) {
        this.dlvryAdr = value;
        return this;
    }

    /**
     * Gets the value of the dlvryCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonal1 }
     *     
     */
    public ContactPersonal1 getDlvryCtct() {
        return dlvryCtct;
    }

    /**
     * Sets the value of the dlvryCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonal1 }
     *     
     */
    public ShippingPackage4 setDlvryCtct(ContactPersonal1 value) {
        this.dlvryCtct = value;
        return this;
    }

    /**
     * Gets the value of the dlvryInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryInstrs() {
        return dlvryInstrs;
    }

    /**
     * Sets the value of the dlvryInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setDlvryInstrs(String value) {
        this.dlvryInstrs = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setDlvryDt(LocalDate value) {
        this.dlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getDlvryTm() {
        return dlvryTm;
    }

    /**
     * Sets the value of the dlvryTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setDlvryTm(OffsetTime value) {
        this.dlvryTm = value;
        return this;
    }

    /**
     * Gets the value of the wghtUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getWghtUnit() {
        return wghtUnit;
    }

    /**
     * Sets the value of the wghtUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public ShippingPackage4 setWghtUnit(UnitOfMeasure1Code value) {
        this.wghtUnit = value;
        return this;
    }

    /**
     * Gets the value of the othrWghtUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrWghtUnit() {
        return othrWghtUnit;
    }

    /**
     * Sets the value of the othrWghtUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingPackage4 setOthrWghtUnit(String value) {
        this.othrWghtUnit = value;
        return this;
    }

    /**
     * Gets the value of the nbOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfUnits() {
        return nbOfUnits;
    }

    /**
     * Sets the value of the nbOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShippingPackage4 setNbOfUnits(BigDecimal value) {
        this.nbOfUnits = value;
        return this;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product8 }
     * 
     * 
     * @return
     *     The value of the pdct property.
     */
    public List<Product8> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<>();
        }
        return this.pdct;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ShippingPackage4 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShippingPackage4 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
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

    /**
     * Adds a new item to the spplrLclData list.
     * @see #getSpplrLclData()
     * 
     */
    public ShippingPackage4 addSpplrLclData(LocalData20 spplrLclData) {
        getSpplrLclData().add(spplrLclData);
        return this;
    }

    /**
     * Adds a new item to the pdct list.
     * @see #getPdct()
     * 
     */
    public ShippingPackage4 addPdct(Product8 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
