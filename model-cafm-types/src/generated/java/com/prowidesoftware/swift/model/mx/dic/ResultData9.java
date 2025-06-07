
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
 * Result of the processing of a file action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultData9", propOrder = {
    "rslt",
    "othrRslt",
    "rsltDtls",
    "othrRsltDtls"
})
public class ResultData9 {

    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected FileActionResult1Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls", required = true)
    protected String rsltDtls;
    @XmlElement(name = "OthrRsltDtls")
    protected String othrRsltDtls;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionResult1Code }
     *     
     */
    public FileActionResult1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionResult1Code }
     *     
     */
    public ResultData9 setRslt(FileActionResult1Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the othrRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Sets the value of the othrRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResultData9 setOthrRslt(String value) {
        this.othrRslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Sets the value of the rsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResultData9 setRsltDtls(String value) {
        this.rsltDtls = value;
        return this;
    }

    /**
     * Gets the value of the othrRsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRsltDtls() {
        return othrRsltDtls;
    }

    /**
     * Sets the value of the othrRsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResultData9 setOthrRsltDtls(String value) {
        this.othrRsltDtls = value;
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
