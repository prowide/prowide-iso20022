
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
 * Previous employment information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentDetails1", propOrder = {
    "taxCd",
    "othrTaxCdInd",
    "cmltvTaxInd",
    "prvsPay",
    "prvsTax",
    "startDt",
    "endDt",
    "addtlInf"
})
public class EmploymentDetails1 {

    @XmlElement(name = "TaxCd")
    protected GenericIdentification36 taxCd;
    @XmlElement(name = "OthrTaxCdInd")
    protected Boolean othrTaxCdInd;
    @XmlElement(name = "CmltvTaxInd")
    protected Boolean cmltvTaxInd;
    @XmlElement(name = "PrvsPay")
    protected ActiveCurrencyAndAmount prvsPay;
    @XmlElement(name = "PrvsTax")
    protected ActiveCurrencyAndAmount prvsTax;
    @XmlElement(name = "StartDt")
    protected DateFormat42Choice startDt;
    @XmlElement(name = "EndDt")
    protected DateFormat42Choice endDt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the taxCd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getTaxCd() {
        return taxCd;
    }

    /**
     * Sets the value of the taxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public EmploymentDetails1 setTaxCd(GenericIdentification36 value) {
        this.taxCd = value;
        return this;
    }

    /**
     * Gets the value of the othrTaxCdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOthrTaxCdInd() {
        return othrTaxCdInd;
    }

    /**
     * Sets the value of the othrTaxCdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public EmploymentDetails1 setOthrTaxCdInd(Boolean value) {
        this.othrTaxCdInd = value;
        return this;
    }

    /**
     * Gets the value of the cmltvTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmltvTaxInd() {
        return cmltvTaxInd;
    }

    /**
     * Sets the value of the cmltvTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public EmploymentDetails1 setCmltvTaxInd(Boolean value) {
        this.cmltvTaxInd = value;
        return this;
    }

    /**
     * Gets the value of the prvsPay property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsPay() {
        return prvsPay;
    }

    /**
     * Sets the value of the prvsPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public EmploymentDetails1 setPrvsPay(ActiveCurrencyAndAmount value) {
        this.prvsPay = value;
        return this;
    }

    /**
     * Gets the value of the prvsTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsTax() {
        return prvsTax;
    }

    /**
     * Sets the value of the prvsTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public EmploymentDetails1 setPrvsTax(ActiveCurrencyAndAmount value) {
        this.prvsTax = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public EmploymentDetails1 setStartDt(DateFormat42Choice value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public EmploymentDetails1 setEndDt(DateFormat42Choice value) {
        this.endDt = value;
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
    public EmploymentDetails1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
