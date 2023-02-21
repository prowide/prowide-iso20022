
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information for the presentation of documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation2", propOrder = {
    "presntr",
    "bnfcryPresntnDt"
})
public class Presentation2 {

    @XmlElement(name = "Presntr")
    protected PartyIdentification43 presntr;
    @XmlElement(name = "BnfcryPresntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bnfcryPresntnDt;

    /**
     * Gets the value of the presntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getPresntr() {
        return presntr;
    }

    /**
     * Sets the value of the presntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Presentation2 setPresntr(PartyIdentification43 value) {
        this.presntr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryPresntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getBnfcryPresntnDt() {
        return bnfcryPresntnDt;
    }

    /**
     * Sets the value of the bnfcryPresntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Presentation2 setBnfcryPresntnDt(XMLGregorianCalendar value) {
        this.bnfcryPresntnDt = value;
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
