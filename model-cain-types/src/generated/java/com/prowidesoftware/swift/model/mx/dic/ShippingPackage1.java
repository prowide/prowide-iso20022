
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "ShippingPackage1", propOrder = {
    "trckgNb",
    "spplr",
    "pckpTm",
    "dlvry",
    "wght",
    "pdct",
    "insrncInd",
    "insrncAmt"
})
public class ShippingPackage1 {

    @XmlElement(name = "TrckgNb")
    protected String trckgNb;
    @XmlElement(name = "Spplr")
    protected PartyIdentification209 spplr;
    @XmlElement(name = "PckpTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pckpTm;
    @XmlElement(name = "Dlvry")
    protected DeliveryInformation3 dlvry;
    @XmlElement(name = "Wght")
    protected UnitOfMeasure1 wght;
    @XmlElement(name = "Pdct")
    protected List<Product7> pdct;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
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
    public ShippingPackage1 setTrckgNb(String value) {
        this.trckgNb = value;
        return this;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification209 }
     *     
     */
    public PartyIdentification209 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification209 }
     *     
     */
    public ShippingPackage1 setSpplr(PartyIdentification209 value) {
        this.spplr = value;
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
    public ShippingPackage1 setPckpTm(XMLGregorianCalendar value) {
        this.pckpTm = value;
        return this;
    }

    /**
     * Gets the value of the dlvry property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation3 }
     *     
     */
    public DeliveryInformation3 getDlvry() {
        return dlvry;
    }

    /**
     * Sets the value of the dlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation3 }
     *     
     */
    public ShippingPackage1 setDlvry(DeliveryInformation3 value) {
        this.dlvry = value;
        return this;
    }

    /**
     * Gets the value of the wght property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1 }
     *     
     */
    public UnitOfMeasure1 getWght() {
        return wght;
    }

    /**
     * Sets the value of the wght property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1 }
     *     
     */
    public ShippingPackage1 setWght(UnitOfMeasure1 value) {
        this.wght = value;
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
     * {@link Product7 }
     * 
     * 
     */
    public List<Product7> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<Product7>();
        }
        return this.pdct;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ShippingPackage1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
    public ShippingPackage1 setInsrncAmt(BigDecimal value) {
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
    public ShippingPackage1 addPdct(Product7 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
