
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the document entry amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentEntryAmendment1", propOrder = {
    "crrctgNtryNb",
    "orgnlDoc"
})
public class DocumentEntryAmendment1 {

    @XmlElement(name = "CrrctgNtryNb", required = true)
    protected BigDecimal crrctgNtryNb;
    @XmlElement(name = "OrgnlDoc", required = true)
    protected DocumentIdentification28 orgnlDoc;

    /**
     * Gets the value of the crrctgNtryNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrrctgNtryNb() {
        return crrctgNtryNb;
    }

    /**
     * Sets the value of the crrctgNtryNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DocumentEntryAmendment1 setCrrctgNtryNb(BigDecimal value) {
        this.crrctgNtryNb = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getOrgnlDoc() {
        return orgnlDoc;
    }

    /**
     * Sets the value of the orgnlDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentEntryAmendment1 setOrgnlDoc(DocumentIdentification28 value) {
        this.orgnlDoc = value;
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
