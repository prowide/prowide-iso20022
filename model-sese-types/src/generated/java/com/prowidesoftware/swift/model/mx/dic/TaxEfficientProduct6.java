
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
 * Characteristics of a tax efficient product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxEfficientProduct6", propOrder = {
    "taxEffcntPdctTp",
    "curYr",
    "cshCmpntInd",
    "prvsYrs",
    "curYrSbcptDtls",
    "addtlInf"
})
public class TaxEfficientProduct6 {

    @XmlElement(name = "TaxEffcntPdctTp", required = true)
    protected TaxEfficientProductType2Choice taxEffcntPdctTp;
    @XmlElement(name = "CurYr")
    protected Boolean curYr;
    @XmlElement(name = "CshCmpntInd")
    protected Boolean cshCmpntInd;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear4 prvsYrs;
    @XmlElement(name = "CurYrSbcptDtls")
    protected SubscriptionInformation2 curYrSbcptDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the taxEffcntPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public TaxEfficientProductType2Choice getTaxEffcntPdctTp() {
        return taxEffcntPdctTp;
    }

    /**
     * Sets the value of the taxEffcntPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public TaxEfficientProduct6 setTaxEffcntPdctTp(TaxEfficientProductType2Choice value) {
        this.taxEffcntPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the curYr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurYr() {
        return curYr;
    }

    /**
     * Sets the value of the curYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TaxEfficientProduct6 setCurYr(Boolean value) {
        this.curYr = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TaxEfficientProduct6 setCshCmpntInd(Boolean value) {
        this.cshCmpntInd = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear4 }
     *     
     */
    public PreviousYear4 getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear4 }
     *     
     */
    public TaxEfficientProduct6 setPrvsYrs(PreviousYear4 value) {
        this.prvsYrs = value;
        return this;
    }

    /**
     * Gets the value of the curYrSbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public SubscriptionInformation2 getCurYrSbcptDtls() {
        return curYrSbcptDtls;
    }

    /**
     * Sets the value of the curYrSbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public TaxEfficientProduct6 setCurYrSbcptDtls(SubscriptionInformation2 value) {
        this.curYrSbcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TaxEfficientProduct6 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
