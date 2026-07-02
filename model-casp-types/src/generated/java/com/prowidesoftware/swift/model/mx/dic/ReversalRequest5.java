
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Data to request a reversal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalRequest5", propOrder = {
    "rvslTx",
    "lltyData",
    "rvslRsn",
    "rvsdAmt",
    "cstmrOrdr"
})
public class ReversalRequest5 {

    @XmlElement(name = "RvslTx")
    protected CardPaymentTransaction127 rvslTx;
    @XmlElement(name = "LltyData")
    protected List<LoyaltyRequestData3> lltyData;
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
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getRvslTx() {
        return rvslTx;
    }

    /**
     * Sets the value of the rvslTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public ReversalRequest5 setRvslTx(CardPaymentTransaction127 value) {
        this.rvslTx = value;
        return this;
    }

    /**
     * Gets the value of the lltyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lltyData property.
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
     * {@link LoyaltyRequestData3 }
     * 
     * 
     */
    public List<LoyaltyRequestData3> getLltyData() {
        if (lltyData == null) {
            lltyData = new ArrayList<LoyaltyRequestData3>();
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
    public ReversalRequest5 setRvslRsn(ReversalReason1Code value) {
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
    public ReversalRequest5 setRvsdAmt(BigDecimal value) {
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
    public ReversalRequest5 setCstmrOrdr(CustomerOrder1 value) {
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
    public ReversalRequest5 addLltyData(LoyaltyRequestData3 lltyData) {
        getLltyData().add(lltyData);
        return this;
    }

}
