
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Response of a requested service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType2", propOrder = {
    "rslt",
    "rsltDtls",
    "addtlRsltInf"
})
public class ResponseType2 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected Response3Code rslt;
    @XmlElement(name = "RsltDtls")
    @XmlSchemaType(name = "string")
    protected ResultDetail1Code rsltDtls;
    @XmlElement(name = "AddtlRsltInf")
    protected String addtlRsltInf;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Response3Code }
     *     
     */
    public Response3Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response3Code }
     *     
     */
    public ResponseType2 setRslt(Response3Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail1Code }
     *     
     */
    public ResultDetail1Code getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Sets the value of the rsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail1Code }
     *     
     */
    public ResponseType2 setRsltDtls(ResultDetail1Code value) {
        this.rsltDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsltInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsltInf() {
        return addtlRsltInf;
    }

    /**
     * Sets the value of the addtlRsltInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponseType2 setAddtlRsltInf(String value) {
        this.addtlRsltInf = value;
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
