
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of either the last payment date or the number of payments to make. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPoint1Choice", propOrder = {
    "nbOfPmts",
    "lastPmtDt"
})
public class EndPoint1Choice {

    @XmlElement(name = "NbOfPmts")
    protected String nbOfPmts;
    @XmlElement(name = "LastPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPmtDt;

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EndPoint1Choice setNbOfPmts(String value) {
        this.nbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EndPoint1Choice setLastPmtDt(XMLGregorianCalendar value) {
        this.lastPmtDt = value;
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
