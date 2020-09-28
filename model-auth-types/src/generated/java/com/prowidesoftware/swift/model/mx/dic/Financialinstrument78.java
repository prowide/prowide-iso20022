
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the characteristics of the assets held by the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Financialinstrument78", propOrder = {
    "asstTp",
    "asstId",
    "ptyData",
    "asstCtry",
    "asstValtn",
    "derivInstrmAttrbts",
    "collData",
    "fincgUndrlygTp"
})
public class Financialinstrument78 {

    @XmlElement(name = "AsstTp", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialAssetType2Code asstTp;
    @XmlElement(name = "AsstId", required = true)
    protected AssetIdentification2 asstId;
    @XmlElement(name = "PtyData")
    protected Party45Choice ptyData;
    @XmlElement(name = "AsstCtry")
    protected String asstCtry;
    @XmlElement(name = "AsstValtn", required = true)
    protected AssetValuation1 asstValtn;
    @XmlElement(name = "DerivInstrmAttrbts")
    protected DerivativeInstrument7 derivInstrmAttrbts;
    @XmlElement(name = "CollData")
    protected List<FinancialInstrument74> collData;
    @XmlElement(name = "FincgUndrlygTp")
    @XmlSchemaType(name = "string")
    protected FinancingUnderlyingType1Code fincgUndrlygTp;

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAssetType2Code }
     *     
     */
    public FinancialAssetType2Code getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAssetType2Code }
     *     
     */
    public Financialinstrument78 setAsstTp(FinancialAssetType2Code value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the asstId property.
     * 
     * @return
     *     possible object is
     *     {@link AssetIdentification2 }
     *     
     */
    public AssetIdentification2 getAsstId() {
        return asstId;
    }

    /**
     * Sets the value of the asstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetIdentification2 }
     *     
     */
    public Financialinstrument78 setAsstId(AssetIdentification2 value) {
        this.asstId = value;
        return this;
    }

    /**
     * Gets the value of the ptyData property.
     * 
     * @return
     *     possible object is
     *     {@link Party45Choice }
     *     
     */
    public Party45Choice getPtyData() {
        return ptyData;
    }

    /**
     * Sets the value of the ptyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party45Choice }
     *     
     */
    public Financialinstrument78 setPtyData(Party45Choice value) {
        this.ptyData = value;
        return this;
    }

    /**
     * Gets the value of the asstCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstCtry() {
        return asstCtry;
    }

    /**
     * Sets the value of the asstCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Financialinstrument78 setAsstCtry(String value) {
        this.asstCtry = value;
        return this;
    }

    /**
     * Gets the value of the asstValtn property.
     * 
     * @return
     *     possible object is
     *     {@link AssetValuation1 }
     *     
     */
    public AssetValuation1 getAsstValtn() {
        return asstValtn;
    }

    /**
     * Sets the value of the asstValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetValuation1 }
     *     
     */
    public Financialinstrument78 setAsstValtn(AssetValuation1 value) {
        this.asstValtn = value;
        return this;
    }

    /**
     * Gets the value of the derivInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument7 }
     *     
     */
    public DerivativeInstrument7 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Sets the value of the derivInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument7 }
     *     
     */
    public Financialinstrument78 setDerivInstrmAttrbts(DerivativeInstrument7 value) {
        this.derivInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the collData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument74 }
     * 
     * 
     */
    public List<FinancialInstrument74> getCollData() {
        if (collData == null) {
            collData = new ArrayList<FinancialInstrument74>();
        }
        return this.collData;
    }

    /**
     * Gets the value of the fincgUndrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingUnderlyingType1Code }
     *     
     */
    public FinancingUnderlyingType1Code getFincgUndrlygTp() {
        return fincgUndrlygTp;
    }

    /**
     * Sets the value of the fincgUndrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingUnderlyingType1Code }
     *     
     */
    public Financialinstrument78 setFincgUndrlygTp(FinancingUnderlyingType1Code value) {
        this.fincgUndrlygTp = value;
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
     * Adds a new item to the collData list.
     * @see #getCollData()
     * 
     */
    public Financialinstrument78 addCollData(FinancialInstrument74 collData) {
        getCollData().add(collData);
        return this;
    }

}
