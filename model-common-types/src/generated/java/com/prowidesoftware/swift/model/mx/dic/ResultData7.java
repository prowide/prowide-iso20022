
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Result of the processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultData7", propOrder = {
    "rslt",
    "othrRslt",
    "rsltDtls",
    "othrRsltDtls",
    "tempScrCardDataReusePrtd",
    "addtlRsltInf"
})
public class ResultData7 {

    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Response8Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls", required = true)
    protected String rsltDtls;
    @XmlElement(name = "OthrRsltDtls")
    protected String othrRsltDtls;
    @XmlElement(name = "TempScrCardDataReusePrtd")
    protected Boolean tempScrCardDataReusePrtd;
    @XmlElement(name = "AddtlRsltInf")
    protected List<AdditionalData1> addtlRsltInf;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Response8Code }
     *     
     */
    public Response8Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response8Code }
     *     
     */
    public ResultData7 setRslt(Response8Code value) {
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
    public ResultData7 setOthrRslt(String value) {
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
    public ResultData7 setRsltDtls(String value) {
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
    public ResultData7 setOthrRsltDtls(String value) {
        this.othrRsltDtls = value;
        return this;
    }

    /**
     * Gets the value of the tempScrCardDataReusePrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusePrtd() {
        return tempScrCardDataReusePrtd;
    }

    /**
     * Sets the value of the tempScrCardDataReusePrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ResultData7 setTempScrCardDataReusePrtd(Boolean value) {
        this.tempScrCardDataReusePrtd = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsltInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRsltInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRsltInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlRsltInf() {
        if (addtlRsltInf == null) {
            addtlRsltInf = new ArrayList<AdditionalData1>();
        }
        return this.addtlRsltInf;
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

    /**
     * Adds a new item to the addtlRsltInf list.
     * @see #getAddtlRsltInf()
     * 
     */
    public ResultData7 addAddtlRsltInf(AdditionalData1 addtlRsltInf) {
        getAddtlRsltInf().add(addtlRsltInf);
        return this;
    }

}
