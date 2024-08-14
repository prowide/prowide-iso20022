
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
 * Data required to request a Payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRequest2", propOrder = {
    "pmtTx",
    "lltyData"
})
public class PaymentRequest2 {

    @XmlElement(name = "PmtTx")
    protected CardPaymentTransaction100 pmtTx;
    @XmlElement(name = "LltyData")
    protected List<LoyaltyRequestData2> lltyData;

    /**
     * Gets the value of the pmtTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public CardPaymentTransaction100 getPmtTx() {
        return pmtTx;
    }

    /**
     * Sets the value of the pmtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public PaymentRequest2 setPmtTx(CardPaymentTransaction100 value) {
        this.pmtTx = value;
        return this;
    }

    /**
     * Gets the value of the lltyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRequestData2 }
     * 
     * 
     * @return
     *     The value of the lltyData property.
     */
    public List<LoyaltyRequestData2> getLltyData() {
        if (lltyData == null) {
            lltyData = new ArrayList<>();
        }
        return this.lltyData;
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
     * Adds a new item to the lltyData list.
     * @see #getLltyData()
     * 
     */
    public PaymentRequest2 addLltyData(LoyaltyRequestData2 lltyData) {
        getLltyData().add(lltyData);
        return this;
    }

}
