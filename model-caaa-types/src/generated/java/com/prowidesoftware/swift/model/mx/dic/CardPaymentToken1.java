
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
 * Payment token information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentToken1", propOrder = {
    "tknChrtc",
    "tknRqstr"
})
public class CardPaymentToken1 {

    @XmlElement(name = "TknChrtc")
    protected List<String> tknChrtc;
    @XmlElement(name = "TknRqstr")
    protected PaymentTokenIdentifiers1 tknRqstr;

    /**
     * Gets the value of the tknChrtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tknChrtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTknChrtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTknChrtc() {
        if (tknChrtc == null) {
            tknChrtc = new ArrayList<String>();
        }
        return this.tknChrtc;
    }

    /**
     * Gets the value of the tknRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public PaymentTokenIdentifiers1 getTknRqstr() {
        return tknRqstr;
    }

    /**
     * Sets the value of the tknRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public CardPaymentToken1 setTknRqstr(PaymentTokenIdentifiers1 value) {
        this.tknRqstr = value;
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
     * Adds a new item to the tknChrtc list.
     * @see #getTknChrtc()
     * 
     */
    public CardPaymentToken1 addTknChrtc(String tknChrtc) {
        getTknChrtc().add(tknChrtc);
        return this;
    }

}
