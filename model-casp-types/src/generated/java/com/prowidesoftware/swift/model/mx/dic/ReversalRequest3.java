
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data to request a Reversal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalRequest3", propOrder = {
    "rvslTx",
    "lltyData",
    "rvslRsn",
    "rvsdAmt",
    "cstmrOrdr"
})
public class ReversalRequest3 {

    @XmlElement(name = "RvslTx")
    protected CardPaymentTransaction110 rvslTx;
    @XmlElement(name = "LltyData")
    protected List<LoyaltyRequestData2> lltyData;
    @XmlElement(name = "RvslRsn", required = true)
    @XmlSchemaType(name = "string")
    protected ReversalReason1Code rvslRsn;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;
    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;

    /**
     * Gets the value of the rvslTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction110 }
     *     
     */
    public CardPaymentTransaction110 getRvslTx() {
        return rvslTx;
    }

    /**
     * Sets the value of the rvslTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction110 }
     *     
     */
    public ReversalRequest3 setRvslTx(CardPaymentTransaction110 value) {
        this.rvslTx = value;
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

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReason1Code }
     *     
     */
    public ReversalReason1Code getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReason1Code }
     *     
     */
    public ReversalRequest3 setRvslRsn(ReversalReason1Code value) {
        this.rvslRsn = value;
        return this;
    }

    /**
     * Gets the value of the rvsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvsdAmt() {
        return rvsdAmt;
    }

    /**
     * Sets the value of the rvsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReversalRequest3 setRvsdAmt(BigDecimal value) {
        this.rvsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public ReversalRequest3 setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
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
     * Adds a new item to the lltyData list.
     * @see #getLltyData()
     * 
     */
    public ReversalRequest3 addLltyData(LoyaltyRequestData2 lltyData) {
        getLltyData().add(lltyData);
        return this;
    }

}
