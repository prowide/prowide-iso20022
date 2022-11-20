
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
 * Defines the account to or from which a securities entry is made and the usage type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuanceAccount2", propOrder = {
    "issncAcct",
    "pmryAcctInd"
})
public class IssuanceAccount2 {

    @XmlElement(name = "IssncAcct", required = true)
    protected SecuritiesAccount19 issncAcct;
    @XmlElement(name = "PmryAcctInd")
    protected boolean pmryAcctInd;

    /**
     * Gets the value of the issncAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getIssncAcct() {
        return issncAcct;
    }

    /**
     * Sets the value of the issncAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public IssuanceAccount2 setIssncAcct(SecuritiesAccount19 value) {
        this.issncAcct = value;
        return this;
    }

    /**
     * Gets the value of the pmryAcctInd property.
     * 
     */
    public boolean isPmryAcctInd() {
        return pmryAcctInd;
    }

    /**
     * Sets the value of the pmryAcctInd property.
     * 
     */
    public IssuanceAccount2 setPmryAcctInd(boolean value) {
        this.pmryAcctInd = value;
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
