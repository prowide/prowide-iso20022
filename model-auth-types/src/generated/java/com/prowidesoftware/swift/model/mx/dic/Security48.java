
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "Security48", propOrder = {
    "id",
    "clssfctnTp",
    "qty",
    "nmnlVal",
    "qlty",
    "mtrty",
    "issrId",
    "issrCtry",
    "tp",
    "unitPric",
    "exclsvArrgmnt",
    "mktVal",
    "avlblForCollReuse",
    "hrcutOrMrgn"
})
public class Security48 {

    @XmlElement(name = "Id")
    protected CompareISINIdentifier4 id;
    @XmlElement(name = "ClssfctnTp")
    protected CompareCFIIdentifier3 clssfctnTp;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber3 qty;
    @XmlElement(name = "NmnlVal")
    protected CompareAmountAndDirection2 nmnlVal;
    @XmlElement(name = "Qlty")
    protected CompareCollateralQualityType3 qlty;
    @XmlElement(name = "Mtrty")
    protected CompareDate3 mtrty;
    @XmlElement(name = "IssrId")
    protected CompareOrganisationIdentification6 issrId;
    @XmlElement(name = "IssrCtry")
    protected CompareCountryCode3 issrCtry;
    @XmlElement(name = "Tp")
    protected List<CompareSecuritiesLendingType3> tp;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice6 unitPric;
    @XmlElement(name = "ExclsvArrgmnt")
    protected CompareTrueFalseIndicator3 exclsvArrgmnt;
    @XmlElement(name = "MktVal")
    protected CompareAmountAndDirection2 mktVal;
    @XmlElement(name = "AvlblForCollReuse")
    protected CompareTrueFalseIndicator3 avlblForCollReuse;
    @XmlElement(name = "HrcutOrMrgn")
    protected ComparePercentageRate3 hrcutOrMrgn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public Security48 setId(CompareISINIdentifier4 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public CompareCFIIdentifier3 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public Security48 setClssfctnTp(CompareCFIIdentifier3 value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public Security48 setQty(CompareDecimalNumber3 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public Security48 setNmnlVal(CompareAmountAndDirection2 value) {
        this.nmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralQualityType3 }
     *     
     */
    public CompareCollateralQualityType3 getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralQualityType3 }
     *     
     */
    public Security48 setQlty(CompareCollateralQualityType3 value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public Security48 setMtrty(CompareDate3 value) {
        this.mtrty = value;
        return this;
    }

    /**
     * Gets the value of the issrId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getIssrId() {
        return issrId;
    }

    /**
     * Sets the value of the issrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public Security48 setIssrId(CompareOrganisationIdentification6 value) {
        this.issrId = value;
        return this;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCountryCode3 }
     *     
     */
    public CompareCountryCode3 getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCountryCode3 }
     *     
     */
    public Security48 setIssrCtry(CompareCountryCode3 value) {
        this.issrCtry = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
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
     * {@link CompareSecuritiesLendingType3 }
     * 
     * 
     */
    public List<CompareSecuritiesLendingType3> getTp() {
        if (tp == null) {
            tp = new ArrayList<CompareSecuritiesLendingType3>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public CompareUnitPrice6 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public Security48 setUnitPric(CompareUnitPrice6 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public Security48 setExclsvArrgmnt(CompareTrueFalseIndicator3 value) {
        this.exclsvArrgmnt = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public Security48 setMktVal(CompareAmountAndDirection2 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the avlblForCollReuse property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getAvlblForCollReuse() {
        return avlblForCollReuse;
    }

    /**
     * Sets the value of the avlblForCollReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public Security48 setAvlblForCollReuse(CompareTrueFalseIndicator3 value) {
        this.avlblForCollReuse = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public Security48 setHrcutOrMrgn(ComparePercentageRate3 value) {
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
    public Security48 addTp(CompareSecuritiesLendingType3 tp) {
        getTp().add(tp);
        return this;
    }

}
