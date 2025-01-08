
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a corporate action identification or a corporate action official identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventReference2Choice", propOrder = {
    "lkdOffclCorpActnEvtId",
    "lkdCorpActnId"
})
public class CorporateActionEventReference2Choice {

    @XmlElement(name = "LkdOffclCorpActnEvtId")
    protected String lkdOffclCorpActnEvtId;
    @XmlElement(name = "LkdCorpActnId")
    protected String lkdCorpActnId;

    /**
     * Gets the value of the lkdOffclCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdOffclCorpActnEvtId() {
        return lkdOffclCorpActnEvtId;
    }

    /**
     * Sets the value of the lkdOffclCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionEventReference2Choice setLkdOffclCorpActnEvtId(String value) {
        this.lkdOffclCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the lkdCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnId() {
        return lkdCorpActnId;
    }

    /**
     * Sets the value of the lkdCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionEventReference2Choice setLkdCorpActnId(String value) {
        this.lkdCorpActnId = value;
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
