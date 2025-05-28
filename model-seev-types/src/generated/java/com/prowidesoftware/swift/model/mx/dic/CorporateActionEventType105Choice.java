
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
 * Choice between a corporate event type or an extended corporate event type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventType105Choice", propOrder = {
    "plainCorpEvtTp",
    "xtndedCorpEvtTp"
})
public class CorporateActionEventType105Choice {

    @XmlElement(name = "PlainCorpEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionEventType35Code plainCorpEvtTp;
    @XmlElement(name = "XtndedCorpEvtTp")
    @XmlSchemaType(name = "string")
    protected ExtendedEventType7Code xtndedCorpEvtTp;

    /**
     * Gets the value of the plainCorpEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType35Code }
     *     
     */
    public CorporateActionEventType35Code getPlainCorpEvtTp() {
        return plainCorpEvtTp;
    }

    /**
     * Sets the value of the plainCorpEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType35Code }
     *     
     */
    public CorporateActionEventType105Choice setPlainCorpEvtTp(CorporateActionEventType35Code value) {
        this.plainCorpEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCorpEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEventType7Code }
     *     
     */
    public ExtendedEventType7Code getXtndedCorpEvtTp() {
        return xtndedCorpEvtTp;
    }

    /**
     * Sets the value of the xtndedCorpEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEventType7Code }
     *     
     */
    public CorporateActionEventType105Choice setXtndedCorpEvtTp(ExtendedEventType7Code value) {
        this.xtndedCorpEvtTp = value;
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
