
package com.prowidesoftware.swift.model.mx.dic;

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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceInformation2", propOrder = {
    "qty",
    "subBalTp",
    "xtndedSubBalTp",
    "addtlBalBrkdwnDtls"
})
public class SubBalanceInformation2 {

    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity1Choice qty;
    @XmlElement(name = "SubBalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesBalanceType1Code subBalTp;
    @XmlElement(name = "XtndedSubBalTp")
    protected String xtndedSubBalTp;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation2> addtlBalBrkdwnDtls;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public SubBalanceQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity1Choice }
     *     
     */
    public SubBalanceInformation2 setQty(SubBalanceQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType1Code }
     *     
     */
    public SecuritiesBalanceType1Code getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType1Code }
     *     
     */
    public SubBalanceInformation2 setSubBalTp(SecuritiesBalanceType1Code value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedSubBalTp() {
        return xtndedSubBalTp;
    }

    /**
     * Sets the value of the xtndedSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubBalanceInformation2 setXtndedSubBalTp(String value) {
        this.xtndedSubBalTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation2 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwnDtls property.
     */
    public List<AdditionalBalanceInformation2> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<>();
        }
        return this.addtlBalBrkdwnDtls;
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
     * Adds a new item to the addtlBalBrkdwnDtls list.
     * @see #getAddtlBalBrkdwnDtls()
     * 
     */
    public SubBalanceInformation2 addAddtlBalBrkdwnDtls(AdditionalBalanceInformation2 addtlBalBrkdwnDtls) {
        getAddtlBalBrkdwnDtls().add(addtlBalBrkdwnDtls);
        return this;
    }

}
