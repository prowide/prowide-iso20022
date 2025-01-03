
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides information about the type of election advice and linked messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectionAdviceFunction1", propOrder = {
    "elctnTp",
    "prvsAgtCAElctnAdvcId",
    "agtCAElctnStsAdvcId",
    "agtCAElctnAmdmntReqId"
})
public class ElectionAdviceFunction1 {

    @XmlElement(name = "ElctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ElectionType1Code elctnTp;
    @XmlElement(name = "PrvsAgtCAElctnAdvcId")
    protected DocumentIdentification8 prvsAgtCAElctnAdvcId;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAElctnAmdmntReqId")
    protected DocumentIdentification8 agtCAElctnAmdmntReqId;

    /**
     * Gets the value of the elctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionType1Code }
     *     
     */
    public ElectionType1Code getElctnTp() {
        return elctnTp;
    }

    /**
     * Sets the value of the elctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionType1Code }
     *     
     */
    public ElectionAdviceFunction1 setElctnTp(ElectionType1Code value) {
        this.elctnTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsAgtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getPrvsAgtCAElctnAdvcId() {
        return prvsAgtCAElctnAdvcId;
    }

    /**
     * Sets the value of the prvsAgtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public ElectionAdviceFunction1 setPrvsAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.prvsAgtCAElctnAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public ElectionAdviceFunction1 setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAmdmntReqId() {
        return agtCAElctnAmdmntReqId;
    }

    /**
     * Sets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public ElectionAdviceFunction1 setAgtCAElctnAmdmntReqId(DocumentIdentification8 value) {
        this.agtCAElctnAmdmntReqId = value;
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
