
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between head member or subordinate member identifiers of liquidity pool. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityPoolMembers1Choice", propOrder = {
    "headMmbDtls",
    "subrdntMmbDtls"
})
public class LiquidityPoolMembers1Choice {

    @XmlElement(name = "HeadMmbDtls")
    protected AccountOwnerAndIdentification1 headMmbDtls;
    @XmlElement(name = "SubrdntMmbDtls")
    protected AccountOwnerAndIdentificationList1 subrdntMmbDtls;

    /**
     * Gets the value of the headMmbDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnerAndIdentification1 }
     *     
     */
    public AccountOwnerAndIdentification1 getHeadMmbDtls() {
        return headMmbDtls;
    }

    /**
     * Sets the value of the headMmbDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnerAndIdentification1 }
     *     
     */
    public LiquidityPoolMembers1Choice setHeadMmbDtls(AccountOwnerAndIdentification1 value) {
        this.headMmbDtls = value;
        return this;
    }

    /**
     * Gets the value of the subrdntMmbDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnerAndIdentificationList1 }
     *     
     */
    public AccountOwnerAndIdentificationList1 getSubrdntMmbDtls() {
        return subrdntMmbDtls;
    }

    /**
     * Sets the value of the subrdntMmbDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnerAndIdentificationList1 }
     *     
     */
    public LiquidityPoolMembers1Choice setSubrdntMmbDtls(AccountOwnerAndIdentificationList1 value) {
        this.subrdntMmbDtls = value;
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

}
