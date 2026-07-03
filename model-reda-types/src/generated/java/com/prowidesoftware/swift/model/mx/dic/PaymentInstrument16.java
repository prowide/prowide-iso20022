
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
 * Payment instrument for a type of order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument16", propOrder = {
    "ordrTp",
    "instrmTp",
    "addtlInf"
})
public class PaymentInstrument16 {

    @XmlElement(name = "OrdrTp", required = true)
    protected FundOrderType5Choice ordrTp;
    @XmlElement(name = "InstrmTp", required = true)
    protected FundPaymentType1Choice instrmTp;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderType5Choice }
     *     
     */
    public FundOrderType5Choice getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderType5Choice }
     *     
     */
    public PaymentInstrument16 setOrdrTp(FundOrderType5Choice value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the instrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundPaymentType1Choice }
     *     
     */
    public FundPaymentType1Choice getInstrmTp() {
        return instrmTp;
    }

    /**
     * Sets the value of the instrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPaymentType1Choice }
     *     
     */
    public PaymentInstrument16 setInstrmTp(FundPaymentType1Choice value) {
        this.instrmTp = value;
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
    public PaymentInstrument16 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
