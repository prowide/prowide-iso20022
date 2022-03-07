
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
 * Expected trade date and expected settlement date of the order execution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedExecutionDetails4", propOrder = {
    "xpctdTradDtTm",
    "xpctdCshSttlmDt"
})
public class ExpectedExecutionDetails4 {

    @XmlElement(name = "XpctdTradDtTm")
    protected DateAndDateTimeChoice xpctdTradDtTm;
    @XmlElement(name = "XpctdCshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdCshSttlmDt;

    /**
     * Gets the value of the xpctdTradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpctdTradDtTm() {
        return xpctdTradDtTm;
    }

    /**
     * Sets the value of the xpctdTradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ExpectedExecutionDetails4 setXpctdTradDtTm(DateAndDateTimeChoice value) {
        this.xpctdTradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xpctdCshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpctdCshSttlmDt() {
        return xpctdCshSttlmDt;
    }

    /**
     * Sets the value of the xpctdCshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExpectedExecutionDetails4 setXpctdCshSttlmDt(XMLGregorianCalendar value) {
        this.xpctdCshSttlmDt = value;
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
