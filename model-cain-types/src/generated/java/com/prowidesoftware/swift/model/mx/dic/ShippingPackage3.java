
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
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
@XmlType(name = "ShippingPackage3", propOrder = {
    "trckgNb",
    "spplrNm",
    "spplrId",
    "spplrAdr",
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
public class ShippingPackage3 {

    @XmlElement(name = "TrckgNb")
    protected String trckgNb;
    @XmlElement(name = "SpplrNm")
    protected String spplrNm;
    @XmlElement(name = "SpplrId")
    protected PartyIdentification285 spplrId;
    @XmlElement(name = "SpplrAdr")
    protected Address2 spplrAdr;
    @XmlElement(name = "SpplrCtct")
    protected ContactBusiness1 spplrCtct;
    @XmlElement(name = "SpplrInstrs")
    protected String spplrInstrs;
    @XmlElement(name = "PckpDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pckpDt;
    @XmlElement(name = "PckpTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pckpTm;
    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "DlvryAdr")
    protected Address2 dlvryAdr;
    @XmlElement(name = "DlvryCtct")
    protected ContactPersonal1 dlvryCtct;
    @XmlElement(name = "DlvryInstrs")
    protected String dlvryInstrs;
    @XmlElement(name = "DlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlvryDt;
    @XmlElement(name = "DlvryTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dlvryTm;
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
    public ShippingPackage3 setTrckgNb(String value) {
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
    public ShippingPackage3 setSpplrNm(String value) {
        this.spplrNm = value;
        return this;
    }

    /**
     * Gets the value of the spplrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getSpplrId() {
        return spplrId;
    }

    /**
     * Sets the value of the spplrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public ShippingPackage3 setSpplrId(PartyIdentification285 value) {
        this.spplrId = value;
        return this;
    }

    /**
     * Gets the value of the spplrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getSpplrAdr() {
        return spplrAdr;
    }

    /**
     * Sets the value of the spplrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public ShippingPackage3 setSpplrAdr(Address2 value) {
        this.spplrAdr = value;
        return this;
    }

    /**
     * Gets the value of the spplrCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getSpplrCtct() {
        return spplrCtct;
    }

    /**
     * Sets the value of the spplrCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ShippingPackage3 setSpplrCtct(ContactBusiness1 value) {
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
    public ShippingPackage3 setSpplrInstrs(String value) {
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
    public XMLGregorianCalendar getPckpDt() {
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
    public ShippingPackage3 setPckpDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getPckpTm() {
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
    public ShippingPackage3 setPckpTm(XMLGregorianCalendar value) {
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
    public ShippingPackage3 setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getDlvryAdr() {
        return dlvryAdr;
    }

    /**
     * Sets the value of the dlvryAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public ShippingPackage3 setDlvryAdr(Address2 value) {
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
    public ShippingPackage3 setDlvryCtct(ContactPersonal1 value) {
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
    public ShippingPackage3 setDlvryInstrs(String value) {
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
    public XMLGregorianCalendar getDlvryDt() {
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
    public ShippingPackage3 setDlvryDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getDlvryTm() {
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
    public ShippingPackage3 setDlvryTm(XMLGregorianCalendar value) {
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
    public ShippingPackage3 setWghtUnit(UnitOfMeasure1Code value) {
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
    public ShippingPackage3 setOthrWghtUnit(String value) {
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
    public ShippingPackage3 setNbOfUnits(BigDecimal value) {
        this.nbOfUnits = value;
        return this;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdct property.
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
     */
    public List<Product8> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<Product8>();
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
    public ShippingPackage3 setInsrnc(Boolean value) {
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
    public ShippingPackage3 setInsrncAmt(BigDecimal value) {
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
     * Adds a new item to the pdct list.
     * @see #getPdct()
     * 
     */
    public ShippingPackage3 addPdct(Product8 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
