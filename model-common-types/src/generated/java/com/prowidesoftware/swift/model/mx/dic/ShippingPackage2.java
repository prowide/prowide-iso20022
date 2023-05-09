
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
@XmlType(name = "ShippingPackage2", propOrder = {
    "trckgNb",
    "spplr",
    "pckpDt",
    "pckpTm",
    "dlvry",
    "wght",
    "pdct",
    "insrncInd",
    "insrncAmt"
})
public class ShippingPackage2 {

    @XmlElement(name = "TrckgNb")
    protected String trckgNb;
    @XmlElement(name = "Spplr")
    protected PartyIdentification260 spplr;
    @XmlElement(name = "PckpDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pckpDt;
    @XmlElement(name = "PckpTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime pckpTm;
    @XmlElement(name = "Dlvry")
    protected DeliveryInformation4 dlvry;
    @XmlElement(name = "Wght")
    protected UnitOfMeasure2 wght;
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
    public ShippingPackage2 setTrckgNb(String value) {
        this.trckgNb = value;
        return this;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification260 }
     *     
     */
    public PartyIdentification260 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification260 }
     *     
     */
    public ShippingPackage2 setSpplr(PartyIdentification260 value) {
        this.spplr = value;
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
    public ShippingPackage2 setPckpDt(LocalDate value) {
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
    public ShippingPackage2 setPckpTm(OffsetTime value) {
        this.pckpTm = value;
        return this;
    }

    /**
     * Gets the value of the dlvry property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation4 }
     *     
     */
    public DeliveryInformation4 getDlvry() {
        return dlvry;
    }

    /**
     * Sets the value of the dlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation4 }
     *     
     */
    public ShippingPackage2 setDlvry(DeliveryInformation4 value) {
        this.dlvry = value;
        return this;
    }

    /**
     * Gets the value of the wght property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure2 }
     *     
     */
    public UnitOfMeasure2 getWght() {
        return wght;
    }

    /**
     * Sets the value of the wght property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure2 }
     *     
     */
    public ShippingPackage2 setWght(UnitOfMeasure2 value) {
        this.wght = value;
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
     * {@link Product7 }
     * 
     * 
     * @return
     *     The value of the pdct property.
     */
    public List<Product7> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<>();
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
    public ShippingPackage2 setInsrncInd(Boolean value) {
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
    public ShippingPackage2 setInsrncAmt(BigDecimal value) {
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
    public ShippingPackage2 addPdct(Product7 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
