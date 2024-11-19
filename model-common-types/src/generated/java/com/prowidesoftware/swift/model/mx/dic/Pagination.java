
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
 * Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination", propOrder = {
    "pgNb",
    "lastPgInd"
})
public class Pagination {

    @XmlElement(name = "PgNb", required = true)
    protected String pgNb;
    @XmlElement(name = "LastPgInd")
    protected boolean lastPgInd;

    /**
     * Gets the value of the pgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgNb() {
        return pgNb;
    }

    /**
     * Sets the value of the pgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Pagination setPgNb(String value) {
        this.pgNb = value;
        return this;
    }

    /**
     * Gets the value of the lastPgInd property.
     * 
     */
    public boolean isLastPgInd() {
        return lastPgInd;
    }

    /**
     * Sets the value of the lastPgInd property.
     * 
     */
    public Pagination setLastPgInd(boolean value) {
        this.lastPgInd = value;
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
