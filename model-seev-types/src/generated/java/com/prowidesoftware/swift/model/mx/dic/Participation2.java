
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the level of participation to a shareholders meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participation2", propOrder = {
    "ttlNbOfVtngRghts",
    "pctgOfVtngRghts",
    "ttlNbOfSctiesOutsdng",
    "clctnDt"
})
public class Participation2 {

    @XmlElement(name = "TtlNbOfVtngRghts")
    protected BigDecimal ttlNbOfVtngRghts;
    @XmlElement(name = "PctgOfVtngRghts")
    protected BigDecimal pctgOfVtngRghts;
    @XmlElement(name = "TtlNbOfSctiesOutsdng")
    protected CurrencyAndAmount ttlNbOfSctiesOutsdng;
    @XmlElement(name = "ClctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;

    /**
     * Gets the value of the ttlNbOfVtngRghts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfVtngRghts() {
        return ttlNbOfVtngRghts;
    }

    /**
     * Sets the value of the ttlNbOfVtngRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Participation2 setTtlNbOfVtngRghts(BigDecimal value) {
        this.ttlNbOfVtngRghts = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfVtngRghts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfVtngRghts() {
        return pctgOfVtngRghts;
    }

    /**
     * Sets the value of the pctgOfVtngRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Participation2 setPctgOfVtngRghts(BigDecimal value) {
        this.pctgOfVtngRghts = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNbOfSctiesOutsdng() {
        return ttlNbOfSctiesOutsdng;
    }

    /**
     * Sets the value of the ttlNbOfSctiesOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public Participation2 setTtlNbOfSctiesOutsdng(CurrencyAndAmount value) {
        this.ttlNbOfSctiesOutsdng = value;
        return this;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Participation2 setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
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
