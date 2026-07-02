
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General information about the reason of the rejection.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason2", propOrder = {
    "rjctgPtyRsn",
    "rjctnDtTm",
    "errLctn",
    "rsnDesc",
    "addtlData"
})
public class RejectionReason2 {

    @XmlElement(name = "RjctgPtyRsn", required = true)
    protected String rjctgPtyRsn;
    @XmlElement(name = "RjctnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rjctnDtTm;
    @XmlElement(name = "ErrLctn")
    protected String errLctn;
    @XmlElement(name = "RsnDesc")
    protected String rsnDesc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the rjctgPtyRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctgPtyRsn() {
        return rjctgPtyRsn;
    }

    /**
     * Sets the value of the rjctgPtyRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason2 setRjctgPtyRsn(String value) {
        this.rjctgPtyRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRjctnDtTm() {
        return rjctnDtTm;
    }

    /**
     * Sets the value of the rjctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason2 setRjctnDtTm(XMLGregorianCalendar value) {
        this.rjctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the errLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrLctn() {
        return errLctn;
    }

    /**
     * Sets the value of the errLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason2 setErrLctn(String value) {
        this.errLctn = value;
        return this;
    }

    /**
     * Gets the value of the rsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnDesc() {
        return rsnDesc;
    }

    /**
     * Sets the value of the rsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason2 setRsnDesc(String value) {
        this.rsnDesc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason2 setAddtlData(String value) {
        this.addtlData = value;
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
