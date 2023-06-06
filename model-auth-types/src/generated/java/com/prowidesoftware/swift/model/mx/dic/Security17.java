
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data specific to securities being subject to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security17", propOrder = {
    "id",
    "clssfctnTp",
    "qty",
    "nmnlVal",
    "qlty",
    "mtrty",
    "issrIdr",
    "issrCtry",
    "tp",
    "unitPric",
    "exclsvArrgmnt",
    "mktVal",
    "avlblForReuse",
    "hrcutOrMrgn"
})
public class Security17 {

    @XmlElement(name = "Id")
    protected CompareISINIdentifier2 id;
    @XmlElement(name = "ClssfctnTp")
    protected CompareCFIIdentifier2 clssfctnTp;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber2 qty;
    @XmlElement(name = "NmnlVal")
    protected CompareAmountAndDirection1 nmnlVal;
    @XmlElement(name = "Qlty")
    protected CompareCollateralQualityType2 qlty;
    @XmlElement(name = "Mtrty")
    protected CompareDate2 mtrty;
    @XmlElement(name = "IssrIdr")
    protected CompareOrganisationIdentification1 issrIdr;
    @XmlElement(name = "IssrCtry")
    protected CompareCountryCode2 issrCtry;
    @XmlElement(name = "Tp")
    protected List<CompareSecuritiesLendingType2> tp;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice3 unitPric;
    @XmlElement(name = "ExclsvArrgmnt")
    protected CompareTrueFalseIndicator2 exclsvArrgmnt;
    @XmlElement(name = "MktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount2 mktVal;
    @XmlElement(name = "AvlblForReuse")
    protected CompareTrueFalseIndicator2 avlblForReuse;
    @XmlElement(name = "HrcutOrMrgn")
    protected ComparePercentageRate2 hrcutOrMrgn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public CompareISINIdentifier2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public Security17 setId(CompareISINIdentifier2 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier2 }
     *     
     */
    public CompareCFIIdentifier2 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier2 }
     *     
     */
    public Security17 setClssfctnTp(CompareCFIIdentifier2 value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber2 }
     *     
     */
    public CompareDecimalNumber2 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber2 }
     *     
     */
    public Security17 setQty(CompareDecimalNumber2 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareAmountAndDirection1 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public Security17 setNmnlVal(CompareAmountAndDirection1 value) {
        this.nmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralQualityType2 }
     *     
     */
    public CompareCollateralQualityType2 getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralQualityType2 }
     *     
     */
    public Security17 setQlty(CompareCollateralQualityType2 value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public Security17 setMtrty(CompareDate2 value) {
        this.mtrty = value;
        return this;
    }

    /**
     * Gets the value of the issrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CompareOrganisationIdentification1 getIssrIdr() {
        return issrIdr;
    }

    /**
     * Sets the value of the issrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public Security17 setIssrIdr(CompareOrganisationIdentification1 value) {
        this.issrIdr = value;
        return this;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCountryCode2 }
     *     
     */
    public CompareCountryCode2 getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCountryCode2 }
     *     
     */
    public Security17 setIssrCtry(CompareCountryCode2 value) {
        this.issrCtry = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareSecuritiesLendingType2 }
     * 
     * 
     * @return
     *     The value of the tp property.
     */
    public List<CompareSecuritiesLendingType2> getTp() {
        if (tp == null) {
            tp = new ArrayList<>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice3 }
     *     
     */
    public CompareUnitPrice3 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice3 }
     *     
     */
    public Security17 setUnitPric(CompareUnitPrice3 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public Security17 setExclsvArrgmnt(CompareTrueFalseIndicator2 value) {
        this.exclsvArrgmnt = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public Security17 setMktVal(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the avlblForReuse property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getAvlblForReuse() {
        return avlblForReuse;
    }

    /**
     * Sets the value of the avlblForReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public Security17 setAvlblForReuse(CompareTrueFalseIndicator2 value) {
        this.avlblForReuse = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public Security17 setHrcutOrMrgn(ComparePercentageRate2 value) {
        this.hrcutOrMrgn = value;
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
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public Security17 addTp(CompareSecuritiesLendingType2 tp) {
        getTp().add(tp);
        return this;
    }

}
