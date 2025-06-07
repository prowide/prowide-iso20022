
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Shipping or Courier Service delivery. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingData3", propOrder = {
    "invcNb",
    "invcCreDtTm",
    "svcDscrptrCd",
    "incntivAmt",
    "miscExpnss",
    "insrnc",
    "insrncAmt",
    "netAmt",
    "tax",
    "summryCmmdtyId",
    "nbOfPackgs",
    "packg",
    "addtlData"
})
public class ShippingData3 {

    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "InvcCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invcCreDtTm;
    @XmlElement(name = "SvcDscrptrCd")
    protected String svcDscrptrCd;
    @XmlElement(name = "IncntivAmt")
    protected BigDecimal incntivAmt;
    @XmlElement(name = "MiscExpnss")
    protected BigDecimal miscExpnss;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;
    @XmlElement(name = "Tax")
    protected List<Tax41> tax;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "NbOfPackgs")
    protected String nbOfPackgs;
    @XmlElement(name = "Packg")
    protected List<ShippingPackage3> packg;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingData3 setInvcNb(String value) {
        this.invcNb = value;
        return this;
    }

    /**
     * Gets the value of the invcCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getInvcCreDtTm() {
        return invcCreDtTm;
    }

    /**
     * Sets the value of the invcCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingData3 setInvcCreDtTm(XMLGregorianCalendar value) {
        this.invcCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the svcDscrptrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDscrptrCd() {
        return svcDscrptrCd;
    }

    /**
     * Sets the value of the svcDscrptrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingData3 setSvcDscrptrCd(String value) {
        this.svcDscrptrCd = value;
        return this;
    }

    /**
     * Gets the value of the incntivAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncntivAmt() {
        return incntivAmt;
    }

    /**
     * Sets the value of the incntivAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShippingData3 setIncntivAmt(BigDecimal value) {
        this.incntivAmt = value;
        return this;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscExpnss() {
        return miscExpnss;
    }

    /**
     * Sets the value of the miscExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShippingData3 setMiscExpnss(BigDecimal value) {
        this.miscExpnss = value;
        return this;
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
    public ShippingData3 setInsrnc(Boolean value) {
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
    public ShippingData3 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShippingData3 setNetAmt(BigDecimal value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax41 }
     * 
     * 
     */
    public List<Tax41> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax41>();
        }
        return this.tax;
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
    public ShippingData3 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfPackgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfPackgs() {
        return nbOfPackgs;
    }

    /**
     * Sets the value of the nbOfPackgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShippingData3 setNbOfPackgs(String value) {
        this.nbOfPackgs = value;
        return this;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingPackage3 }
     * 
     * 
     */
    public List<ShippingPackage3> getPackg() {
        if (packg == null) {
            packg = new ArrayList<ShippingPackage3>();
        }
        return this.packg;
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
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public ShippingData3 addTax(Tax41 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the packg list.
     * @see #getPackg()
     * 
     */
    public ShippingData3 addPackg(ShippingPackage3 packg) {
        getPackg().add(packg);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public ShippingData3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
