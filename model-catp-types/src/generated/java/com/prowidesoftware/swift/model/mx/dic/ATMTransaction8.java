
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Preferred withdrawal transaction chosen by the the customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction8", propOrder = {
    "amt",
    "ccy",
    "rctFlg",
    "balPrtFlg",
    "mixTp",
    "mix"
})
public class ATMTransaction8 {

    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "RctFlg")
    protected Boolean rctFlg;
    @XmlElement(name = "BalPrtFlg")
    protected Boolean balPrtFlg;
    @XmlElement(name = "MixTp")
    protected String mixTp;
    @XmlElement(name = "Mix")
    protected List<ATMMediaMix2> mix;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransaction8 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction8 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the rctFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctFlg() {
        return rctFlg;
    }

    /**
     * Sets the value of the rctFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction8 setRctFlg(Boolean value) {
        this.rctFlg = value;
        return this;
    }

    /**
     * Gets the value of the balPrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalPrtFlg() {
        return balPrtFlg;
    }

    /**
     * Sets the value of the balPrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction8 setBalPrtFlg(Boolean value) {
        this.balPrtFlg = value;
        return this;
    }

    /**
     * Gets the value of the mixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixTp() {
        return mixTp;
    }

    /**
     * Sets the value of the mixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction8 setMixTp(String value) {
        this.mixTp = value;
        return this;
    }

    /**
     * Gets the value of the mix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix2 }
     * 
     * 
     */
    public List<ATMMediaMix2> getMix() {
        if (mix == null) {
            mix = new ArrayList<ATMMediaMix2>();
        }
        return this.mix;
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
     * Adds a new item to the mix list.
     * @see #getMix()
     * 
     */
    public ATMTransaction8 addMix(ATMMediaMix2 mix) {
        getMix().add(mix);
        return this;
    }

}
