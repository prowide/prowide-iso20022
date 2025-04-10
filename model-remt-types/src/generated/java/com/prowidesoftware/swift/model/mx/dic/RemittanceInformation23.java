
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
 * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformation23", propOrder = {
    "rmtId",
    "ustrd",
    "strd",
    "orgnlPmtInf"
})
public class RemittanceInformation23 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "Ustrd")
    protected List<String> ustrd;
    @XmlElement(name = "Strd")
    protected List<StructuredRemittanceInformation18> strd;
    @XmlElement(name = "OrgnlPmtInf", required = true)
    protected OriginalPaymentInformation10 orgnlPmtInf;

    /**
     * Gets the value of the rmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Sets the value of the rmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RemittanceInformation23 setRmtId(String value) {
        this.rmtId = value;
        return this;
    }

    /**
     * Gets the value of the ustrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ustrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUstrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUstrd() {
        if (ustrd == null) {
            ustrd = new ArrayList<String>();
        }
        return this.ustrd;
    }

    /**
     * Gets the value of the strd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRemittanceInformation18 }
     * 
     * 
     */
    public List<StructuredRemittanceInformation18> getStrd() {
        if (strd == null) {
            strd = new ArrayList<StructuredRemittanceInformation18>();
        }
        return this.strd;
    }

    /**
     * Gets the value of the orgnlPmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPaymentInformation10 }
     *     
     */
    public OriginalPaymentInformation10 getOrgnlPmtInf() {
        return orgnlPmtInf;
    }

    /**
     * Sets the value of the orgnlPmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPaymentInformation10 }
     *     
     */
    public RemittanceInformation23 setOrgnlPmtInf(OriginalPaymentInformation10 value) {
        this.orgnlPmtInf = value;
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
     * Adds a new item to the ustrd list.
     * @see #getUstrd()
     * 
     */
    public RemittanceInformation23 addUstrd(String ustrd) {
        getUstrd().add(ustrd);
        return this;
    }

    /**
     * Adds a new item to the strd list.
     * @see #getStrd()
     * 
     */
    public RemittanceInformation23 addStrd(StructuredRemittanceInformation18 strd) {
        getStrd().add(strd);
        return this;
    }

}
