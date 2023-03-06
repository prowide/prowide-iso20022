
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
 * Scope
 * The CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.
 * Usage
 * The CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.
 * The CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.
 * The CustomerPaymentReversal message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPaymentReversalV02", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "orgnlPmtInfAndRvsl"
})
public class CustomerPaymentReversalV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader40 grpHdr;
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation22 orgnlGrpInf;
    @XmlElement(name = "OrgnlPmtInfAndRvsl")
    protected List<OriginalPaymentInformation2> orgnlPmtInfAndRvsl;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader40 }
     *     
     */
    public GroupHeader40 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader40 }
     *     
     */
    public CustomerPaymentReversalV02 setGrpHdr(GroupHeader40 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation22 }
     *     
     */
    public OriginalGroupInformation22 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation22 }
     *     
     */
    public CustomerPaymentReversalV02 setOrgnlGrpInf(OriginalGroupInformation22 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfAndRvsl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInfAndRvsl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndRvsl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInformation2 }
     * 
     * 
     */
    public List<OriginalPaymentInformation2> getOrgnlPmtInfAndRvsl() {
        if (orgnlPmtInfAndRvsl == null) {
            orgnlPmtInfAndRvsl = new ArrayList<OriginalPaymentInformation2>();
        }
        return this.orgnlPmtInfAndRvsl;
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
     * Adds a new item to the orgnlPmtInfAndRvsl list.
     * @see #getOrgnlPmtInfAndRvsl()
     * 
     */
    public CustomerPaymentReversalV02 addOrgnlPmtInfAndRvsl(OriginalPaymentInformation2 orgnlPmtInfAndRvsl) {
        getOrgnlPmtInfAndRvsl().add(orgnlPmtInfAndRvsl);
        return this;
    }

}
